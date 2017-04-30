<%-- 
    Document   : userHome
    Created on : Apr 21, 2017, 10:05:22 AM
    Author     : chamara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Responsive meta tag-->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <!--link to bootstrap css--> 
        <link rel="stylesheet" href="public/bootstrap/css/bootstrap.min.css" type="text/css">
        <!--Responsive CSS file-->
        <link rel="stylesheet" type="text/css" href="public/css/responsive.css">
        <title>Home page</title>
    </head>
    <body>
        <%@include file="adminDash.jsp" %>
        
        <!--Page content start from here-->
        <div id="page-wrapper">
            <div id="page-inner">
                <div class="row">
                    <!--Messages box--> 
                    <div class="col-md-3 col-sm-6 col-xs-6">           
			<div class="panel panel-back noti-box">
                            <span class="icon-box bg-color-red set-icon">
                                <i class="fa fa-envelope-o"></i>
                            </span>
                            <div class="text-box" >
                                <p class="main-text">120 New</p>
                                <p class="text-muted">Messages</p>
                            </div>
                        </div>
		    </div>
                
                
                <!--Remaining tasks-->
                <div class="col-md-3 col-sm-6 col-xs-6">           
                    <div class="panel panel-back noti-box">
                        <span class="icon-box bg-color-green set-icon">
                            <i class="fa fa-bars"></i>
                        </span>
                        <div class="text-box" >
                            <p class="main-text">30 Tasks</p>
                            <p class="text-muted">Remaining</p>
                        </div>
                    </div>
                   </div>
                <!--Notifications box-->
                    <div class="col-md-3 col-sm-6 col-xs-6">           
			<div class="panel panel-back noti-box">
                            <span class="icon-box bg-color-blue set-icon">
                                <i class="fa fa-bell-o"></i>
                            </span>
                            <div class="text-box" >
                                <p class="main-text">240 New</p>
                                <p class="text-muted">Notifications</p>
                            </div>
                        </div>
                    </div>
                
                    <div class="col-md-3 col-sm-6 col-xs-6">           
			<div class="panel panel-back noti-box">
                            <span class="icon-box bg-color-brown set-icon">
                                <i class="fa fa-rocket"></i>
                            </span>
                            <div class="text-box" >
                                <p class="main-text">3 Orders</p>
                                <p class="text-muted">Pending</p>
                            </div>
                        </div>
		    </div>
                </div>
            </div>
    </body>
</html>
