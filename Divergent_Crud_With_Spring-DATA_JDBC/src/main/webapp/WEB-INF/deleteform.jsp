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
  <form action="delete" method="POST">
   <table align="center">
    <tr>
     <td>Student ID</td>
     <td><input type="text" name="sid"/></td>
    </tr>
    <tr>
     <td><input type="submit" value="DELETE Student"/></td>
    </tr>
   </table>
  </form>
</body>
</html>