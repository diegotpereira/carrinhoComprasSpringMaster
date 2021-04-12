<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
           <h1>Alterar Produto</h1><p class="lead">Por favor altere a informação do produto aqui</p>
        </div>
        
        <form:form action="${ pageContext.request.contextPath }/admin/produto/editarProduto" method="post" commandName="produto" enctype="multipart/form-data">
        <form:hidden path="produtoId" value="${ produto.produtoId }" />
            <div class="form-group">
               <label for="nome">Nome</label>
               <form:errors path="produtoNome" cssStyle="color:#ff0000;" />
               <form:input path="produtoNome" id="nome" class="form-Control" value="${ produto.produtoNome }" />
            </div>
            
            <div class="form-group">
               <label for="categoria">Categoria</label>
               <label class="checkbox-inline"><form:radiobutton path="produtoCategoria" id="categoria" value="instrumento" />Instrumento</label>
               <label class="checkbox-inline"><form:radiobutton path="produtoCategoria" id="categoria" value="record" />Record</label>
               <label class="checkbox-inline"><form:radiobutton path="produtoCategoria" id="categoria" value="acessorio" />Acessório</label>
            </div>
            
            <div class="form-group">
               <label for="descricao">Descrição</label>
               <form:textarea path="produtoDescricao" id="descricao" class="form-Control" value="${ produto.produtoDescricap }" />
            </div>
            
            <div class="form-group">
                <label for="preco">Preço</label>
                <form:errors path="produtoPreco" cssStyle="color:#ff0000;" />
                <form:input path="produtoPreco" id="preco" class="form-Control" value="${ produtoPreco }" />
            </div>
            
           <div class="form-group">
              <label for="condicao">Condição</label>
              <label class="checkbox-inline"><form:radiobutton path="produtoCondicao" id="condicao" value="novo" />Novo</label>
              <label class="checkbox-inline"><form:radiobutton path="produtoCondicao" id="condicao" value="usado" />Usado</label>
           </div>
           
           <div class="form-group">
              <label for="status">Status</label>
              <label class="checkbox-inline"><form:radiobutton path="produtoStatus" id="status" value="ativo" />Ativo</label>
              <label class="checkbox-inline"><form:radiobutton path="produtoStatus" id="status" value="inativo" />Inativo</label>
           </div>
           
           <div class="form-group">
             <label for="unidadeEmEstoque">Unidade em Estoque</label>
             <form:errors path="unidadeEmEstoque" cssStyle="#ff0000;" />
             <form:input path="unidadeEmEstoque" id="unidadeEmEsqtoque" class="form-Control" value="${ produto.unidadeEmEstoque }" />
           </div>
           
           <div class="form-group">
             <label for="fabricante">Fabricante</label>
             <form:input path="fabricante" id="fabricante" class="form-Control" value="${ produto.fabricante }" />
           </div>
           
           <div class="form-group">
              <label class="control-label" for="produtoImagem">Upload de Imagem</label>
              <form:input path="produtoImagem" path="produtoImagem" type="file" class="form:input-large" /> 
           </div>
           
           <br/><br/>
           
           <input type="submit" value="submit" class="btn btn-default">
           <a href="<:url value="/admin/produtoInventario" />" class="btn btn-default">Cancelar</a>
        </form:form>
<%@ include file="/WEB-INF/views/template/footer.jsp" %>