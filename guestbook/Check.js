function goWrite() {
	var frm = document.guestbookForm;
	frm.action = "/PojoExample/guestbook/list_ok.jsp";

	if (!frm.writer.value) {
		alert("�ۼ��ڸ��� �Է����ּ���");
		frm.writer.focus();
		return;
	}
	if (!frm.title.value) {
		alert("������ �Է����ּ���");
		frm.title.focus();
		return;
	}
	if (!frm.contents.value) {
		alert("������ �Է����ּ���");
		frm.contents.focus();
		return;
	}

	frm.submit();
}