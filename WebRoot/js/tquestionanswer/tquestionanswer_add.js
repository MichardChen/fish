var id = T.p("id");
var vm = new Vue({
	el:'#rrapp',
	data:{
		title:"新增",
		tQuestionAnswer:{}
	},
	created: function() {
		if(id != null){
			this.title = "修改";
			this.getInfo(id)
		}
    },
	methods: {
		getInfo: function(id){
			$.get("../tquestionanswer/info/"+id, function(r){
                vm.tQuestionAnswer = r.tQuestionAnswer;
            });
		},
		saveOrUpdate: function (event) {
			if($("#question").val() == ""){
				alert("请输入芯片号码");
				return;
			}
			if($("#answer").val() == ""){
				alert("请输入芯片内容");
				return;
			}
			var url = vm.tQuestionAnswer.id == null ? "../tquestionanswer/save" : "../tquestionanswer/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.tQuestionAnswer),
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
		},
		back: function (event) {
			history.go(-1);
		}
	}
});