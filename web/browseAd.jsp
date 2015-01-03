<%--
    Document   : browseAd
    Created on : Jan 2, 2015, 11:10:09 AM
    Author     : Ali
--%>

<%@page import="classifiedAds.model.User"%>
<%@page import="classifiedAds.service.AdBean"%>
<%@page import="classifiedAds.model.Ad"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title>Browse Ads</title>
    </head>
    <body>
    
        <%@include file="header.jsp"%>
    <center>
        <% User user = (User) session.getAttribute("user");
        if (user != null) { %>
            Welcome <% user.getName(); } %>
    </center>
        <div>
            <table>
                <thead>
                    <tr>
                        <th>AD ID</th>
                        <th>Title</th>
                        <th>user_id</th>
                        <th>Description</th>
                        <th>Price</th>
                        <th>active</th>
                        <th>cat_id</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        AdBean eb = new AdBean();
                        List<Ad> list = eb.getAds();
                        
                        for (Ad e : list) {
                    %>
 
                    <tr>
                        <td><%=String.valueOf(e.getId())%></td>
                        <td><%=e.getTitle()%></td>
                        <td><%=String.valueOf(e.getUser_id())%></td>
                        <td><%=e.getDescription()%></td>
                        <td><%=String.valueOf(e.getPrice())%></td>
                        <td><%=String.valueOf(e.getActive())%></td>
                        <td><%=String.valueOf(e.getCat_id())%></td>
                        <td style="border: none;">
                            <div>
                                <form method="post" action="editAd.jsp">
                                    <input type="hidden" id="id" name="id" value="<%=String.valueOf(e.getId())%>"/> 
                                    <input type="submit" value="Modify..."/> 
                                </form>
                            </div>
                        </td>
                        
                        <td style="border: none;">
                            <div>
                                <form method="post" action="DeleteAdServlet">
                                    <input type="hidden" id="delId" name="delId" value="<%=String.valueOf(e.getId())%>"/> 
                                    <input type="submit" value="Delete"/> 
                                </form>
                            </div>
                        </td>
                        
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>