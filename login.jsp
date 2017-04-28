<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
    
    
        <form action="/login" method="post">
            <h1>Welcome to ABC Travels</h1>
            <br><br>
        <center>
            <h5> Please Login</h5>
            <br><br>
              <c:if test="${param.error ne null}">
        <div>
            Invalid username and password.
        </div>
     </c:if>
         <c:if test="${param.logout ne null}">
        <div>
            You have been logged out.
        </div>
      </c:if>
            <table border="1" align="center" cell-spacing="2"  cell-padding="10"> 
                  <tr align="justify"  height=40px width="3000 px"  cell-spacing="3"  cell-padding="5">
                    <td width="200px"> <label> ENTER USER ID :</label></td>
                    <td width="300px">
                  <input type="text" name="username"/>
                    
                      </td>
                </tr>

                  <tr align="justify"  height=40px width="3000 px"  cellspacing="3"  cellpadding="5">
                    <td width="200px"><label>ENTER PASSWORD :</label></td>
                    <td width="300px"><input type="password" name="password"/>
                 
                    
</td>
                </tr>

                  <tr align="center"  height=40px width="3000 px"  cell-spacing="1"  cell-padding="10">
                    <td colspan="2">
                        <input type="submit" value="Sign In"/>
                         <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    </td>
                </tr>
                
            <tr align="center"  height=40px width="3000 px"  cellspacing="1"  cellpadding="10">
                <td colspan="2">
                    <a href="register.htm">New User ?</a>
                </td>
            </tr>
</form>  
        </table>
    </center>
 
</body>
</html>
