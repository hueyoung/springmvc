<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="form">
		<input type="text" value="请输入姓名:" name="name"/>
		<input type="text" value="请输入年龄:" name="age"/> 
		<input type="submit" value="提交"/>
	</form>
	
	<%-- <sf:form method="post" modelAttribute="user">
		<sf:input type="text" value="请输入姓名" path="name"/> 
		<sf:input type="text" value="请输入年龄" path="age"/> 
		<input type="submit" value="提交sf"/>
	</sf:form> --%>
</body>
</html>