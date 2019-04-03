function login(){
	//1.获取参数有效性
	var username = $('#username').val();
	var psw = $('#psw').val();
	//参数有效性标记
	var ok = true;
	//2.判断参数的有效性
	if(username == ''){
		ok = false;
		alert('用户名不能为空');
	}else if(psw == ''){
		ok = false;
		alert('密码不能为空');
	}
	//3.发送Ajax请求
	if(ok){
		$.ajax({
			type:"get",
			url:"user/login.do",
			data:{
				"username":username,
				"password":psw
			},
			dataType:"json",
			success:function(result){
				if(result.status == 0){
					alert('登录成功');
				}else if(result.status == 1){
					alert('用户名不存在');
				}else if(result.status == 2){
					alert('密码错误');
				}
			},
			error:function(){
				alert('请求失败');
			}
		})
	}
}

function show(){
	var psw = document.getElementById('psw');
	psw.type = 'text';
	var st1 = setTimeout("psw.type = 'password'",2000);
}


