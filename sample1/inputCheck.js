function goSend(){
	var frm = document.form;
	form.action="/PojoExample/Sample1.do";
	
	if (!frm.name.value) {
		alert("이름을 입력해주세요");
		frm.name.focus();
		return;
	}
	if (!frm.phone.value) {
		alert("연락처를 입력해주세요");
		frm.phone.focus();
		return;
	}
	if (!frm.email.value) {
		alert("이메일을 입력해주세요");
		frm.email.focus();
		return;
	}
	
	frm.submit();
}