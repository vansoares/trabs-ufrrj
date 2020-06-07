<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Buscar | WS book's</title>
    <link href="multicolor-4/css/bootstrap.min.css" rel="stylesheet">
    <link href="multicolor-4/css/font-awesome.min.css" rel="stylesheet">
    <link href="multicolor-4/css/animate.min.css" rel="stylesheet"> 
    <link href="multicolor-4/css/lightbox.css" rel="stylesheet"> 
	<link href="multicolor-4/css/main.css" rel="stylesheet">
	<link href="multicolor-4/css/responsive.css" rel="stylesheet">     
    <link rel="shortcut icon" href="multicolor-4/images/ico/favicon.ico">
    
    <link rel="stylesheet" href="multicolor-4/css/star-rating.css" media="all" rel="stylesheet" type="text/css"/>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="js/star-rating.js" type="text/javascript"></script>
    
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
	<script src="multicolor-4/css/jquery.autocomplete.css"></script>  
	<script src="multicolor-4/css/jquery-ui.css"></script>  
	<script src="multicolor-4/js/jquery-ui-1.9.2.custom.min.js"></script>  
	
    <script src="multicolor-4/sweetalert-master/dist/sweetalert.min.js"></script>
	 <link rel="stylesheet" type="text/css" href="multicolor-4/sweetalert-master/dist/sweetalert.css">
    <link href="multicolor-4/jquery/jquery-ui.css" rel="stylesheet">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="multicolor-4/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="multicolor-4/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="multicolor-4/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="multicolor-4/images/ico/apple-touch-icon-57-precomposed.png">
</head><!--/head-->

<body>
	<header id="header">      
        
                
                  <div class="navbar navbar-inverse" role="banner">
            <div class="container">
                
                
                
                
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="homeUsuario.jsp">
                    	<h1><img src="multicolor-4/images/logo.png" alt="logo"></h1>
                    </a>
                    
                     
                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown"><a href="homeUsuario.jsp">Home</a></li>
                        <li class="dropdown"><a href="buscarLivro.jsp">Livros <i class="fa fa-angle-down"></i></a>
                            <ul role="menu" class="sub-menu">
                                <li class="active"><a href="buscarLivro.jsp">Buscar</a></li>
                                <li><a href="CadastroLivro.jsp">Inserir</a></li>
                            </ul>
                        </li>
                       
                        <li class="dropdown"><a href="#">${usuarioLogado}<i class="fa fa-angle-down"></i></a>
                            <ul role="menu" class="sub-menu">
                                <li><a href="profile.jsp">Profile</a></li>
                                <li><a href="deslogar.jsp">LOGOUT</a></li>
                                
                            </ul>
                        </li>
                                 
                    </ul>
                </div>
             
            </div>
        </div>
               
            </div>
        </div>
    </header>
  
  <section id="page-breadcrumb">
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">
                            <h1 class="title">Busca</h1>
                           
                        </div>
                     </div>
                </div>
            </div>
        </div>
   </section>

 <br>
 <br>
     <div class="container">
                    <div class="row">
                        
                        <div class="col-md-12">
                            <ul id="tab1" class="nav nav-tabs">
                                <li class="active"><a href="#tab1-item1" data-toggle="tab">Título</a></li>
                                <li><a href="#tab1-item2" data-toggle="tab">Autores</a></li>
                                <li><a href="#tab1-item3" data-toggle="tab">Editoras</a></li>
                               <!--   <li><a href="#tab1-item4" data-toggle="tab">ISBN</a></li> -->
                                <li><a href="#tab1-item5" data-toggle="tab">Ano de Lançamento</a></li>
                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane fade active in" id="tab1-item1">
                                    <%@ include file="buscaTitulo.jspf" %>
                                </div>

                                <div class="tab-pane fade" id="tab1-item2">
                                    <%@ include file="buscaAutor.jspf" %>
                                </div>
                                <div class="tab-pane fade" id="tab1-item3">
                                    <%@ include file="buscaEditora.jspf" %>
                                </div>
                                <div class="tab-pane fade" id="tab1-item5">
                                    <%@ include file="buscaAno.jsp" %>
                                </div>
                            </div>
                        </div>
                </div>
            </div>

   <br>
   <br>
   <br>
    <footer id="footer">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 text-center bottom-separator">
                    <img src="multicolor-4/images/home/under.png" class="img-responsive inline" alt="">
                </div>
             

                <table>
                    <thead>
                        <tr><h2 class="page-header">Frases</h2></tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><blockquote>
                                    <p>Quem lê muito e anda muito, vai longe e sabe muito.</p>
                                    <footer><cite title="Source Title">Cervantes, Miguel</cite></footer>
                                </blockquote></td>
                            <td><blockquote>
                                    <p>Dupla delícia</p>
                                    <p>O livro traz a vantagem de a gente poder estar só e ao mesmo tempo acompanhado.</p>
                                    <footer><cite title="Source Title">Quintana, Mario</cite></footer>
                                </blockquote>
                            </td>
                        </tr>
                    </tbody>
                </table>
               
                <div class="col-sm-12">
                    <div class="copyright-text text-center">
                        <p>&copy; Your Company 2014. All Rights Reserved.</p>
                        <p>Designed by <a target="_blank" href="http://www.themeum.com">Themeum</a></p>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!--/#footer-->

    <script type="text/javascript" src="multicolor-4/js/jquery.js"></script>
    <script type="text/javascript" src="multicolor-4/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="multicolor-4/js/lightbox.min.js"></script>
    <script type="text/javascript" src="multicolor-4/js/wow.min.js"></script>
    <script type="text/javascript" src="multicolor-4/js/main.js"></script>   
</body>
</html>
