<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/JSONExample/js/json2.js"></script>
<script>
	var obj = JSON.parse('<%=request.getAttribute("User")%>');
	alert(obj.name + "  " + obj.age);
</script>

<body>
	<c:out value="${intro}"></c:out></br>
	<c:out value="${User}"></c:out></br>
	<c:out value="${UserObject.name}"></c:out></br>
	<c:out value="${UserObject.age}"></c:out></br>
</body>
</html>