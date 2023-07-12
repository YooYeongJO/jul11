package com.jose1593.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/* Controller = 흐름 제어
 *            = 컨트롤 기능을 하는 인스턴스
 *            = 사용자의 요청이 들어오면 해당 URL에 맞는
 *            	페이지와 데이터를 보내줍니다.
 *            	
 * Service : 컨트롤하고 DB사이에 프로그램 로직 
 * 
 * DTO / VO =  
 * DAO = 데이터베이스와 연결되어서 작업합니다. => mybatis
 * 
 *  JSP = 보여주는 화면 (VIEW)
 * 
 * 사용자 -> 컨트롤러 -> 서비스 -> DAO -> mybatis -> DB 
 * 사용자 <- JSP + DB <= 컨트롤러 <- 서비스 <- DAO <- mybatis <- DB 
 * 
 * 연결 = DI 의존 주입
 * 1. @Autowired = 스프링에서 제공, 타입이 일치하는 녀석을 연결 
 * 2. @Inject    = 자바에서 제공, 타입이 일치하는 녀석을 연결
 * 3. @Resource  = 자바에서 제공, 이름이 일치하는 녀석을 연결
 * 
 * 
 * 
 * 스프링 기술
 * 
 * POJO (Plain Old Java Object)
 * 		어렵게 코딩하는 것이 아니라 간단하게 코딩하기
 * 
 * 
 * 1. DI(Dependency Injection) 의존 주입
 * 		프레임워크가 객체의 의존성 주입을 담당합니다. == IoC
 * 		
 * 
 * 2. IoC(Inversion of Control) 제어역전
 * 		프레임워크가 권한을 가져갑니다.
 * 		자바가 객체를 생성하고 서로 연결하고 사용하는데
 * 		이러한 기술을 IoC컨테이나가 관리, 서비스 해줍니다.
 * 		IoC컨테이너는 객체의 생성/초기화/서비스/소멸 --> (라이프사이클)
 * 					  라이프 사이클을 관리합니다.
 * 
 * 
 * 3. AOP(Aspect Oriented Programming) 관점지향 프로그래밍
 * 		객체지향과 다른 개념. 각 객체마다 중복되는 작업들이 있다면
 * 		해당 중복 작업을 기준으로 동일 행동을 하게 만드는 것.
 * 
 * 
 */
@Controller
public class BoardController {
	// 서비스와 연결하기 = Autowired (자동연결 해줍니다.)
	
	@Autowired
	private BoardService boardService; // 연결
	
	// 사용자의 어떤 요청이 들어오면 어떤 일을 하겠습니다.
	@RequestMapping(value = "/main")
	public String main() { // 위 문장과 연결되어서 /main이라는 요청이오면
		return "main"; // jsp파일명   // 아래 해당 jsp파일을 열어줍니다.
	//    /WEB-INF/views/main.jsp"
	}
	
	@GetMapping("/board")
	public ModelAndView board() {
		// model and view
		ModelAndView mv = new ModelAndView("board");
		mv.addObject("name", "홍길동");
		return mv; 
	}
}
