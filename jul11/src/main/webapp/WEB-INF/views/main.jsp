<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> <%-- <%@ => @를 붙이면 선언  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main</h1>
 	${mame }<br> <%-- homeController.java 파일 mame 이름 맞춰줌 --%>
 	JSTL / EL <br>
  	<c:forEach begin="1" end="10" var="i">   
  	
  		<c:choose>
  			<c:when test="${i eq 3 }">
  				삼입니다.<br>
  			</c:when>
  			
  			<c:otherwise>
  				${i }<br>
  			</c:otherwise>		
  		</c:choose>
   		 
 	</c:forEach>
 	
 	set       k = 케이<br>
  	<c:set var="k" value="케이"></c:set> <%-- var 변수명 --%>
 	<c:set var="k">새로운 값</c:set>
 	${k }
 	<br>
 	out = ${var }
 	<c:out value="글자"></c:out>
 	<c:out value="${k }"></c:out>
 	M = Model
 	V = View
 	C = Controller
 	
 	<c:remove var="k"/>
	${k }
	<hr>
	<c:forEach items="${list }" var="i"> 
		${i }<br>
	</c:forEach>
	
<%--  	<% %> => servlet 태그 --%>
</body>
</html>