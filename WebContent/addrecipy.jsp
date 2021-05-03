<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.mid
{
  text-align: center;
}
table,th
{
	padding: 10px 10px ;
	
}

</style>
</head>
<body style="background-color:#ffae33">
<h1 class="mid">Your Recipy!</h1><br><br>
<h2 style="text-align:center">
<%=request.getAttribute("result").toString()%>
</h2>   
</body>
</html>