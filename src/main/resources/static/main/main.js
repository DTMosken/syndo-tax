
layui.use(['carousel'], function() {
	var carousel = layui.carousel,
		device = layui.device();

	//轮播切换
	$('.layadmin-carousel').each(function() {
		var othis = $(this);
		carousel.render({
			elem: this,
			width: '100%',
			arrow: 'none',	// 切换箭头默认显示状态
			interval: othis.data('interval'), // 自动切换的时间间隔
			autoplay: othis.data('autoplay') === true,	// 是否自动切换
			trigger: (device.ios || device.android) ? 'click' : 'hover', // 指示器的触发事件
			anim: othis.data('anim') // 轮播切换动画方式
		});
	});
});

// 数据渲染
layui.use(['element', 'laytpl'], function() {
	var element = layui.element;
	var laytpl = layui.laytpl;
	
	var method = {
		// 加载顶部卡片数据
		loadCard: function(data) {
			document.getElementById('zsr').innerHTML = nullToStr(data.zsr);
			document.getElementById('zsrqs').innerHTML = nullToStr(data.zsrqs);
			document.getElementById('dfsr').innerHTML = nullToStr(data.dfsr);
			document.getElementById('dfsrqs').innerHTML = nullToStr(data.dfsrqs);
			document.getElementById('ybs').innerHTML = nullToStr(data.ybs);
			document.getElementById('wbs').innerHTML = nullToStr(data.wbs);
			document.getElementById('bssl').innerHTML = nullToStr(data.bssl);
			document.getElementById('sjzl').innerHTML = nullToStr(data.sjzl);
		},
		// 加载图表数据
		loadEchart: function(data) {
			var	lineDom = $('#echarts-line').children('div')[0];
			var echart_line = echarts.init(lineDom, 'custom');
			echart_line.setOption({
			    tooltip: {
			        trigger: 'axis'
			    },
			    toolbox: {
			        feature: {
			        	dataView: {
			        		show: true, 
			            	readOnly: false,
			            	// 数据视图重定义
			            	optionToContent: function(opt) {
			            		let axisData = opt.xAxis[0].data; //坐标数据
		            		    let series = opt.series; //折线图数据
		            		    let tdHeads = '<th>日期</th>'; //表头
		            		    let tdBodys = ''; //数据
		            		    series.forEach(function (item) {
		            		        //组装表头
		            		        tdHeads += '<th>'+ item.name + '</th>';
		            		    });
		            		    let tableHtml = '<table class="layui-table" lay-size="sm"><thead>' + tdHeads + '</thead><tbody>';
		            		    for (let i = 0, l = axisData.length; i < l; i++) {
		            		        for (let j = 0; j < series.length; j++) {
		            		            //组装表数据
		            		            tdBodys += '<td>' + series[j].data[i] + '</td>';
		            		        }
		            		        tableHtml += '<tr><td>' + axisData[i] + '</td> ' + tdBodys + '</tr>';
		            		        tdBodys = '';
		            		    }
		            		    tableHtml += '</tbody></table>';
		            		    return tableHtml;
		                    },
		                    buttonColor: '#1890ff'
			            },
			            magicType: {show: false, type: ['line', 'bar']},
			            restore: {show: false},
			            saveAsImage: {show: true}
			        }
			    },
			    legend: {
			        data: ['本期', '同期', '增减率']
			    },
			    grid: {
			    	bottom: '35px',
			    	left: '50px'
			    },
			    xAxis: [
			        {
			            type: 'category',
			            data: eval(data.yf),
			            axisPointer: {
			                type: 'shadow'
			            }
			        }
			    ],
			    yAxis: [
			        {
			            type: 'value',
			            name: '金额（万元）',
			            min: function (value) {
			                return value.min - 20;
			            },
			            axisLabel: {
			                formatter: '{value}'
			            }
			        },
			        {
			            type: 'value',
			            name: '趋势（%）',
			            min: function (value) {
			                return value.min - 20;
			            },
			            axisLabel: {
			                formatter: '{value}'
			            }
			        }
			    ],
			    series: [
			        {
			            name: '本期',
			            type: 'bar',
			            barWidth: 15,
			            data: eval(data.bqs)
			        },
			        {
			            name: '同期',
			            type: 'bar',
			            barWidth: 15,
			            data: eval(data.tqs)
			        },
			        {
			            name: '增减率',
			            type: 'line',
			            yAxisIndex: 1,
			            data: eval(data.zjl)
			        }
			    ]
			});
			// 轮播控件导致100%高度不能识别，js重新赋值
			lineDom.style.width = "100%";
			window.onresize = function() {
				echart_line.resize();
			}
		},
		// 加载进度条数据
		loadProgress: function(data) {
			var getTpl = progressTpl.innerHTML;
			var view = document.getElementById('progress');
			var tpl = laytpl(getTpl).render(data, function(html) {
				view.innerHTML = html;
				element.render('progress')
			});
		}
	}
	
	$.ajax({
		url : ctx + 'system/getMainData',
		type : "post",
		async : true,	//异步请求
		data : {},
		dataType : "json",
		success : function(result) {
			if (result.code = "0") {
				var data = result.data;
				if(data){
					method.loadCard(data.card);
					method.loadEchart(data.echart);
				}
				// method.loadProgress(data.progress);
			} else {
				console.log(result.msg);
			} 
		}
	})
});

function nullToStr(value) {
	if (value == null || value.trim() == "") {
        return "-";
    }
    return value;
}