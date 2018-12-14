<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
如果web.xml中的配置是
	<servlet-mapping>
		<servlet-name>springDispatcherServlet</servlet-name>
		<url-pattern>.action</url-pattern>
	</servlet-mapping>
	
	<a href="welcome.action"> first springmvc - welcome</a>交由springmvc处理，找@RequestMapping映射
	<a href="welcome.action"> first springmvc - welcome</a>交由springmvc处理，找@RequestMapping映射
	<a href="welcome"> first springmvc - welcome</a>		交由servlet处理，找url-parttern/@WebServlet()

 -->
	<a href="handler/welcome3/abc/xyz/test"> 333 first springmvc -
		welcome</a>
	<br />
	<a href="handler/welcome4/amc/test"> 444 first springmvc - welcome</a>
	<br />
	<a href="handler/welcome5/zs"> 555 first springmvc - welcome</a>
	<br />

	<form action="handler/welcome" method="post">
		name:<input name="name"><br /> age:<input name="age"><br />
		height:<input name="height"><br /> <input type="submit"
			value="post">
	</form>


	<form action="handler/testRest/1234" method="post">
		<input type="submit" value="增">
	</form>
	<br/>---关于delete和put请求方式，还不能正常使用，原因未知，暂时跳过<br />
	<form action="handler/testRest/1234" method="post">
		<input type="hidden" name="_method" value="DELETE" />
		<input type="submit" value="删">
	</form>
	<form action="handler/testRest/1234" method="post">
		<input type="hidden" name="_method" value="PUT" />
		<input type="submit" value="改">
	</form>
	<form action="handler/testRest/1234" method="get">
		<input type="submit" value="查">
	</form>
	==============<br/>
	<form action="handler/testParam">
		name:<input name="uname" type="text">
		
		<input type="submit" value="查">
	</form>
	
	<a href="handler/testRequestHeader">testRequestHeader</a>
</body>
</html>