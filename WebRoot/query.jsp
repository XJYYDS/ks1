<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
	<table>
		<tr>
			<td>业务序号</td>
			<td>排队号</td>
			<td>业务类别</td>
			<td>备注信息</td>
			<td>详细编号</td>
			<td>详细名称</td>
			<td>办理人</td>
			<td>操作内容</td>
		</tr>
		<c:forEach items="${sessionScope.t_business }"  var = "t_business">
	<!--  	<c:forEach items="${sessionScope.t_detail }"  var = "t_detail">-->
			<tr>
				<td>${t_business.bId }</td>
				<td>${t_business.bNum }</td>
				<td>${t_business.bType }</td>
				<td>${t_business.bMark }</td>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>
				<a href="/ks/detail.jsp" >办理业务</a>
				<a href="/ks/t_business/del?bId=${t_business.bId }">删除业务</a>
				</td>
			</tr>
		</c:forEach>
		<!--</c:forEach>-->
	</table>
</body>
</html>
