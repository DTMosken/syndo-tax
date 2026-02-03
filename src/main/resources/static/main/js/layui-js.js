// layui扩展插件
layui.config({
	base: ctx + 'ajax/libs/layui/extend/'
});

var table = {
	config: {},
	// 当前实例配置
	options: {},
	// 设置实例配置
	set: function(id) {
		if ($.common.getLength(table.config) > 1) {
			var tableId = $.common.isEmpty(id) ? $(event.currentTarget).parents(".layui-card-body").find(".layui-table-view").attr("lay-id") : id;
			if ($.common.isNotEmpty(tableId)) {
				table.options = table.get(tableId);
			}
		}
	},
	// 获取实例配置
	get: function(id) {
		return table.config[id];
	}
};

(function($) {
	$.extend({
		// 数据表格
		table: {
			init: function(options) {
				var defaults = {
					id: 'layui-table',
					type: 'lt',
					title: '数据表格',
					data: [],
					where: $.table.where(),
					height: 'full-65',
					even: false,
					size: 'sm',
					parseData: undefined,
					request: undefined,
					totalRow: false,
					page: true,
					limit: 50,
					limits: [20, 50, 100],
					toolbar: false,
					defaultToolbar: ['filter', 'print', 'exports'],
					bottomToolbar: ['filter', 'print'],
					done: undefined
				};
				var options = $.extend(defaults, options);
				table.options = options;
				// 存在导出地址则显示导出按钮
				if (!$.common.isEmpty(options.exportUrl)) {
					options.bottomToolbar.push({title: '导出', layEvent: 'expExcel', icon: 'layui-icon-export'})
				}
				table.config[options.id] = options;
				$.table.initEvent();
				layui.use(['table'], function() {
					var _table = layui.table;
					_table.render({
						id: options.id,
						elem: '#' + options.id,
						url: options.url,
						data: options.data,
						method: 'post',
						title: options.title,
						where: options.where,
						height: options.height,
						even: options.even,
						size: options.size,
						parseData: options.parseData,
						request: options.request,
						totalRow: options.totalRow,
						page: options.page,
						limit: options.limit,
						limits: options.limits,
						toolbar: options.toolbar,
						defaultToolbar: options.defaultToolbar,
						cols: options.cols,
						done: options.done,
						bottomToolbar: options.bottomToolbar,			// 底部工具栏
						addEvent: options.addEvent						// 自定义事件
					});
				})
			},
			// 获取实例ID，如存在多个返回#id1,#id2 delimeter分隔符
            getOptionsIds: function(separator) {
            	var _separator = $.common.isEmpty(separator) ? "," : separator;
            	var optionsIds = "";  
            	$.each(table.config, function(key, value){
            		optionsIds += "#" + key + _separator;
            	});
            	return optionsIds.substring(0, optionsIds.length - 1);
            },
			// 查询条件
			where: function(formId) {
				var currentId = $.common.isEmpty(formId) ? $('form').attr('id') : formId;
				return $.common.formToJSON(currentId);
			},
			// 初始化事件
            initEvent: function() {
            	$.events = $.extend($.events, table.options.addEvent);
            	layui.use(['table'], function() {
					var _table = layui.table;
					var uniqueId = table.options.uniqueId;
					// 行点击事件
					_table.on('row(' + table.options.id + ')', function(obj) {
						// 加选中样式
						obj.tr.addClass('layui-table-click').siblings().removeClass('layui-table-click');
					});
					// 底部工具栏点击事件
					_table.on('bottomToolbar(' + table.options.id + ')', function(obj) {
						var othis = $(this);
						var attrEvent = othis.attr('lay-event');
						$.events[attrEvent] && $.events[attrEvent].call(this, othis);
					});
					// 全局点击事件
					$('body').on('click', '*[lay-event]', function() {
						var othis = $(this);
						var attrEvent = othis.attr('lay-event');
						$.events[attrEvent] && $.events[attrEvent].call(this, othis);
					});
            	});
            },
			// 查询
			search: function(formId, tableId, data) {
				table.set(tableId);
				var currentId = $.common.isEmpty(formId) ? $('form').attr('id') : formId;
				var where = $.common.formToJSON(currentId);
				if($.common.isNotEmpty(data)){
                    $.each(data, function(key) {
                    	where[key] = data[key];
                    });
                }
				var loadUrl = table.options.url || table.options.loadUrl;
				layui.table.reload(table.options.id, {
					url: loadUrl,
					where: where,
					page: {
						curr: 1
					}
				});
			},
			// 重置
			reset: function(formId, tableId) {
				var currentId = $.common.isEmpty(formId) ? $('form').attr('id') : formId;
				var _form = $('#' + currentId);
				_form[0].reset();
				$.table.search(formId, tableId);
			},
			// 刷新
			refresh: function(tableId) {
            	var currentId = $.common.isEmpty(tableId) ? table.options.id : tableId;
            	$.table.search(null, tableId);
            },
			// 获取选中行
			getSelections: function(id) {
				var tableId = id || table.options.id;
				return layui.table.checkStatus(tableId).data;
            },
            // 查询表格首列值
            selectFirstColumns: function() {
            	var data = layui.table.checkStatus(table.options.id).data;
            	var rows = $.map(data, function (row) {
        	        return row[table.options.cols[0][1].field];
        	    });
            	return $.common.uniqueFn(rows);
            },
            // 查询表格指定列值
            selectColumns: function(column) {
            	var data = layui.table.checkStatus(table.options.id).data;
            	var rows = $.map(data, function (row) {
        	        return $.common.getItemField(row, column);
        	    });
            	return $.common.uniqueFn(rows);
            },
		},
		// 事件方法
		events: {
			expExcel: function() {
				table.set();
				if ($.common.isEmpty(table.options.exportUrl)) {
					$.modal.alertWarning("暂未配置导出功能");
					return;
				}
				$.modal.confirm("确定导出所有" + table.options.title + "吗？", function() {
					var formId = null;
	    			var currentId = $.common.isEmpty(formId) ? $('form').attr('id') : formId;
	    			var dataParam = $("#" + currentId).serializeArray();
	    			var loading = layer.msg('正在导出数据，请稍后...', { icon: 16, shade: 0.3, time: 0 });
	    			$.post(table.options.exportUrl, dataParam, function(result) {
	    				if (result.code == web_status.SUCCESS) {
	    			        window.location.href = ctx + "common/excelDownload?fileName=" + encodeURI(result.msg) + "&delete=" + true;
	    				} else if (result.code == web_status.WARNING) {
	                        $.modal.alertWarning(result.msg)
	                    } else {
	    					$.modal.alertError(result.msg);
	    				}
	    				layer.close(loading);
	    			}).error(function(xhr, errorText, errorType) {
	    				$.modal.alertError(errorText);
	    			});
    			});
			}
		},
		// 表格树封装处理
        treeTable: {
            // 初始化表格
            init: function(options) {
            	var defaults = {
            		id: 'layui-tree-table',
            		type: 'ltt',
		            method: 'post',
		            where: $.treeTable.where(),
		            data: [],
		            toolbar: '#toolbar',
		            defaultToolbar: ['filter', 'exports', 'print'],
		            height: 'full-90',
		            size: 'sm',
		            tree: {
		                iconIndex: 1,		// 折叠图标显示在第几列
		                isPidData: true,	// 是否是pid形式数据
		                idName: 'menuId',	// 自定义id字段的名称
		                pidName: 'parentId'	// 自定义标识是否还有子节点的字段名称
		            },
		            cols: [],
		            done: undefined
        		};
            	options = $.extend(defaults, options);
            	table.options = options;
            	table.config[options.id] = options;
            	
            	layui.use(['treeTable'], function() {
            		var treeTable = layui.treeTable;
	            	$.bttTable = treeTable.render({
			            id: options.id,
						elem: '#' + options.id,
			            url: options.url,
			            method: options.method,
			            toolbar: options.toolbar,
			            defaultToolbar: options.defaultToolbar,
			            height: options.height,
			            size: options.size,
			            tree: options.tree,
			            cols: options.cols,
			            dons: options.dons
			        });
            	})
            },
            // 条件查询
            search: function(formId) {
            	var where = $.treeTable.where(formId);
                $.bttTable.reload({
					where: where
				});
            },
            // 查询条件
			where: function(formId) {
				var currentId = $.common.isEmpty(formId) ? $('form').attr('id') : formId;
				return $.common.formToJSON(currentId);
			},
			// 重置
			reset: function(formId, tableId) {
				var currentId = $.common.isEmpty(formId) ? $('form').attr('id') : formId;
				var _form = $('#' + currentId);
				_form[0].reset();
				$.treeTable.search(formId);
			},
            // 刷新
            refresh: function() {
            	$.bttTable.refresh();
            }
        },
		// 弹出层封装处理
		modal: {
			// 显示图标
			icon: function(type) {
				var icon = "";
				if (type == modal_status.WARNING) {
					icon = 0;
				} else if (type == modal_status.SUCCESS) {
					icon = 1;
				} else if (type == modal_status.FAIL) {
					icon = 2;
				} else {
					icon = 3;
				}
				return icon;
			},
			// 消息提示
			msg: function(content, type) {
				if (type != undefined) {
					layer.msg(content, {
						icon: $.modal.icon(type),
						time: 1000,
						shift: 5
					});
				} else {
					layer.msg(content);
				}
			},
			// 错误消息
			msgError: function(content) {
				$.modal.msg(content, modal_status.FAIL);
			},
			// 成功消息
			msgSuccess: function(content) {
				$.modal.msg(content, modal_status.SUCCESS);
			},
			// 警告消息
			msgWarning: function(content) {
				$.modal.msg(content, modal_status.WARNING);
			},
			// 弹出提示
			alert: function(content, type) {
				layer.alert(content, {
					icon: $.modal.icon(type),
					title: "系统提示",
					btn: ['确认'],
					btnclass: ['btn btn-primary'],
				});
			},
			// 消息提示并刷新父窗体
			msgReload: function(msg, type) {
				layer.msg(msg, {
						icon: $.modal.icon(type),
						time: 500,
						shade: [0.1, '#8F8F8F']
					},
					function() {
						$.modal.reload();
					});
			},
			// 错误提示
			alertError: function(content) {
				$.modal.alert(content, modal_status.FAIL);
			},
			// 成功提示
			alertSuccess: function(content) {
				$.modal.alert(content, modal_status.SUCCESS);
			},
			// 警告提示
			alertWarning: function(content) {
				$.modal.alert(content, modal_status.WARNING);
			},
			// 关闭窗体
			close: function() {
				var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);
			},
			// 关闭全部窗体
            closeAll: function () {
                layer.closeAll();
            },
            // 确认窗体
            confirm: function (content, callBack) {
            	layer.confirm(content, {
        	        icon: 3,
        	        title: "系统提示",
        	        btn: ['确认', '取消']
        	    }, function (index) {
        	    	layer.close(index);
        	        callBack(true);
        	    });
            },
            // 弹出层指定宽度
            open: function (title, url, width, height, callback) {
            	//如果是移动端，就使用自适应大小弹窗
            	if (navigator.userAgent.match(/(iPhone|iPod|Android|ios)/i)) {
            	    width = 'auto';
            	    height = 'auto';
            	}
            	if ($.common.isEmpty(title)) {
                    title = false;
                }
                if ($.common.isEmpty(url)) {
                    url = "/404.html";
                }
                if ($.common.isEmpty(width)) {
                	width = 800;
                }
                if ($.common.isEmpty(height)) {
                	height = ($(window).height() - 50);
                }
                if ($.common.isEmpty(callback)) {
                    callback = function(index, layero) {
                        var iframeWin = layero.find('iframe')[0];
                        iframeWin.contentWindow.submitHandler(index, layero);
                    }
                }
            	layer.open({
            		type: 2,
            		area: [width + 'px', height + 'px'],
            		fix: false,
            		//不固定
            		maxmin: true,
            		shade: 0.3,
            		title: title,
            		content: url,
            		btn: ['确定', '关闭'],
            	    // 弹层外区域关闭
            		shadeClose: true,
            		yes: callback,
            	    cancel: function(index) {
            	        return true;
            	    }
            	});
            },
            // 弹出层指定参数选项
            openOptions: function (options) {
            	var _url = $.common.isEmpty(options.url) ? "/404.html" : options.url; 
            	var _title = $.common.isEmpty(options.title) ? "系统窗口" : options.title; 
                var _width = $.common.isEmpty(options.width) ? "800" : options.width; 
                var _height = $.common.isEmpty(options.height) ? ($(window).height() - 50) : options.height;
                var _btn = ['<i class="fa fa-check"></i> 确认', '<i class="fa fa-close"></i> 关闭'];
                if ($.common.isEmpty(options.yes)) {
                	options.yes = function(index, layero) {
                    	options.callBack(index, layero);
                    }
                }
                layer.open({
                    type: 2,
            		maxmin: true,
                    shade: 0.3,
                    title: _title,
                    fix: false,
                    area: [_width + 'px', _height + 'px'],
                    content: _url,
                    shadeClose: $.common.isEmpty(options.shadeClose) ? true : options.shadeClose,
                    skin: options.skin,
                    btn: $.common.isEmpty(options.btn) ? _btn : options.btn,
                    yes: options.yes,
                    cancel: function () {
                        return true;
                    }
                });
            },
            // 弹出层全屏
            openFull: function (title, url, btn, width, height) {
            	//如果是移动端，就使用自适应大小弹窗
            	if (navigator.userAgent.match(/(iPhone|iPod|Android|ios)/i)) {
            	    width = 'auto';
            	    height = 'auto';
            	}
            	if ($.common.isEmpty(title)) {
                    title = false;
                }
                if ($.common.isEmpty(url)) {
                    url = "/404.html";
                }
                if ($.common.isEmpty(btn) || btn) {
                	btn = ['确定', '关闭'];
                } else {
                	btn = false;
                }
                if ($.common.isEmpty(width)) {
                	width = 800;
                }
                if ($.common.isEmpty(height)) {
                	height = ($(window).height() - 50);
                }
                var index = layer.open({
            		type: 2,
            		area: [width + 'px', height + 'px'],
            		fix: false,
            		//不固定
            		maxmin: true,
            		shade: 0.3,
            		title: title,
            		content: url,
            		btn: btn,
            		// 弹层外区域关闭
            		shadeClose: true,
            		yes: function(index, layero) {
            	        var iframeWin = layero.find('iframe')[0];
            	        iframeWin.contentWindow.submitHandler(index, layero);
            	    },
            	    cancel: function(index) {
            	        return true;
            	    }
            	});
                layer.full(index);
            },
            // 选卡页方式打开
            openTab: function (title, url) {
            	createMenuItem(url, title);
            },
            // 选卡页同一页签打开
            parentTab: function (title, url) {
            	var dataId = window.frameElement.getAttribute('data-id');
            	createMenuItem(url, title);
            	closeItem(dataId);
            },
            // 关闭选项卡
            closeTab: function (dataId) {
            	closeItem(dataId);
            },
            // 禁用按钮
            disable: function() {
            	var doc = window.top == window.parent ? window.document : window.parent.document;
	        	$("a[class*=layui-layer-btn]", doc).addClass("layer-disabled");
            },
            // 启用按钮
            enable: function() {
            	var doc = window.top == window.parent ? window.document : window.parent.document;
            	$("a[class*=layui-layer-btn]", doc).removeClass("layer-disabled");
            },
            // 打开遮罩层
            loading: function (message) {
            	message = message || '加载中...';
            	layer.msg('' + message + '', { icon: 16, shade: 0.3, time: 0 });
            },
            // 关闭遮罩层
            closeLoading: function () {
            	layer.closeAll('dialog');
            },
			// 重新加载
			reload: function() {
				parent.location.reload();
			},
			// 显示加载动画
			showLoading: function(elem, type, opacity, size) {
				if (elem !== undefined && (typeof elem !== 'string') && !(elem instanceof $)) {
		            type = elem.type;
		            opacity = elem.opacity;
		            size = elem.size;
		            elem = elem.elem;
		        }
		        if (type === undefined) type = setter.defaultLoading || 1;
		        if (size === undefined) size = 'sm';
		        if (elem === undefined) elem = 'body';
		        var loader = [
		            '<div class="ball-loader ' + size + '"><span></span><span></span><span></span><span></span></div>',
		            '<div class="rubik-loader ' + size + '"></div>',
		            '<div class="signal-loader ' + size + '"><span></span><span></span><span></span><span></span></div>',
		            '<div class="layui-loader ' + size + '"><i class="layui-icon layui-icon-loading layui-anim layui-anim-rotate layui-anim-loop"></i></div>'
		        ];
		        $(elem).addClass('page-no-scroll');  // 禁用滚动条
		        $(elem).scrollTop(0);
		        var $loading = $(elem).children('.page-loading');
		        if ($loading.length <= 0) {
		            $(elem).append('<div class="page-loading">' + loader[type - 1] + '</div>');
		            $loading = $(elem).children('.page-loading');
		        }
		        if (opacity !== undefined) $loading.css('background-color', 'rgba(255,255,255,' + opacity + ')');
		        $loading.show();
			},
			// 移除加载动画
			removeLoading: function(elem, fade, del) {
				if (elem === undefined) elem = 'body';
		        if (fade === undefined) fade = true;
		        var $loading = $(elem).children('.page-loading');
		        if (del) $loading.remove();
		        else if (fade) $loading.fadeOut('fast');
		        else $loading.hide();
		        $(elem).removeClass('page-no-scroll');
			}
		},
		// 操作封装处理
        operate: {
        	// 提交数据
        	submit: function(url, type, dataType, data, callback) {
            	var config = {
        	        url: url,
        	        type: type,
        	        dataType: dataType,
        	        data: data,
        	        beforeSend: function () {
        	        	$.modal.loading("正在处理中，请稍后...");
        	        },
        	        success: function(result) {
        	        	if (typeof callback == "function") {
        	        	    callback(result);
        	        	}
        	        	$.operate.ajaxSuccess(result);
        	        }
        	    };
        	    $.ajax(config)
            },
            // post请求传输
            post: function(url, data, callback) {
            	$.operate.submit(url, "post", "json", data, callback);
            },
            // get请求传输
            get: function(url, callback) {
            	$.operate.submit(url, "get", "json", "", callback);
            },
            // 删除信息
            remove: function(id) {
            	table.set();
            	$.modal.confirm("确定删除该条" + table.options.title + "信息吗？", function() {
                    var url = $.common.isEmpty(id) ? table.options.removeUrl : table.options.removeUrl.replace("{id}", id);
            	    var data = { "ids": id };
            	    $.operate.submit(url, "post", "json", data);
            	});
            	
            },
            // 批量删除信息
            removeAll: function() {
            	table.set();
        		var rows = $.common.isEmpty(table.options.uniqueId) ? $.table.selectFirstColumns() : $.table.selectColumns(table.options.uniqueId);
        		if (rows.length == 0) {
        			$.modal.alertWarning("请至少选择一条记录");
        			return;
        		}
        		$.modal.confirm("确认要删除选中的" + rows.length + "条数据吗?", function() {
        			var url = table.options.removeUrl;
        			var data = { "ids": rows.join() };
        			$.operate.submit(url, "post", "json", data);
        		});
            },
            // 清空信息
            clean: function() {
            	table.set();
            	$.modal.confirm("确定清空所有" + table.options.title + "吗？", function() {
	            	var url = table.options.cleanUrl;
	            	$.operate.submit(url, "post", "json", "");
            	});
            },
            // 添加信息
            add: function(id) {
            	table.set();
            	$.modal.open("添加" + table.options.title, $.operate.addUrl(id));
            },
            // 添加信息，以tab页展现
            addTab: function (id) {
            	table.set();
                $.modal.openTab("添加" + table.options.title, $.operate.addUrl(id));
            },
            // 添加信息 全屏
            addFull: function(id, btn) {
            	table.set();
            	var url = $.common.isEmpty(id) ? table.options.createUrl : table.options.createUrl.replace("{id}", id);
                $.modal.openFull("添加" + table.options.title, url, btn);
            },
            // 添加访问地址
            addUrl: function(id) {
            	var url = $.common.isEmpty(id) ? table.options.createUrl.replace("{id}", "") : table.options.createUrl.replace("{id}", id);
                return url;
            },
            // 修改信息
            edit: function(id) {
            	table.set();
        		var rows = $.common.isEmpty(table.options.uniqueId) ? $.table.selectFirstColumns() : $.table.selectColumns(table.options.uniqueId);
        		if ($.common.isEmpty(id) && rows.length == 0) {
        			$.modal.alertWarning("请至少选择一条记录");
        			return;
        		}
        	    $.modal.open("修改" + table.options.title, $.operate.editUrl(id));
            },
            // 修改信息，以tab页展现
            editTab: function(id) {
            	table.set();
            	var rows = $.common.isEmpty(table.options.uniqueId) ? $.table.selectFirstColumns() : $.table.selectColumns(table.options.uniqueId);
        		if (rows.length == 0) {
        			$.modal.alertWarning("请至少选择一条记录");
        			return;
        		}
            	$.modal.openTab("修改" + table.options.title, $.operate.editUrl(id));
            },
            // 修改信息 全屏
            editFull: function(id, btn) {
            	table.set();
            	var url = "/404.html";
            	if ($.common.isNotEmpty(id)) {
            	    url = table.options.updateUrl.replace("{id}", id);
            	} else {
        			var row = $.common.isEmpty(table.options.uniqueId) ? $.table.selectFirstColumns() : $.table.selectColumns(table.options.uniqueId);
            	    url = table.options.updateUrl.replace("{id}", row);
            	}
            	$.modal.openFull("修改" + table.options.title, url, btn);
            },
            // 修改访问地址
            editUrl: function(id) {
            	var url = "/404.html";
            	if ($.common.isNotEmpty(id)) {
            	    url = table.options.updateUrl.replace("{id}", id);
            	} else {
            	    var id = $.common.isEmpty(table.options.uniqueId) ? $.table.selectFirstColumns() : $.table.selectColumns(table.options.uniqueId);
            	    if (id.length == 0) {
            			$.modal.alertWarning("请至少选择一条记录");
            			return;
            		}
            	    url = table.options.updateUrl.replace("{id}", id[0]);
            	}
                return url;
            },
            // 保存信息 刷新表格
            save: function(url, data, callback) {
            	var config = {
        	        url: url,
        	        type: "post",
        	        dataType: "json",
        	        data: data,
        	        beforeSend: function () {
        	        	$.modal.loading("正在处理中，请稍后...");
        	        	$.modal.disable();
        	        },
        	        success: function(result) {
        	        	if (typeof callback == "function") {
        	        	    callback(result);
        	        	}
        	        	$.operate.successCallback(result);
        	        }
        	    };
        	    $.ajax(config)
            },
            // 保存信息 弹出提示框
            saveModal: function(url, data, callback) {
            	var config = {
        	        url: url,
        	        type: "post",
        	        dataType: "json",
        	        data: data,
        	        beforeSend: function () {
        	        	$.modal.loading("正在处理中，请稍后...");
        	        },
        	        success: function(result) {
        	        	if (typeof callback == "function") {
        	        	    callback(result);
        	        	}
        	        	if (result.code == web_status.SUCCESS) {
	                        $.modal.alertSuccess(result.msg)
	                    } else if (result.code == web_status.WARNING) {
	                        $.modal.alertWarning(result.msg)
	                    } else {
	                    	$.modal.alertError(result.msg);
	                    }
        	        	$.modal.closeLoading();
        	        }
        	    };
        	    $.ajax(config)
            },
            // 保存选项卡信息
            saveTab: function(url, data, callback) {
            	var config = {
        	        url: url,
        	        type: "post",
        	        dataType: "json",
        	        data: data,
        	        beforeSend: function () {
        	        	$.modal.loading("正在处理中，请稍后...");
        	        },
        	        success: function(result) {
        	        	if (typeof callback == "function") {
        	        	    callback(result);
        	        	}
        	        	$.operate.successTabCallback(result);
        	        }
        	    };
        	    $.ajax(config)
            },
            // 保存结果弹出msg刷新table表格
            ajaxSuccess: function (result) {
            	if (result.code == web_status.SUCCESS && table.options.type == table_type.layuiTable) {
                	$.modal.msgSuccess(result.msg);
            		$.table.refresh();
            	} else if (result.code == web_status.SUCCESS && table.options.type == table_type.layuiTreeTable) {
                	$.modal.msgSuccess(result.msg);
                } else if (result.code == web_status.SUCCESS && table.options.type == undefined) {
                    $.modal.msgSuccess(result.msg)
                }  else if (result.code == web_status.WARNING) {
                    $.modal.alertWarning(result.msg)
                }  else {
                	$.modal.alertError(result.msg);
                }
            	$.modal.closeLoading();
            },
            // 成功结果提示msg（父窗体全局更新）
            saveSuccess: function (result) {
            	if (result.code == web_status.SUCCESS) {
            		$.modal.msgReload("保存成功,正在刷新数据请稍后……", modal_status.SUCCESS);
                } else if (result.code == web_status.WARNING) {
                    $.modal.alertWarning(result.msg)
                } else {
                	$.modal.alertError(result.msg);
                }
            	$.modal.closeLoading();
            },
            // 成功回调执行事件（父窗体静默更新）
            successCallback: function(result) {
                if (result.code == web_status.SUCCESS) {
                	var parent = window.parent;
                    if (parent.table.options.type == table_type.layuiTable) {
                        $.modal.close();
                        parent.$.modal.msgSuccess(result.msg);
                        parent.$.table.refresh();
                    } else if (parent.table.options.type == table_type.layuiTreeTable) {
                        $.modal.close();
                        parent.$.modal.msgSuccess(result.msg);
                    } else {
                        $.modal.msgReload("保存成功,正在刷新数据请稍后……", modal_status.SUCCESS);
                    }
                } else if (result.code == web_status.WARNING) {
                    $.modal.alertWarning(result.msg)
                } else {
                    $.modal.alertError(result.msg);
                }
                $.modal.closeLoading();
                $.modal.enable();
            },
            // 选项卡成功回调执行事件（父窗体静默更新）
            successTabCallback: function(result) {
                if (result.code == web_status.SUCCESS) {
                	var topWindow = $(window.parent.document);
    	            var currentId = $('.page-tabs-content', topWindow).find('.active').attr('data-panel');
    	            var $contentWindow = $('.Main_iframe[data-id="' + currentId + '"]', topWindow)[0].contentWindow;
    	            $.modal.close();
    	            $contentWindow.$.modal.msgSuccess(result.msg);
    	            $contentWindow.$(".layui-layer-padding").removeAttr("style");
	        		$contentWindow.$.table.refresh();
    	            $.modal.closeTab();
                } else if (result.code == web_status.WARNING) {
                    $.modal.alertWarning(result.msg)
                } else {
                    $.modal.alertError(result.msg);
                }
                $.modal.closeLoading();
            }
        },
		// 通用方法封装处理
		common: {
			// 判断字符串是否为空
			isEmpty: function(value) {
				if (value == null || this.trim(value) == "") {
					return true;
				}
				return false;
			},
			// 判断一个字符串是否为非空串
			isNotEmpty: function(value) {
				return !$.common.isEmpty(value);
			},
			// 空对象转字符串
			nullToStr: function(value) {
				if ($.common.isEmpty(value)) {
					return "-";
				}
				return value;
			},
			// 是否显示数据 为空默认为显示
			visible: function(value) {
				if ($.common.isEmpty(value) || value == true) {
					return true;
				}
				return false;
			},
			// 空格截取
			trim: function(value) {
				if (value == null) {
					return "";
				}
				return value.toString().replace(/(^\s*)|(\s*$)|\r|\n/g, "");
			},
			// 比较两个字符串（大小写敏感）
			equals: function(str, that) {
				return str == that;
			},
			// 比较两个字符串（大小写不敏感）
			equalsIgnoreCase: function(str, that) {
				return String(str).toUpperCase() === String(that).toUpperCase();
			},
			// 将字符串按指定字符分割
			split: function(str, sep, maxLen) {
				if ($.common.isEmpty(str)) {
					return null;
				}
				var value = String(str).split(sep);
				return maxLen ? value.slice(0, maxLen - 1) : value;
			},
			// 字符串格式化(%s )
			sprintf: function(str) {
				var args = arguments,
					flag = true,
					i = 1;
				str = str.replace(/%s/g, function() {
					var arg = args[i++];
					if (typeof arg === 'undefined') {
						flag = false;
						return '';
					}
					return arg;
				});
				return flag ? str : '';
			},
			// 获取节点数据，支持多层级访问
            getItemField: function (item, field) {
                var value = item;
                if (typeof field !== 'string' || item.hasOwnProperty(field)) {
                    return item[field];
                }
                var props = field.split('.');
                for (var p in props) {
                    value = value && value[props[p]];
                }
                return value;
            },
			// 指定随机数返回
			random: function(min, max) {
				return Math.floor((Math.random() * max) + min);
			},
			// 判断字符串是否是以start开头
			startWith: function(value, start) {
				var reg = new RegExp("^" + start);
				return reg.test(value)
			},
			// 判断字符串是否是以end结尾
			endWith: function(value, end) {
				var reg = new RegExp(end + "$");
				return reg.test(value)
			},
			// 数组去重
			uniqueFn: function(array) {
				var result = [];
				var hashObj = {};
				for (var i = 0; i < array.length; i++) {
					if (!hashObj[array[i]]) {
						hashObj[array[i]] = true;
						result.push(array[i]);
					}
				}
				return result;
			},
			// 数组中的所有元素放入一个字符串
			join: function(array, separator) {
				if ($.common.isEmpty(array)) {
					return null;
				}
				return array.join(separator);
			},
			// 获取form下所有的字段并转换为json对象
			formToJSON: function(formId) {
				var json = {};
				$.each($("#" + formId).serializeArray(), function(i, field) {
					if (json[field.name]) {
						json[field.name] += ("," + field.value);
					} else {
						json[field.name] = field.value;
					}
				});
				return json;
			},
			// 获取obj对象长度
			getLength: function(obj) {
				var count = 0;
				for (var i in obj) {
					if (obj.hasOwnProperty(i)) {
						count++;
					}
				}
				return count;
			},
			// 判断移动端
			isMobile: function() {
				return navigator.userAgent.match(/(Android|iPhone|SymbianOS|Windows Phone|iPad|iPod)/i);
			},
			// 数字格式化
			numberFormat: function(value, length, suffixStr) {
				if (!$.common.isEmpty(value)) {
					length = length || '2';
					return parseFloat(value).toFixed(length) + suffixStr;
				}
				return '';
			}
		}
	});
})(jQuery);

/** 表格类型 */
var table_type = {
    layuiTable: 'lt',
    layuiTreeTable: 'ltt'
};

/** 消息状态码 */
web_status = {
	SUCCESS: 0,
	FAIL: 500,
	WARNING: 301
};

/** 弹窗状态码 */
modal_status = {
	SUCCESS: "success",
	FAIL: "error",
	WARNING: "warning"
};
