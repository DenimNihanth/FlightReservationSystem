<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fake My Trip</title>
</head>
<body bgcolor="cyan">
<center>
<%
HttpSession hs=request.getSession(false);
Object ob=hs.getAttribute("username");
Object ob1=hs.getAttribute("user");
if(ob!=null){
String S=(String)ob;
%>
<h1>Welcome <%=S %></h1>
<%}else{ %>
<h1>No username found</h1>
<%}
if(ob1!=null)
{
	String S=(String)ob1;
	System.out.println(S);
	
}
%>
<a href="index.html">click here</a>


</center>

</body>
</html>