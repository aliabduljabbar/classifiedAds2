<%-- 
    Document   : header
    Created on : Jan 2, 2015, 11:10:46 AM
    Author     : Ali
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div id="mystyle" style="border: none;">
            <h1>Classified Ads Beta</h1>
            <p>
                <b>testing of ad, edit and delete functionality of ads</b><br/>
                <%=new Date()%></br>  </br>
            
                <a href="postAd.jsp">Post a New Ad</a> &NegativeThickSpace; |
                <a href="browseAd.jsp">Browse Ads</a>
                
                &nbsp; &nbsp; &nbsp; 
                <% 

                    String username = (String)session.getAttribute("username");
                    if(username == null) {
                %>
                
                <a href="login.jsp">Login</a>  &NegativeThickSpace; |
                <a href="registration.jsp" >Sign Up</a>
                
                <%
                    } else {
                %>
                <a href="account.jsp" ><%=username%></a> &NegativeThickSpace; |
                <a href="registration.jsp" >Sign Up</a>
                <%
                    }
                %>
            </p>
        </div>
    </center>
</body>
