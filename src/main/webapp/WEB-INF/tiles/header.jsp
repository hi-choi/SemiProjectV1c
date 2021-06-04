<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <h1>SemiProject V1</h1>
    <nav>
       <ul>
            <li><a href="/mvc/index">Home</a></li>
            <li><a href="/mvc/join">회원가입</a></li>
            
            <c:if test="${empty sessionScope.userid}">
            	<li><a href="/mvc/login">로그인</a></li>
            </c:if>
            <c:if test="${!empty sessionScope.userid}">
            	<li><a href="/mvc/logout">로그아웃</a></li>
            </c:if>
            <li><a href="/mvc/board/list">게시판</a></li>
            <li><a href="/mvc/myinfo">회원정보</a></li>
        </ul>
    	<hr>
   </nav>
</header>
