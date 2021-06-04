<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<h1>성적 리스트</h1>

<table>
	<tr>
		<th>번호</th><th>이름</th>
		<th>국어</th><th>영어</th><th>수학</th><th>등록일</th>
	</tr>
	<c:forEach var="sj" items="${sjs}">
	<tr>
		<td>${sj.sjno}</td><td>${sj.name}</td>
		<td>${sj.kor}</td><td>${sj.eng}</td><td>${sj.mat}</td><td>${fn:substring(sj.regdate,0,10)}</td>
	</tr>
	</c:forEach>
</table>