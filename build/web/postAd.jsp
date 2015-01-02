<%-- 
    Document   : postAd
    Created on : Jan 2, 2015, 11:09:48 AM
    Author     : Ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title>Post a New Ad</title>
    </head>
    
    <body>
        <%@include file="header.jsp"%>
        <form method="post" action="PostAdServlet">
            <div id="mystyle" class="myform">
                <form id="form" name="form" action="AddNewEmployee" method="post">
                    <h1>Ad</h1>
                    <p>To Post new Ad enter following information</p>
                    <label>Ad ID<span class="small">Enter Ad ID</span></label>
                    <input type="text" name="id" id="id" />
                    
                    <label>Title<span class="small">Enter title</span></label>
                    <input type="text" name="title" id="title" />
                    <label>User_ID<span class="small">Enter user_id</span></label>
                    <input type="text" name="user_id" id="user_id" />
                    <label>Description<span class="small">Enter Description</span></label>
                    <input type="text" name="description" id="description" />
                    <label>Price<span class="small">Enter Price</span></label>
                    <input type="text" name="price" id="price" />
                    <label>Activeness<span class="small">Enter 1 if it'll be Active</span></label>
                    <input type="text" name="active" id="active" />                            
                    <label>cat_id<span class="small">Enter Category_ID</span></label>
                    <input type="text" name="cat_id" id="cat_id" />                            
                    <button type="submit">Post This Ad</button>
                    <div class="spacer"></div>
                </form>
            </div>
        </form>
    </body>
</html>
