<%@page import="springmvc.bean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详情</title>

<link rel="stylesheet" type="text/css" href="<%=basePath%>/style/css/common.css" />
</head>
<body>
	<h1>用户列表</h1>
		<h1 class="common">
			姓名：${name}
		</h1>
		<h1>
			年龄：${age}
		</h1>
		
		<a href="/rest/${name}/get">点击查询用户详情</a>
</body>
</html>