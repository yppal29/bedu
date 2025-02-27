package com.care.bedu.lecture.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.bedu.lecture.dao.LectureDao;
import com.care.bedu.lecture.dto.LectureDto;
import com.care.bedu.lecture.service.LectureService;

@Service
public class LectureServiceImpl implements LectureService{

	@Autowired
	private LectureDao dao;
	
	@Override
	public ArrayList<LectureDto> getLectureList(String category) {
		// TODO Auto-generated method stub

		ArrayList<LectureDto> list = new ArrayList<>();
		
		list = dao.getLectureList(category);
		
		return list;
	}

	@Override
	public LectureDto getLectureDetail(int num) {
		// TODO Auto-generated method stub
		LectureDto dto = new LectureDto();
		dto = dao.getLectureDetail(num);
		
		
		return dto;
	}

}
