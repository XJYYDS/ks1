<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<form action="/ks/t_detail/addT" method="get">
		
		业务序号:<input type="text" name="bId" value="${sessionScope.t_business.bId }"><br>
		排队号:<input typt="text" name="bNum" value="${sessionScope.t_business.bNum }"><br>
		业务类型:<input type="text" name="bType" value="${sessionScope.t_business.bType }"><br>
		备注信息:<input type="text" name="bMark" value="${sessionScope.t_business.bMark }"><br>
		详细名称:<input type="text" name="bdName"><br>
		办理人:<input type="text" name="bdPerson"><br>
		<input type="submit" value="确认添加">
		
		
	</form>
</body>
</html>
