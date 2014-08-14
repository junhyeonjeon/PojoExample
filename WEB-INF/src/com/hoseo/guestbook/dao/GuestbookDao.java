package com.hoseo.guestbook.dao;

import java.util.ArrayList;

import com.hoseo.guestbook.dto.GuestbookDto;

public class GuestbookDao {
	ArrayList<GuestbookDto> list = new ArrayList<GuestbookDto>();

	// 생성자
	public GuestbookDao() {
		GuestbookDto dto = new GuestbookDto();
		dto.setSeq(1);
		dto.setTitle("방문1");
		dto.setContents("복 많이 받으셈 1");
		dto.setWriter("방문자1");
		dto.setWdate("2014-08-12");
		list.add(dto);

		dto.setSeq(2);
		dto.setTitle("방문2");
		dto.setContents("복 많이 받으셈 2");
		dto.setWriter("방문자2");
		dto.setWdate("2014-08-13");
		list.add(dto);

		dto.setSeq(3);
		dto.setTitle("방문3");
		dto.setContents("복 많이 받으셈 3");
		dto.setWriter("방문자3");
		dto.setWdate("2014-08-13");
		list.add(dto);
	}

	public ArrayList<GuestbookDto> getList() {
		return list;
	}
}