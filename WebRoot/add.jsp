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
  	<form action="/ks/t_business/add" method="post">
  		业务类型:<select name="bType">
                    <option>信用卡</option>
                    <option>现金业务</option>
                    <option>转账业务</option>
                </select><br>
                排队号<input type="text" name="bNum"><br>
                备注信息:<textarea rows="" cols="" name="bMark"></textarea><br>
  		<input type="submit" value="确认添加">
  	</form>
  </body>
</html>
