<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
hello jsp <br>
<%
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	out.print(" driver loading success !");
} catch(Exception e){
	e.printStackTrace();
} finally {
	if (null != stmt) stmt.close(); if (null != rs) rs.close(); if (null != conn) conn.close();
}
%>
</body>
</html>
