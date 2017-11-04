<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/JSONExample/js/json2.js"></script>

<body>
	<c:out value="${users}"></c:out></br>
	
	<p id="setDataByScript"></p>
</body>

<script>
	var text="";
	var index;
	var object = JSON.parse('<%=request.getAttribute("users")%>');
	
	for(index = 0; index < object.length; index++)
	{
		text = text + object[index].name + " " + object[index].gender + "<br>";
	}
	
	alert(text);
	
	document.getElementById("setDataByScript").innerHTML = text;
</script>
</html>