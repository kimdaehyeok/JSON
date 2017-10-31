<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="/JSONExample/js/json2.js"></script>

<script>
var httpRequest;
var javascriptObject = 
	{
	    "name":"John",
	    "age":30,
	    "cars": 
	    [
	        { "name":"Ford", "models":[ "Fiesta", "Focus", "Mustang" ] },
	        { "name":"BMW", "models":[ "320", "X3", "X5" ] },
	        { "name":"Fiat", "models":[ "500", "Panda" ] }
	    ]
	};
var convertJSON = JSON.stringify(javascriptObject);

function ajaxSendJSONData()
{
	var sendURL = "http://localhost:8081/JSONExample/JSONArray.do";
	httpRequest = new XMLHttpRequest();
	httpRequest.onchangestatechange = alertJSONData();
	
	httpRequest.open('POST',sendURL,true);
	httpRequest.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	httpRequest.send("param=" + convertJSON);
}

function alertJSONData()
{
	if(httpRequest.readyState == 4)
	{
		if(httpRequest.status == 200)		
		{
			alert(httpRequest.responseText);
		}
	}
}
</script>

<body>
	<input type = "button" value = "send JSON by AJAX" onclick = "ajaxSendJSONData()" />
</body>
</html>