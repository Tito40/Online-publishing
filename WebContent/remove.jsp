<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.jsp"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/PubHub/Remove" method="Post" name="move">
<table STYLE="position: relative; top: 200px; left: 100px;">
<tr><td>ISBN <input type="text" name="ISBN"></td><td></td><tr>
<tr><td>&nbsp</td><tr>
<tr><td>&nbsp</td><tr>
<tr><td><input type="radio" name="rad" value="Dumb">Dumb<br></tr>
<tr><td><input type="radio" name="rad" value="Fair">Fair<br></tr>
<tr><td><input type="radio" name="rad" value="Good">Good<br></tr>
<tr><td><input type="radio" name="rad" value="Great">Great<br></tr>
<tr><td>&nbsp</td><tr>
<tr><td>&nbsp</td><tr>
<tr><td><input type="submit" name="ISBNII"></input></td><tr>
</table>
</form>
</body>
</html>