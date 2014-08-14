package com.hoseo.guestbook.dto;

public class GuestbookDto {
	private int seq;
	private String title;
	private String contents;
	private String writer;
	private String wdate;
	private String delyn;

	public GuestbookDto() {

	}

	public GuestbookDto(int seq, String title, String contents, String writer,
			String wdate, String delyn) {
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.wdate = wdate;
		this.delyn = delyn;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public String getDelyn() {
		return delyn;
	}

	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
}