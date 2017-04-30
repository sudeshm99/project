<%-- 
    Document   : login
    Created on : Apr 9, 2017, 2:12:42 PM
    Author     : Ruwani Jayarathna
--%>

<!DOCTYPE html>
<html lang="en">

    <head>
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


        <script src="public/js/modernizrr.js"></script>
        
        

       
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Login and Request DMR</title>
        <!--Start to link css files corresponding login form and request form-->
        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="public/loginfroms/css/form-elements.css">
        <link rel="stylesheet" href="public/loginfroms/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="public/loginfroms/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="public/loginfroms/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="public/loginfroms/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="public/loginfroms/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="public/loginfroms/ico/apple-touch-icon-57-precomposed.png">
        
        <!--Ending of linking css files corresponding to login form and request form-->

    </head>

    <body>
        <%@include file="mainNavigation.jsp" %>

        <!-- Top content -->
<!--        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        
                        Starting login form
                        <div class="col-sm-5">
                            <div class="form-box">
	                        <div class="form-top">
                                    <div class="form-top-left">
                                        <h3>Login to Digital Meter Reader</h3>
                                        <p>Enter username and password to log on:</p>
                                    </div>
                                    <div class="form-top-right">
	                        	<i class="fa fa-key"></i>
                                    </div>
                                </div>
                                
                                <div class="form-bottom">
				    <form role="form" action="LoginHandler" method="post" class="login-form">
                                        username input field in login form
				        <div class="form-group">
				            <label class="sr-only" for="form-username">Username</label>
                                            <input type="text" name="username" placeholder="Username..." class="form-username form-control" id="form-username" >
				        </div>
                                        password input field in login form        
				        <div class="form-group">
				            <label class="sr-only" for="form-password">Password</label>
                                            <input type="password" name="password" placeholder="Password..." class="form-password form-control" id="form-password" >
				        </div>
                                        Submit button in login form
				        <button type="submit" class="btn">Sign in!</button>
				    </form>
			        </div>
		            </div>
		        </div>-->
                        <!--Ending login form-->
	                        
                       
                        
                        
                        <div class="col-sm-1"></div>
                        <!--Starting request form-->
                        <div class="col-sm-5">
                        	<div class="form-box">
                                    <div class="form-top">
	                        	<div class="form-top-left">
                                            <h3>Sign up now</h3>
                                            <p>Fill in the form below to request for a Digital Meter :</p>
	                        	</div>
                                            <div class="form-top-right">
                                                <i class="fa fa-pencil"></i>
                                            </div>
	                            </div>
	                            <div class="form-bottom">
				        <form role="form" action="RequestFormHandling" method="post" class="registration-form">
				            <div class="form-group">
				                <label class="sr-only" for="form-first-name">First name</label>
				                <input type="text" name="firstname" placeholder="First name..." class="form-first-name form-control" id="form-first-name">
				            </div>
				            <div class="form-group">
				                <label class="sr-only" for="form-last-name">Last name</label>
				                <input type="text" name="lastname" placeholder="Last name..." class="form-last-name form-control" id="form-last-name">
				            </div>
                                            <div class="form-group">
				                <label class="sr-only" for="form-address">Address</label>
				                <input type="text" name="address" placeholder="Address..." class="form-email form-control" id="form-email">
				            </div>
                                                        
                                            <div class="form-group">
                                                <label class="sr-only" for="form-national_id">National ID No</label>
				                <input type="text" name="nationalId" placeholder="National ID No..." class="form-email form-control" id="form-email">
				            </div>
				            <div class="form-group">
				                <label class="sr-only" for="form-email">Email</label>
                                                <input type="text" name="email" placeholder="Email..." class="form-email form-control" id="form-email">
				            </div>
                                            <div class="form-group">
				                <label class="sr-only" for="form-mobilenumber">Mobile Number</label>
                                                <input type="text" name="mobilenumber" placeholder="Mobile No..." class="form-email form-control" id="form-email">
				            </div>
				            <div class="form-group">
				                <label class="sr-only" for="form-email">Electricity Account No</label>
				                <input type="text" name="electricityAccount" placeholder="Electricity Account No..." class="form-email form-control" id="form-email">
				            </div>
                                            <div class="form-group">
				                <label class="sr-only" for="form-area-office">Area Office</label>
				                <input type="text" name="areaOffice" placeholder="Area Office..." class="form-email form-control" id="form-email">
				            </div>
                                            
                                            <button type="submit" class="btn" style="background-color: #5368C8;">Register</button>
				        </form>
                                    </div>
                                </div>
                        </div>
                        <!--Ending request form-->
                    </div>
                </div>
            </div>
        </div>
                        

        
        <!-- Javascript -->
        <script src="public/loginfroms/js/jquery-1.11.1.min.js"></script>
        <script src="public/loginfroms/bootstrap/js/bootstrap.min.js"></script>
        <script src="public/loginfroms/js/jquery.backstretch.min.js"></script>
        <script src="public/loginfroms/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>
