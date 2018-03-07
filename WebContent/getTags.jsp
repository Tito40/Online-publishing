<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.jsp"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Tag</title>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div STYLE="margin: auto; width: 50%; border: 3px solid green; padding: 10px;">
<br>
<br>
<br>
<h1 STYLE="text-align: center;">Please press desired tag</h1>
<form action="/PubHub/TagServlet" method="Get" id=reviewform>
<table>
<tr><td>&nbsp</td><td>&nbsp</td></tr>
<tr><td>&nbsp</td><tr/>
<tr><td>&nbsp</td><tr/> 
<tr><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><td><input type="radio" name="rad" value="Dumb">Dumb<br></td><tr>
<tr><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><td><input type="radio" name="rad" value="Fair">Fair<br></td><tr>
<tr><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><td><input type="radio" name="rad" value="Good">Good<br></td><tr>
<tr><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><td><input type="radio" name="rad" value="Great">Great<br></td><tr>
<tr><td>&nbsp</td><tr/>
<tr><td>&nbsp</td><tr/>
<tr><td>&nbsp</td><tr/>
<tr><td>&nbsp</td><td><input STYLE="text-align: center;" type="submit"></td></tr>
</table>
</form>
</div>

</body>
</html>