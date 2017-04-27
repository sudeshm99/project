<%-- 
    Document   : mainNavigation
    Created on : Apr 8, 2017, 11:10:17 AM
    Author     : chamara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><html lang="en" class="no-js"> <![endif]-->
<html lang="en">

    <head>

        <!-- Basic -->
        <title>Digital Meter Reader</title>

        <!-- Define Charset -->
        <meta charset="utf-8">

        <!-- Responsive Metatag -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">


        <!-- Bootstrap CSS  -->
        <link rel="stylesheet" href="public/bootstrap/css/bootstrap.min.css" type="text/css">

        <!-- Font Awesome CSS -->
        <link rel="stylesheet" href="public/font-awesome/css/font-awesome.min.css" type="text/css">

        <!-- Owl Carousel CSS -->
        <link rel="stylesheet" href="public/css/owl.carousel.css" type="text/css">
        <link rel="stylesheet" href="public/css/owl.theme.css" type="text/css">
        <link rel="stylesheet" href="public/css/owl.transitions.css" type="text/css">

        <!-- Css3 Transitions Styles  -->
        <link rel="stylesheet" type="text/css" href="public/css/animate.css">

        <!-- Lightbox CSS -->
        <link rel="stylesheet" type="text/css" href="public/css/lightbox.css">

        <!-- Sulfur CSS Styles  -->
        <link rel="stylesheet" type="text/css" href="public/css/style.css">

        <!-- Responsive CSS Style -->
        <link rel="stylesheet" type="text/css" href="public/css/responsive.css">
        
        <!--this CSS file created to customize navigation bar not by template owner-->
        <link rel="stylesheet" type="text/css" href="public/css/mainNavigation.css">

        <script src="public/js/modernizrr.js"></script>
        
        <!--Jquery pop up for login form-->
        <link rel="stylesheet" href="public/loginfroms/css/form-elements.css">
        <link rel="stylesheet" href="public/loginfroms/css/style.css">
                <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="public/loginfroms/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="public/loginfroms/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="public/loginfroms/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="public/loginfroms/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="public/loginfroms/ico/apple-touch-icon-57-precomposed.png">
        
        <!--Ending of linking css files corresponding to login form and request form-->
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        
<!--        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
        <style>
            .modal-header, h4, .close {
            background-color: #5368C8;
            color:white !important;
            text-align: center;
            font-size: 30px;
            font-family: 'Arial', sans-serif;
         } 
         .modal{
                border-radius: 20px;
                background-color: transparent; 
                margin:30px auto 0;
                padding:6px;  
    
                position:absolute;
                width:800px;
                top: 30%;
                left: 50%;
                margin-left: -400px; 
                margin-top: -40px;
         }
         
         .modal-content{width :80%;height: 80%;}
                
               
         
         
         
       </style>
        
        

 
        
<!--        JavaScrpit linking -->
<!--        <script src="public/js/jquery-2.1.3.min.js"></script>
        <script src="public/js/jquery-migrate-1.2.1.min.js"></script>
        <script src="public/bootstrap/js/bootstrap.min.js"></script>-->





    </head>
    
    <body>

        <header class="clearfix">
            <!-- Start  Logo & Naviagtion  -->
            <div class="navbar navbar-default navbar-top">
                <div class="container">
                    <div class="navbar-header">
                        <!-- Stat Toggle Nav Link For Mobiles -->
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <i class="fa fa-bars"></i>
                        </button>
                        <!-- End Toggle Nav Link For Mobiles -->
                        <a class="navbar-brand" href="index.jsp">Digital Meter Reader</a>
                    </div>
                    <div class="navbar-collapse collapse">

                        <!-- Start Navigation List -->
                        <ul class="nav navbar-nav navbar-right">

                            <li>
                                <a href="#"  data-toggle="modal" data-target="#myModal"><i class="fa fa-user" aria-hidden="true"></i>&nbsp;Log In</a>
                               
                            </li>
                            <li>
                                <a href="sign_In.jsp" ><i class="fa fa-user" aria-hidden="true"></i>&nbsp;Request DMR</a>
                               
                            </li>
                        </ul>
                            
                        <!-- End Navigation List -->
                    </div>
                </div>
            </div>
            
            <!-- End Header Logo & Naviagtion -->

        </header>
        
        
        <div class="modal fade" id="myModal" role ="dialog">
            <div class="modal-dialog">
                <div class="modal-content">
                     <div class="modal-header" style="padding:35px 50px; margin-bottom:0px;">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4><span class="glyphicon glyphicon-lock"></span> Login</h4>
                    </div>
                    
                        <div class="form-box">
                            <div class="col-sm-4">
                                <div  class="form-box">
                                   
                                </div>
                            </div>
                            <div class="form-bottom">
                                <form role="form" action="LoginHandler" method="post" class="login-form">
<!--                                        username input field in login form-->
				        <div class="form-group">
				            <label class="sr-only" for="form-username">Username</label>
                                            <input type="text" name="username" placeholder="Username..." class="form-username form-control" id="form-username" >
				        </div>
<!--                                        password input field in login form        -->
				        <div class="form-group">
				            <label class="sr-only" for="form-password">Password</label>
                                            <input type="password" name="password" placeholder="Password..." class="form-password form-control" id="form-password" >
				        </div>
<!--                                        Submit button in login form-->
                                        <button type="submit" class="btn" style="background-color:#5368C8;">Sign in!</button>
				    </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        
        
            
        

        
        
        
        
        
   
             
        
                        
            
                        
        
        
            
            
        
        
                      
        
        
        <!-- Sulfur JS File -->

<!--        <script src="public/js/owl.carousel.min.js"></script>
        <script src="public/js/jquery.appear.js"></script>
        <script src="public/js/jquery.fitvids.js"></script>
        <script src="public/js/jquery.nicescroll.min.js"></script>
        <script src="public/js/lightbox.min.js"></script>
        <script src="public/js/count-to.js"></script>
        <script src="public/js/styleswitcher.js"></script>

        <script src="public/js/map.js"></script>
        <script src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
        <script src="public/js/script.js"></script>-->
    </body>
</html>
