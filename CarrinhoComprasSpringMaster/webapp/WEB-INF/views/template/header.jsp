
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="descricao" content="">
<meta name="autor" content="">
<title>Minha Loja de Musica</title>

<!-- Angular.js -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

<!-- JQuery -->
<script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

<!-- Bootstrap e CSS -->
<link href="<c:url  value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

<!-- MaCarouselin CSS -->
<link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">

<!-- Main CSS -->
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

<link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
</head>
<body>
<!------------------------------------------------------NAVBAR ---------------------------- -->

<div class="navbar-wrapper">
   <div class="container">
      <nav class="navbar navbar-inverse navbar-static-top">
         <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                   <span class="sr-only">Alternar de navegação</span>
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                   <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Minha loja de Musica</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
               <ul class="nav navbar-nav">
                 <li><a href="<c:url value="/" />">Home</a></li>
                 <li><a href="<c:url value="/produto/produtoLista/todos" />">Produtos</a></li>
                 <li><a href="<c:url value="/sobre" />">Sobre</a></li>
               </ul>
               <ul class="nav navbar-nav pull-right">
                 <c:if test="">
                   <li><a>Bem Vindo: </a></li>
                   <li><a href="">Logout</a></li>
                   
                   <c:if test="">
                      <li><a href="">Admin</a></li>
                   </c:if>
                   
                   <c:if test="">
                      <li><a href="">Carrinho</a></li>
                   </c:if>
                   
                   <c:if test="">
                     <li><a href="">Admin</a></li>
                   </c:if>
                 </c:if>
                 <c:if test="">
                     <li><a href="">Login</a></li>
                     <li><a href="">Registrar</a></li>
                 </c:if>
               </ul>
            </div>
         </div>
      </nav>
   </div>
</div>