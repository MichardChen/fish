//用户ID
var userId = T.p("userId");
var vm = new Vue({
	el:'#rrapp',
	data:{
		title:"新增管理员",
		roleList:{},
		user:{
			status:1,
			roleIdList:[],
			expertFlg:1
		}
	},
	created: function() {
		if(userId != null){
			this.title = "修改管理员";
			this.getUser(userId)
		}
		//获取角色信息
		this.getRoleList();
    },
	methods: {
		getUser: function(userId){
			$.get("../sys/user/info/"+userId, function(r){
				vm.user = r.user;
				$("#userId").val(r.user.userId);
				$("#icon").attr("href",r.user.icon);
				$("#icon").show();
			});
		},
		getRoleList: function(){
			$.get("../sys/role/select", function(r){
				vm.roleList = r.list;
			});
		},
		saveOrUpdate: function (event) {
			var userId = $("#userId").val();
			if(userId == 0 || userId == null){
				//保存
				var formFile = new FormData();
				var fileObj = document.getElementById("uFile").files[0];
				
				var username = $("#username").val();
				if(username == null || username == ""){
					alert("请输入登录账号");
					return;
				}
				var password = $("#password").val();
				if(password == null || password == ""){
					alert("请输入登录密码");
					return;
				}
				var email = $("#email").val();
				if(email == null || email == ""){
					alert("请输入邮箱");
					return;
				}
				var mobile = $("#mobile").val();
				if(mobile == null || mobile == ""){
					alert("请输入手机号");
					return;
				}
				var selectCount = 0;
				var obj = document.getElementsByName("roleId");
				for(var i=0;i<obj.length;i++){
					if(obj[i].checked){
						selectCount = selectCount +1;
					}
			     }
				if(selectCount == 0){
					alert("请选择角色");
					return;
				}
				
				var introduce = $("#introduce").val();
				if(introduce == null || introduce == ""){
					alert("请输入介绍");
					return;
				}
				var skill = $("#skill").val();
				if(skill == null || skill == ""){
					alert("请输入特长");
					return;
				}
				var realName = $("#realName").val();
				if(realName == null || realName == ""){
					alert("请输入真实姓名");
					return;
				}
				if(fileObj == null || fileObj == ""){
					alert("请选择头像");
					return;
				}
				
				var url = "../sys/user/save";
				formFile.append("uFile", fileObj); 
				formFile.append("user", JSON.stringify(vm.user));
				$.ajax({
					type: "POST",
				    url: url,
				    processData: false,
				    contentType: false,
				    data: formFile,
				    success: function(rr){
				    	if(rr.code === 0){
							alert('操作成功', function(index){
								vm.back();
							});
						}else{
							alert(rr.msg);
						}
					}
				});
			}else{
				//更新
				var formFile = new FormData();
				var fileObj = document.getElementById("uFile").files[0];
				
				var username = $("#username").val();
				if(username == null || username == ""){
					alert("请输入登录账号");
					return;
				}
				var email = $("#email").val();
				if(email == null || email == ""){
					alert("请输入邮箱");
					return;
				}
				var mobile = $("#mobile").val();
				if(mobile == null || mobile == ""){
					alert("请输入手机号");
					return;
				}
				var selectCount = 0;
				var obj = document.getElementsByName("roleId");
				for(var i=0;i<obj.length;i++){
					if(obj[i].checked){
						selectCount = selectCount +1;
					}
			     }
				if(selectCount == 0){
					alert("请选择角色");
					return;
				}
				var introduce = $("#introduce").val();
				if(introduce == null || introduce == ""){
					alert("请输入介绍");
					return;
				}
				var skill = $("#skill").val();
				if(skill == null || skill == ""){
					alert("请输入特长");
					return;
				}
				var realName = $("#realName").val();
				if(realName == null || realName == ""){
					alert("请输入真实姓名");
					return;
				}
				
				var url = "../sys/user/update";
				formFile.append("uFile", fileObj); 
				vm.user.userId = userId;
				formFile.append("user", JSON.stringify(vm.user));
				$.ajax({
					type: "POST",
				    url: url,
				    processData: false,
				    contentType: false,
				    data: formFile,
				    success: function(rr){
				    	if(rr.code === 0){
							alert('操作成功', function(index){
								vm.back();
							});
						}else{
							alert(rr.msg);
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