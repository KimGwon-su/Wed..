<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날좀 봐주시게</title>
</head>
<body>
	<form action="<c:url value="/class/data/write"/>" method="post">
		게시판 목록
		<select name = "boardType">
			<c:forEach items="${boardTypes}" var="board">
				<option value = "${board.id }">${board.title }</option>
			</c:forEach>
		</select><br>
			제목 : <input name = 'title' type='text'/><br>
			내용 : <input  name = 'content' type='text'/><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>