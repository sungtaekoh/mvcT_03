<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>get规侥 傈价</h1>
	<form action="${contextPath }/my/result" method="get">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="傈价" >
	</form>
	
	<h1>post规侥 傈价</h1>
	<form action="${contextPath }/my/result" method="post">
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="傈价" >
	</form>









</body>
</html>