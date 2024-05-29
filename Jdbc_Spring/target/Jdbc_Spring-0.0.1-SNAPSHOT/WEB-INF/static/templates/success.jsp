<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="mvc.model.*, java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <c:forEach items="${sobjs}" var="s" varStatus="loop">
        <h1>
            Sno   : ${loop.index + 1}<br>
            roll number: ${s.sroll}<br>
            Name: ${s.sname}<br>
            Marks: ${s.smarks}<br>
            Section: ${s.ssection}<br>
            Department: ${s.sdept}<br><br><br>
            <hr>
        </h1>
    </c:forEach>

    <button>Click Me</button>
</body>
</html>
