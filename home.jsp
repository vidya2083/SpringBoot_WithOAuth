<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Welcome to ABC Travels</title>
</head>
<body>

 
 <form:form method="POST" action="searchFlightsService.htm">
  <h1>Welcome to ABC Travels</h1>
 <br><br>
 <div align="right" > Welcome <c:out value= "${pageContext.request.remoteUser}"></c:out> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <a href="/logout">Logout</a></div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <center>
         
         <%
        String x= request.getRemoteUser();
        %>
       
        <%
         session.setAttribute("userName",x); %>              
               
  <input type="submit" value="Search Flights"/>
  </tr>
  </table>
  </center>
  </form:form>
</body>
</html>