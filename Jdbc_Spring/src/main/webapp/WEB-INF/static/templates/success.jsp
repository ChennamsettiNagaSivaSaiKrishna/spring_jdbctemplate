<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.model.* ,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int i=1;
		List<Student> slist=(List<Student>)request.getAttribute("sobjs");
		for(Student s : slist){
	%>
	
	<h1>
		Sno   : <%=i++ %><br>
		roll number:<%= s.getSroll() %> <br>
		Name:<%= s.getSname() %><br>
		Marks:<%= s.getSmarks() %><br>
		Section:<%= s.getSsection() %><br>
		Department:<%= s.getSdept() %><br><br><br>
		<hr>
	</h1> 
	<%
		}	
	%>

<button>Click Me</button>
</body>
</html>