<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:include page="/WEB-INF/homepage.jsp"/>
  <form action="update" method="POST">
   <table align="center">
    <tr>
     <td>Student ID</td>
     <td><input type="text" value="${std.getSid()}"/></td>
     <td><input type="hidden" name="sid" value="${std.getSid()}"/></td>
    </tr>
    <tr>
     <td>Student Name</td>
     <td><input type="text" name="sname" value="${std.getSname()}"/></td>
    <tr>
    <tr>
     <td>Student Address</td>
     <td><input type="text" name="saddr" value="${std.getSaddr()}"/></td>
    </tr>
    <tr>
     <td><input type="submit" value="UPDATE Student"/></td>
    </tr>
   </table>
  </form>
</body>
</html>