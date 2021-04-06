<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

           <!-- Carousel -->
           
           <div id="myCarousel" class="carousel slide" data-ride="carousel">
               <!-- Indicadores-->
               <ol class="carousel-indicators"> 
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarrosel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
               </ol>
               <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img class="first-slide home-image" src="<c:url value="/resources/imagens/back1.jpg" />" alt="First slide">
                        <div class="container">
                            <div class="carousel=caption">
                                <h1>Bem Vindo, My Music Store</h1>
                                <p>Aqui voc� pode navegar e comprar instrumentos. Discos e acess�rios relacionados � m�sica. Fa�a o pedido do seu novo kit incr�vel.</p>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img class="second-slide home-image" src="<c:url value="/resources/imagens/back2.jpg" />" alt="Second slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h1>Fatos que voc� deve saber sobre m�sica</h1>
                                <p>A m�sica traz jey, para todos os nossos cora��es. ɉ uma daquelas artes emocionais</p>
                            </div>
                        </div>
                    </div>
                    <div class="item">
                        <img class="third-slide home-image" src="<c:url value="/resources/imagens/back3.jpg" />" alt="Third slide">
                        <div class="container">
                            <div class="carousel-caption">
                                <h1>� o caso do jazz</h1>
                                <p>Atrav�s de tons altos e baixos, de alguma forma consigo sobreviver na vida</p>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-left" aria-hidden="true"></span>
                    <span class="sr-only">Anterior</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right     aria-hiddentrue"></span>
                </a>
            </div>
            <div class="container marketing">
                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/produto/produtoLista?searchCondition=Instrument" />" role="button">
                        <img class="img-circle" src="<c:url value="resources/imagens/instrument.jpg"/>"alt="Instrument Image" width="140" height="140">
                    </a>  
                    
                    <h2>instrumento</h2>
                    <p>Instrumentos delicados e bem elaborados</p>

                    <div class="col-lg-4">
                        <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Instrument" />" role="button">
                           <img class="img-circle" src="<c:url value="/resources/imagens/record.gif"/>" alt="Instrument Image" width="140" height="140">
                        </a>   

                        <h2>Discografia: </h2>
                        <p>Uma cole��o excepcional de discos musicais em favor do g�nero jazz tradicional e moderno</p>
                    </div>

                    <div class="col-lg-4">
                        <a class="btn btn-default" href="<c:url value="/produto/produtoLista?searchCondition=Accessory" />" role="button">
                        
                           <img class="img-circle" src="<c:url value="/resources/imagens/accessory.jpg"/>" alt="Instrument image" width="140" height="140">
                        </a>
                    </div>

                    <h2>Acess�rios</h2>
                    <p>Todos os produtos musicais e geeks relacionados</p>
                </div>
            </div>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>