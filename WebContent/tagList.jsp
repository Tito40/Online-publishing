<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<jsp:include page="header.jsp"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div STYLE="margin: auto; width: 50%; border: 3px solid green; padding: 10px;"><h1>Book List</h1><table><tbody><c:forEach var="lits" items="${list}">
																												<tr bgcolor="#00FFFF"><td>Tag:</td></tr>
																												<tr><td><c:out value="${lits.tag}"/></td></tr>
																												<tr bgcolor="#00FFFF"><td>Title:</td></tr>
																												<tr><td><c:out value="${lits.title}"/></td></tr>
																												<tr bgcolor="#00FFFF"><td>ISBN:</td></tr>
																									      		<tr><td><c:out value="${lits.isbn}"/></td></tr>
																									      		<tr><td>&nbsp</td></tr>
																										 		</c:forEach></tbody></table></div>  
</body>
</html>