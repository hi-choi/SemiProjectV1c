<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!-- 로그인해야만 페이지가 보이도록 보안 설정-->
<c:if test="${empty sessionScope.userid}">
	<script>alert('로그인하세요!');
		location.href="/mvc/login";
	</script>
</c:if>

        <h2>회원정보</h2>
        <div id="myinfo">
                <div>
                    <span class="label">아이디</span>
                    <span><c:out value="${sessionScope.userid}" /></span>
                </div>
                <div>
                    <span class="label">이름</span>
                    <span><c:out value="${m.name}"/></span>
                </div>
                <div>
                    <span class="label">이메일</span>
                    <span><c:out value="${m.email}"/></span>
                </div>
                <div>
                    <span class="label">가입일</span>
                    <span><c:out value="${m.joindate}"/></span>
                </div>
        </div>
   