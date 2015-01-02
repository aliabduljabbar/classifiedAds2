<%--
    Document   : EditAd
    Created on : Jan 2, 2015, 11:09:56 AM
    Author     : Ali
--%>


<%@page import="classifiedAds.model.Ad"%>
<%@page import="classifiedAds.service.AdBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title>Employee Update Page</title>
    </head>
    <body>
        <%@include file="header.jsp"%>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            AdBean eb = new AdBean();
            Ad e = eb.getAd(id);
        %>
        <div id="mystyle" class="myform">
            <form id="form" name="form" action="EditAdServlet" method="post">
                <h1>Update Ad ID:<%=e.getId()%></h1>
                <p>Modify the following information to update Ad ID:<%=e.getId()%></p>
                <label><input type="hidden" name="adid" id="adid" value="<%=e.getId()%>"/><span class="small"></span></label>                    
                
                <label>Title<span class="small">Enter title</span></label>
                    <input type="text" name="title" id="title" value="<%=e.getTitle()%>"/>
                    <label>User_ID<span class="small">Enter user_id</span></label>
                    <input type="text" name="user_id" id="user_id"  value="<%=e.getUser_id()%>"/>
                    <label>Description<span class="small">Enter Description</span></label>
                    <input type="text" name="description" id="description"  value="<%=e.getDescription()%>"/>
                    <label>Price<span class="small">Enter Price</span></label>
                    <input type="text" name="price" id="price"  value="<%=e.getPrice()%>"/>
                    <label>Activeness<span class="small">Enter 1 if it'll be Active</span></label>
                    <input type="text" name="active" id="active"  value="<%=e.getActive()%>"/>                            
                    <label>cat_id<span class="small">Enter Category_ID</span></label>
                    <input type="text" name="cat_id" id="cat_id"  value="<%=e.getCat_id()%>"/> 
                <button type="submit">Update Ad</button>
                <div class="spacer"></div>
            </form>
        </div>   
    </body>
</html>