<%-- 
    Document   : addUserDetailsOutcome
    Created on : 11 Feb 2024, 7:09:51 PM
    Author     : Sandiso
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add user Details Outcome Page</title>
    </head>
    <body>
        <h1>Add user Details Outcome</h1>
        <%
            String name = (String)request.getAttribute("name");
            String age = (String)request.getAttribute("age");
            String title = (String)request.getAttribute("title");
        %> 
        <p>
            Hello <b><%=title%> <%=name%></b>. Good to know that you're <b><%=age%></b> years old.
        </p>
        
        <p>
            Please click <a href="index.html">here</a> to go back the main page.
        </p>
    </body>
</html>
