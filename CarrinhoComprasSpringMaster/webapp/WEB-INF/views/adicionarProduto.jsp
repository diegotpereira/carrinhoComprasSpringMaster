<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
  <div class="container">
     <div class="page-header">
        <h1>Novo Produto</h1>
        <p class="lead">Preencha as informações abaixo para adicionar um produto: </p>
     </div>
     
     <form:form action="${ pageContext.request.contextPath }/admin/produto/adicionarProduto" method="post" commandName="produto" enctype="multipart/form-data">
         <div class="form-group">
            <label for="nome">Nome </label>
            <form:errors path="produtoNome" cssStyle="color:#ff0000" />
            <form:input path="produtoNome" id="nome" class="form-control" />
         </div>
         
         <div class="form-group">
            <label for="categoria">Categoria</label>
            <label class="checkbox-inline"><form:radiobutton path="produtoCategoria" id="categoria" value="instrument" />Instrumento</label>
            <label class="checkbox-inline"><form:radiobutton path="produtoCategoria" id="categoria" value="registro"  />Registro</label>
            <label class="checkbox-inline"><form:radiobutton path="produtoCategoria" id="categoria" value="acessorio" />Acessório</label>
         </div>
         
         <div class="form-group">
            <label for="descricao">Descrição</label>
            <form:textarea path="produtoDescricao" id="descricao" class="form-control" />
         </div>
         
         <div class="form-group">
            <label for="preco">Preço</label>
            <form:errors path="produtoPreco" cssClass="color:#ff0000;" />
            <form:input path="produtoPreco" id="preco" class="form-control"/>
         </div>
         
         <div class="form-group">
            <label for="condicao">Condição</label>
            <label class="checkbox-inline"><form:radiobutton path="produtoCondicao" id="condicao" value="novo"/>Nome</label>
            <label class="checkbox-inline"><form:radiobutton path="produtoCondicao" id="condicao" value="usado"/>Usado</label>
         </div>
         
         <div class="form-group">
           <label for="status">Status </label>
           <label class="checkbox-inline"><form:radiobutton path="produtoStatus" id="status" value="active" />Ativo </label>
           <label class="checkbox-inline"><form:radiobutton path="produtoStatus" id="status" value="inativo" />Inativo</label>
         </div>
         
         <div class="form-group">
            <label for="unidadeEmEstoque">Unidade Em Estoque</label>
            <form:errors path="unidadeEmEstoque" cssStyle="color:#ff0000;" />
            <form:input path="unidadeEmEstoque" id="unidadeEmEstoque" class="form-control"/>
         </div>
         
         <div class="form-group">
            <label for="fabricante">Fabricante</label>
            <form:input path="produtoFabricante" id="fabricante" class="form-control"/>
         </div>
         
         <div class="form-group">
            <label class="control-label" for="produtoImagem">Upload Imagem</label>
            <form:input path="produtoImagem" id="produtoImagem" type="file" class="form:input-large"/>
         </div>
       <br/><br/>
       
       <input type="submit" value="submit" class="btn btn-default">
       <a href="<c:url value="/admin/produtoInventario" /> " class="btn btn-default">Cancelar</a>  
     </form:form>
  </div>
</div>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>