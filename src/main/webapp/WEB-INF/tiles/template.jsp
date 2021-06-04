<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!doctype>
<html>
<head lang="ko">
    <meta charset="UTF-8">
    <title>세미프로젝트v1-index</title>
    <link rel="stylesheet" type="text/css" href="/mvc/css/base.css">
    <link rel="stylesheet" type="text/css" href="/mvc/css/project.css">
</head>
<body>
    <div id="wrap">
    	<tiles:insertAttribute name="header" />

    <div id="container">
		<tiles:insertAttribute name="main" />
    </div>
		<tiles:insertAttribute name="footer"/>


    </div>
</body>
</html>