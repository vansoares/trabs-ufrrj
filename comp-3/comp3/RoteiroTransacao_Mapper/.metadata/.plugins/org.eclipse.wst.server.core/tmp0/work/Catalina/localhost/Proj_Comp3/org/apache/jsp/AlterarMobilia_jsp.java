/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.38
 * Generated at: 2016-11-09 02:25:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.io.*;
import java.util.*;
import entidades.Comodo;
import servicelayer.mobilia.*;

public final class AlterarMobilia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1478472363000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("servicelayer.mobilia");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("entidades.Comodo");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t");
      out.write("\t<meta charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link href=\"bootstrap/bootstrap.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\t<link href=\"bootstrap/cosmo_booststrap.css\" rel=\"stylesheet\"/>\n");
      out.write("\t<link href=\"js/jquery-latest.min.js\" rel=\"stylesheet\"/>\n");
      out.write("\t<script src=\"//ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script> \n");
      out.write("    <script src='//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js'></script>\n");
      out.write("      \n");
      out.write("<title>Projeto _ Comp3</title>\n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-2\">\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("      </button>\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">PROJ_COMP3</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-2\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Comodo<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"CriarComodo\">Criar</a></li>\n");
      out.write("            <li><a href=\"ListarComodo\">Listar</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Mobília<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"CriarMobilia\">Criar</a></li>\n");
      out.write("            <li><a href=\"ListarMobilia\">Listar</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Contrato<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"CriarContrato\">Novo Contrato</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\t\t<li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Ambiente<span class=\"caret\"></span></a>\n");
      out.write("          <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("            <li><a href=\"CriarAmbiente\">Novo Ambiente</a></li>\n");
      out.write("            <li><a href=\"ListarAmbiente\">Listar</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("\t\t\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\">qlq coisa</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<script type='text/javascript'>\n");
      out.write("\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$('#deleteBtn').click(function(){\n");
      out.write("\t\t\t\t\t $('input[name=\"method\"]').val(\"delete\");\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$('#saveBtn').click(function(){\n");
      out.write("\t\t\t\t $('input[name=\"method\"]').val(\"save\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t});\n");
      out.write("\t\t\n");
      out.write("\t\tfunction getComodo(){\n");
      out.write("\t\t\tvar comodos = [];\n");
      out.write("\t\t    $('input[name=\"comodos\"]:checked').each(function(i){\n");
      out.write("\t\t    \tcomodos[i] = $(this).val();\n");
      out.write("\t\t      console.log(this.value);\n");
      out.write("\t\t    });\n");
      out.write("\t\t    $('input[name=\"idComodos\"]').val(comodos);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <div class=\"col-lg-3 col-lg-offset-4\" >\n");
      out.write("\t<h3><center><font face=\"Calibri\" color=\"gray\">Edição:Mobilia</font> </center></h3>\n");
      out.write("\t\t\n");
      out.write("\t\t<form method=\"post\" action=\"AlterarMobilia\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  ");

			 	out.println("<input class='form-control' name='desc' id='desc' value='"+request.getParameter("desc") +"'");
			  	out.println(" style='margin-bottom:3%;' placeholder='descricão' type='text'>");
			  	out.println("<input class='form-control' name='custo' id='custo' min='0.01' value='"+request.getParameter("custo") +"'");
			  	out.println(" style='margin-bottom:3%;' placeholder='custo' type='number' step=0.01 >");
			  	out.println("<input class='form-control' name='tempoEntrega' min='1' id='tempoEntrega' value='"+request.getParameter("tempo") +"'");
			  	out.println(" style='margin-bottom:3%;' placeholder='tempo de entrega' type='number'>");
			  	out.println("<input class='form-control' name='idHidden' id='idHidden' type='hidden' value=");
			  	out.println("'" + request.getParameter("id") + "'>");
			  
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"col-lg-15 col-lg-offset-1\">\n");
      out.write("\t\t\t <h4>Escolha os cômodos: </h4>\n");
      out.write("\t        ");
  
			List <Comodo> l = (List)request.getAttribute("comodos");
				for(Comodo u: l){  
					out.println("<div class='checkbox'><label>"
								+"<input class='checkbox' name='comodos' id='"+ u.getId()
								+ "' type='checkbox' style='margin-bottom:3%;' value =" +u.getId() +">"
								+ u.getDescricao()+"</label></div>");
			}
			    out.println("</table></p>");
			
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<input type='hidden' name='idComodos' id='idComodos'/>\n");
      out.write("\t\t\t<div class=\"col-lg-15 col-lg-offset-1\">\n");
      out.write("\t\t\t  \t<input type='hidden' value='' name='method' id='method'>\n");
      out.write("\t\t\t\t<button type=\"reset\" onclick=\"history.back();\" class=\"btn btn-default\">Cancelar</button>\n");
      out.write("\t\t        <button type=\"submit\" class=\"btn btn-primary\" id='deleteBtn'>Excluir</button>\n");
      out.write("\t\t        <button type=\"submit\" class=\"btn btn-success\" id='saveBtn' onclick=\"getComodo()\">Salvar</button>\n");
      out.write("\t\t      \n");
      out.write("\t\t        \n");
      out.write("\t        </div>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("</center>\t\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
