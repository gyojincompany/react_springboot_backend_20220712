package com.gyojincompany.userlist.dao;

import java.util.ArrayList;


import org.apache.ibatis.annotations.Mapper;

import com.gyojincompany.userlist.dto.UserDto;

@Mapper
public interface IDao {
	
	ArrayList<UserDto> userList(); //모든 회원 리스트 불러오기
	UserDto userById(int id); //id로 특정 유저 정보 불러오기
	void insertUser(UserDto user); //새로운 회원정보 입력하기
	void updateUser(UserDto user); //회원정보 수정하기
	void deleteUser(int id); //id로 특정 회원 삭제하기
	
}
