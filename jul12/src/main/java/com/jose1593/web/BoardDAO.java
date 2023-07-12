package com.jose1593.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/* @Controller == Controller 
 * @Service    == Service
 * @Repository => DAO 부를 때 사용
 */
@Repository
public class BoardDAO {
	// DB랑 연결할겁니다.
	@Autowired
	private SqlSession sqlSession;
}
