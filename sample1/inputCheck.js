function goSend(){
	var frm = document.form;
	form.action="/PojoExample/Sample1.do";
	
	if (!frm.name.value) {
		alert("�̸��� �Է����ּ���");
		frm.name.focus();
		return;
	}
	if (!frm.phone.value) {
		alert("����ó�� �Է����ּ���");
		frm.phone.focus();
		return;
	}
	if (!frm.email.value) {
		alert("�̸����� �Է����ּ���");
		frm.email.focus();
		return;
	}
	
	frm.submit();
}