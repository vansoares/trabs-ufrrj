<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@include file="header.jsp" %>
	
</head>
<body>
 <div class="col-lg-3 col-lg-offset-4" >
	<h3><center><font face="Calibri" color="gray">Criação de Ambientes </font> </center></h3>
	<h5><center><font face="Calibri" color="gray">Preencha com as informações sobre o ambiente a ser criado. </font> </center></h5><br>
		
	<div class="form-group">
	  <label class="control-label" for="focusedInput">Número de paredes: </label>
	  <input class="form-control" id="numParedes" type="number">
	</div>
	
	<div class="form-group">
	  <label class="control-label" for="focusedInput">Número de Portas: </label>
	  <input class="form-control" id="numPortas" type="number">
	</div>
	
	<div class="form-group">
	  <label class="control-label" for="focusedInput">Metragem do ambiente (m²): </label>
	  <input class="form-control" id="metragem" type="number">
	</div>
	
	
	<a href="escolhaAmbiente.jsp" class="btn btn-default">Continuar >></a>
</div>
</center>	
</body>
</html>