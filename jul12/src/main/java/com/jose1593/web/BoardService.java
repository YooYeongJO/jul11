package com.jose1593.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	// Board Controller -> Service -> DAO -> sqlSession -> DB 

}
