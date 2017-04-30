<%-- 
    Document   : blank
    Created on : Apr 15, 2017, 11:47:27 PM
    Author     : Ruwani Jayarathna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
﻿<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Free Bootstrap Admin Template : Binary Admin</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
   <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="userDash.html">Digital Meter Reader</a> 
            </div>
            
            <%
                
                String loggeduser = (String)session.getAttribute("loggedUsername");
                String welcomeMsg = "Hello " +loggeduser;                                                    
            %>
            <div style="color: white;padding: 15px 50px 5px 50px; float: right;font-size: 16px;">
                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle" data-toggle="dropdown" type="button"><i class="fa fa-user"></i>&nbsp;<%=welcomeMsg%>
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#"><i class="fa fa-edit"></i>&nbsp;&nbsp;Edit Profile</a></li>
                        <li><a href="index.jsp"><i class="fa fa-power-off"></i>&nbsp;&nbsp;Log out</a></li>
                    </ul>
                    
                
                
                </div>
            </div>

        </nav>   
           <!-- /. NAV TOP  -->
                <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
				<li class="text-center">
                    <img src="assets/img/find_user.png" class="user-image img-responsive"/>
					</li>
				
					
                    <li>
                        <a  href="HomeServlet"><i class="fa fa-dashboard fa-3x"></i> Home</a>
                    </li>
                      <li>
                        <a  href="ui.jsp"><i class="fa fa-desktop fa-3x"></i> UI Elements</a>
                    </li>
                    <li>
                        <a  href="tab_panel.jsp"><i class="fa fa-qrcode fa-3x"></i> Tabs & Panels</a>
                    </li>
						   <li  >
                        <a  href="chart.jsp"><i class="fa fa-bar-chart-o fa-3x"></i> StatisticSs</a>
                    </li>	
                      <li>
                        <a  href="table.jsp"><i class="fa fa-table fa-3x"></i> Table Examples</a>
                    </li>
                    <li>
                        <a  href="form.jsp"><i class="fa fa-edit fa-3x"></i> Forms </a>
                    </li>
                    <li  >
                        <a  href="form.jsp"><i class="fa fa-edit fa-3x"></i>Analytical</a>
                    </li>
                    
					
					                   

                  	
                </ul>
               
            </div>
            
        </nav>  
        <!-- /. NAV SIDE  -->
        
         <!-- /. PAGE WRAPPER  -->
        </div>
     <!-- /. WRAPPER  -->
    <!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
    <!-- JQUERY SCRIPTS -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- BOOTSTRAP SCRIPTS -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- METISMENU SCRIPTS -->
    <script src="assets/js/jquery.metisMenu.js"></script>
      <!-- CUSTOM SCRIPTS -->
<!--    <script src="assets/js/custom.js"></script>-->
    
   
</body>
</html>
