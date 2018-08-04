var id = T.p("id");
var vm = new Vue({
	el : '#rrapp',
	data : {
		title : "新增",
		tBrandSeries : {flg:1}
	},
	created : function() {
		
		if (id != null) {
			this.title = "修改";
			this.getInfo(id);
		}
		$.ajaxSetup({ 
		    async : false 
		});
		//Synchronous XMLHttpRequest on the main thread is deprecated because of its detrimental effects to the end user's experience. 
		//加上同步，会出现上面的错误，把getInfo写在前面就不会出现错误
		// 查看所有品牌
		$.get("../tbrand/queryAllBrand", function(json) {
			var r = eval('('+json+')');
			var brandList = r.tBrandList;
			var html = "";
			for (var i = 0; i < brandList.length; i++) { // 循环
				html += "<option value='" + brandList[i].id + "'>"
						+ brandList[i].brand + "</option>";
			}
			$("#brandId").append(html);
		});
		
	},
	methods : {
		getInfo : function(id) {
			$.get("../tbrandseries/info/"+id, function(json) {
				var r = eval('('+json+')');
				$("#brandSeriesId").val(r.tBrandSeries.id);
				$("#carSerial").val(r.tBrandSeries.carSerial);
				$("#flg").val(r.tBrandSeries.flg);
			});
		},
		saveOrUpdate : function(event) {
			if (!$("#carSerial").val()) {
					alert("请输入消息内容");
					return;
			}
			var brandSeriesId = $("#brandSeriesId").val();
			if (brandSeriesId == null || brandSeriesId == "") {
				var formFile = new FormData();
				vm.tBrandSeries.carSerial = $("#carSerial").val();
				vm.tBrandSeries.flg = $("#flg").val();
				formFile.append("tBrandSeries", JSON.stringify(vm.tBrandSeries));
				var url = "../tbrandseries/save";
				$.ajax({
					type : "POST",
					url : url,
					data : formFile,
					contentType: "application/json",
				    processData: false,
				    contentType: false,
					success : function(json) {
						var r = eval('('+json+')');
						if (r.code === 0) {
							alert('操作成功', function(index) {
								vm.back();
							});
						} else {
							alert(r.msg);
						}
					}
				});
			} else {
				var url = "../tbrandseries/update";
				vm.tBrandSeries.id = brandSeriesId;
				vm.tBrandSeries.carSerial = $("#carSerial").val();
				vm.tBrandSeries.flg = $("#flg").val();
				var formFile = new FormData();
				formFile.append("tBrandSeries", JSON.stringify(vm.tBrandSeries));
				$.ajax({
					type : "POST",
					url : url,
					data : formFile,
					contentType: "application/json",
				    processData: false,
				    contentType: false,
					success : function(json) {
						var r = eval('('+json+')');
						if (r.code === 0) {
							alert('操作成功', function(index) {
								vm.back();
							});
						} else {
							alert(r.msg);
						}
					}
				});
			}
		},
		back : function(event) {
			history.go(-1);
		}
	}
});