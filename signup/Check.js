function signupCheck() {
	var frm = document.signup_form;

	frm.sign.value = "signup";
	frm.action = "/PojoExample/Sign.do";
	
	if (!frm.userid.value) {
		alert("���̵� �Է����ּ���");
		frm.userid.focus();
		return;
	}
	if (!frm.pwd.value) {
		alert("�н����带 �Է����ּ���");
		frm.pwd.focus();
		return;
	}
	if (!frm.username.value) {
		alert("�̸��� �Է����ּ���");
		frm.username.focus();
		return;
	}
	if (!frm.email.value) {
		alert("�̸����� �Է����ּ���");
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
		alert("���̵� �Է����ּ���");
		frm.userid.focus();
		return;
	}
	if (!frm.pwd.value) {
		alert("�н����带 �Է����ּ���");
		frm.pwd.focus();
		return;
	}
	
	frm.submit();
}