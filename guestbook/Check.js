function goWrite() {
	var frm = document.guestbookForm;
	frm.action = "/PojoExample/guestbook/list_ok.jsp";

	if (!frm.writer.value) {
		alert("작성자명을 입력해주세요");
		frm.writer.focus();
		return;
	}
	if (!frm.title.value) {
		alert("제목을 입력해주세요");
		frm.title.focus();
		return;
	}
	if (!frm.contents.value) {
		alert("내용을 입력해주세요");
		frm.contents.focus();
		return;
	}

	frm.submit();
}