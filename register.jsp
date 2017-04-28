<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>

    <body>
    <form:form method="POST" action="Success.htm" commandName="command">
        <h1>Welcome to ABC Travels</h1>
        <br><br>
        <center>
            <h5> Please Register</h5>
            <br><br>
            <table border="1" align="center">
                <tr align="center">
                    <td><form:label path="userId">ENTER USER ID : </form:label></td>
                    <td><form:input path="userId" />
                     <br><font color="red"/><form:errors path="userId"/>
                    </td>
                </tr>

                <tr align="center">
                    <td><form:label path="password">ENTER PASSWORD : </form:label></td>
                <td><form:password path="password" />
                <br> <font color="red"/><form:errors path="password"/>
                </td>
                </tr>

                <tr align="center">
                    <td><form:label path="name">ENTER NAME : </form:label></td>
                <td><form:input path="name" />
                <br> <font color="red"/><form:errors path="name"/>
                </td>
                </tr>

                <tr align="center">
                    <td><form:label path="city">ENTER CITY : </form:label></td>
                <td><form:input path="city" />
                 <br><font color="red"/><form:errors path="city"/>
                </td>
                </tr>

                <tr align="center">
                    <td><form:label path="email">ENTER EMAIL : </form:label></td>
                <td><form:input path="email" />
                 <br><font color="red"/><form:errors path="email"/>
                </td>
                </tr>

                <tr align="center">
                    <td><form:label path="phone">ENTER PHONE : </form:label></td>
                <td><form:input path="phone" />
                 <br><font color="red"/><form:errors path="phone"/>
                </td>
                </tr>

                <tr align="center">
                    <td colspan="2">
                        <input type="submit" value="REGISTER"/>
                    </td>
                </tr>
            </table>
        </center>
    </form:form>
</body>
</html>

