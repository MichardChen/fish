var id = T.p("id");
var typeCd = T.p("typeCd");
var vm = new Vue({
	el:'#rrapp',
	data:{
		title:"新增",
		tCartParams:{},
		tCartParam2:{}
	},
	created: function() {
		if(id != null){
			this.title = "修改";
			this.getInfo(id);
		}
    },
	methods: {
		getInfo: function(id){
			$.get("../tcartparams/allInfo/"+id+"/"+typeCd, function(r){
				if(r.code === 0){
					 vm.tCartParams = r.tCartParams;
		              vm.tCartParam2 = r.tCartParams2;
				}else{
					alert(r.msg);
				}
            });
		},
		saveOrUpdate: function (event) {
			var cartIds = $("#cartIds").val();
			if(cartIds == null || cartIds == 0){
				alert("这部汽车，还没没有导入参数，请先导入");
				return;
			}else{
				//更新
				var url = "../tcartparams/update";
				var url1 = "../tcartparams/update1";
				$.ajax({
					type: "POST",
				    url: url,
				    data: JSON.stringify(vm.tCartParams),
				    success: function(r){
				    	if(r.code === 0){
								$.ajax({
									type: "POST",
								    url: url1,
								    data: JSON.stringify(vm.tCartParam2),
								    success: function(r){
								    	if(r.code === 0){
											alert('操作成功', function(index){
												vm.back();
											});
										}else{
											alert(r.msg);
										}
									}
								});
						}else{
							alert(r.msg);
						}
					}
				});
			}
			
		},
		back: function (event) {
			history.go(-1);
		}
	}
});