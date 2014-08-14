function signupCheck() {
	var frm = document.signup_form;

	frm.sign.value = "signup";
	frm.action = "/PojoExample/Sign.do";
	
	if (!frm.userid.value) {
		alert("아이디를 입력해주세요");
		frm.userid.focus();
		return;
	}
	if (!frm.pwd.value) {
		alert("패스워드를 입력해주세요");
		frm.pwd.focus();
		return;
	}
	if (!frm.username.value) {
		alert("이름를 입력해주세요");
		frm.username.focus();
		return;
	}
	if (!frm.email.value) {
		alert("이메일을 입력해주세요");
		frm.email.focus();
		return;
	}
	
	frm.submit();
}

function signinCheck(){
	var frm = document.signin_form;
	
	frm.sign.value = "signin";
	frm.action = "/PojoExample/Sign.do";
	
	if (!frm.userid.value) {
		alert("아이디를 입력해주세요");
		frm.userid.focus();
		return;
	}
	if (!frm.pwd.value) {
		alert("패스워드를 입력해주세요");
		frm.pwd.focus();
		return;
	}
	
	frm.submit();
}