if($ && $.fn && $.fn.bootstrapTable) {
	var BootstrapTable = $.fn.bootstrapTable.Constructor;
	BootstrapTable.prototype.onLoad = function () { return false };
	BootstrapTable.EVENTS['load.bs.table'] = 'onLoad';
	BootstrapTable.prototype.load = function (s) {
		//wym add onload
		this.trigger("load", s);
		var r = false; if (this.options.sidePagination === "server") { this.options.totalRows = s.total; r = s.fixedScroll; s = s[this.options.dataField] } else { if (!j.isArray(s)) { r = s.fixedScroll; s = s.data } } this.initData(s); this.initSearch(); this.initPagination(); this.initBody(r)
	};
}

if($ && $.modal) {
	// 弹出提示，带关闭回调
	$.modal.alertCallback =
		function (content, callback) {
			layer.alert(content, { icon: 1, title: "系统提示", btn: ['确认'], btnclass: ['btn btn-primary'] }, function (index) {
				if (typeof callback == "function") {
					callback();
				}
				layer.close(index);
			})
		};
}

if($ && $.operate) {
	//$.modal.open弹出层，带关闭回调（父窗体执行callback）
	$.operate.saveModalAppendCallback =
		function (url, data, callback) {
			var config = {
				url: url,
				type: "post",
				dataType: "json",
				data: data,
				beforeSend: function () {
					parent.$.modal.loading("正在处理中，请稍后...");
				},
				success: function (result) {
					if (result.code == web_status.SUCCESS) {
						parent.$.modal.alertCallback("保存成功！", function () {
							parent.layer.close(parent.layer.getFrameIndex(window.name));
							if (typeof callback == "function") {
								callback();
							}
						});
					} else if (result.code == web_status.WARNING) {
						parent.$.modal.alertWarning(result.msg)
					} else {
						parent.$.modal.alertError(result.msg);
					}
					parent.$.modal.closeLoading();
				}
			};
			$.ajax(config);
		};
}