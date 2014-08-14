package com.hoseo.guestbook.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.hoseo.guestbook.dto.GuestbookDto;

import database.common.DBManager;

public class GuestbookDao {
	ArrayList<GuestbookDto> list = new ArrayList<GuestbookDto>();

	DBManager db = new DBManager();
	String sql, title, contents, writer, wdate, delyn;
	int seq;

	// 생성자
	public GuestbookDao() {

		GuestbookDto dto = new GuestbookDto();
		sql = "select * from guestbook";
		ArrayList<HashMap> dblist = db.getList(sql);		

		for (int i = 0; i < dblist.size(); i++) {
			HashMap<String, String> map = dblist.get(i);

			seq = Integer.parseInt(map.get("SEQ"));
			title = map.get("TITLE");
			contents = map.get("CONTENTS");
			writer = map.get("WRITER");
			wdate = map.get("WDATE");
			delyn = map.get("DELYN");
			
			list.add(new GuestbookDto(seq, title, contents, writer, wdate, delyn));
		}
	}

	public ArrayList<GuestbookDto> getList() {
		return list;
	}
}