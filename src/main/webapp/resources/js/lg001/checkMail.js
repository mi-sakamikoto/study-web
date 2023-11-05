$(document).ready(function(){
	$("#mail").blur(function(){
    		let mail = $("#mail").val();
    		let reg = /^[a-zA-Z0-9_.-]+@[a-zA-Z0-9]+(\.[a-zA-Z0-9]+)*[a-zA-Z0-9]{2,3}$/;
    		let flag = reg.test(mail);

    		if(flag){
    			$('#login').prop('disabled', false);
    		}else{
    			if(mail == ""){
    				alert("请填写邮箱");
    				$('#login').prop('disabled', true);
    			}
    			else{
    				alert("邮箱格式错误");
    				$('#login').prop('disabled', true);
    			}
    		}
    	})
});