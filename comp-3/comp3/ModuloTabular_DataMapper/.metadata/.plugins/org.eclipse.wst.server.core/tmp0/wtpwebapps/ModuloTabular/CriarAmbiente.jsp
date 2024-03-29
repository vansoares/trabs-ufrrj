<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@include file="header.jsp" %>

</head>
<%@ page import = "servicelayer.ambiente.*" %>
<%@ page import = "servicelayer.mobilia.*" %>
<%@ page import = "servicelayer.contrato.*" %>
<%@ page import = "entidades.*" %>
<%@ page import = "dao.*" %>
<%@ page import = "tm.*" %>
<%@ page import = "java.util.*" %>

<script type="text/javascript">
$(document).ready(function() {
    $('input[name="mobilias"]:checked').each(function(i){
      console.log(this.value);
    });
});

function habilita(id){
    $("input[id=qtd_"+id+"]").prop("disabled", false);
}

function isValidForm(){
	var mobilias = [];
	var qtds = [];
	if($('input[name="mobilias"]:checked').length > 0){
		$('input[name="mobilias"]:checked').each(function(i){
			mobilias[i] = $(this).val();
			qtds[i] = $("input[id=qtd_"+ mobilias[i] +"]").val();
		});
		$('input[name="idMobilias"]').val(mobilias);
		$('input[name="qtdsHidden"]').val(qtds);
		return true;
	}else{
		alert("Nenhuma mobília foi selecionada!");
		return false;
	}
}
</script>

<body>
 <div class="col-lg-3 col-lg-offset-4" >
	<h3><center><font face="Calibri" color="gray">Novo ambiente</font> </center></h3>

	<form method="post" action="CriarAmbiente" id="create_form" onsubmit="return isValidForm()">			<div class="form-group">
			  <input class="form-control" name="paredes" id="paredes" min="1" type="number" style='margin-bottom:3%;' placeholder="Número de paredes" required>
			  <input class="form-control" name="portas" id="portas" min="1" type="number" placeholder="Número de portas" style='margin-bottom:3%;' required>
			  <input class="form-control" name="metragem" id="metragem" min="0.1" type="number" placeholder="Metragem (m²)" style='margin-bottom:3%;' required>
			  </div>

		<p align='center' bottom="middle"><table border='2px' class="table table-hover col-lg-3" style="margin-left:3%;">
		<thead>
				<tr class='success'>
					<th>Mobílias disponiveis por cômodo</th>
					<th>Custo (R$)</th>
					<th>Tempo de entrega (semanas)</th>
					<th>Quantidade</th>
				</tr>
		</thead>
		<tbody>
			<form method="post" action="CrCriarAmbiente" id='list_form'>
        <%
        List<Comodo> l = (List<Comodo>)request.getAttribute("comodos");
		 HashSet<String> hash = new HashSet<>();
		 CriarContrato_SL sl = new CriarContrato_SL();
        for (Comodo c: l) {
             for(Mobilia u: Mobilia_TM.ListarMobiliaComodo(c.getId())){ 
           	  if(!(hash.contains(u.getId()))){
           		 hash.add(u.getId());
           		 if(!(hash.contains(c.getId()))){
               		 hash.add(c.getId());
                     out.println("<tr class='info'><td><label>"+c.getDescricao() + "</label></td><td></td><td></td><td></td></tr>");
           		 }
                   out.println("<tr>");
	                out.println("<td><div class='checkbox'><label>"
	                      +"<input class='checkbox' name='mobilias' id='"+ u.getId()
	                      + "' type='checkbox' style='margin-bottom:3%;' value =" +u.getId()
	                      + " onclick='javascript: habilita("+ u.getId() +")';>"
	                      + u.getDescricao()+"</label></div></td>");
	                out.println("<td><a value='"+u.getId() +"'>" + u.getCusto() +"</a></td>");
	                out.println("<td><a value='"+u.getId() +"'>" + u.getTempoEntrega() +"</a></td>");
	                out.println("<td><input type=number id=qtd_"+u.getId() +" value=0 style='width:90%;' min='1' disabled/></td>");
             		}
             }
         }
          out.println("</table></p>");
          out.println("<input type='hidden' name='mobiliaHidden' id='mobiliaHidden' value = '"+ request.getAttribute("mobilia")+"'/>");
        %>
			<input type='hidden' name='idMobilias' id='idMobilias'/>
			<input type='hidden' name='qtdsHidden' id='qtdsHidden'/>

		</tbody>
		<div class="col-lg-10 col-lg-offset-2">
			<button type="reset" class="btn btn-default">Cancel</button>
		    <button type="submit" class="btn btn-success" >Submit</button>
		</div>
	</form>
</div>
</center>
</body>
</html>
