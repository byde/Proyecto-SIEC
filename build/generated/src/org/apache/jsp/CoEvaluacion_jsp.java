package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CoEvaluacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <HEAD>\n");
      out.write("        <SCRIPT type= \"text/JavaScript\" src= \"Scripts/jquery.js\"> </SCRIPT>\n");
      out.write("\t<SCRIPT type= \"text/JavaScript\" src= \"Scripts/acciones.js\"> </SCRIPT>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/default.css\" type=\"text/css\" />\n");
      out.write("    </HEAD>\n");
      out.write("\n");
      out.write("    <BODY>\n");
      out.write("\t<H1> CO-EVALUACION </H1>\n");
      out.write("\t<TABLE border=0 width=1100>\n");
      out.write("            <TR><TD> EVALUADOR: </TD> <TD> <B>GIANNINA WENDOLYNE CAJERO RODRIGUEZ</B> </TD> <TD> EVALUADO: </TD> <TD> <B>KARLA GALVEZ FLORES</B> </TD> </TR>\n");
      out.write("            <TR><TD> MATERIA: </TD> <TD> <B>PROGRAMACION VI</B> </TD> <TD> PROFESOR </TD> <TD> <B>ROCÍO TERAN</B> </TD> </TR>\n");
      out.write("\t</TABLE>\n");
      out.write("            <CENTER>\n");
      out.write("            <BR>\n");
      out.write("                <TABLE \tborder=0 width=1100>\n");
      out.write("                    <TR> <TD colspan=3>\n");
      out.write("                            <DIV>\n");
      out.write("                                <TABLE width=1100 id= \"Tabla_Contenido\">\n");
      out.write("                                    <tr> <td align=\"center\" colspan=\"3\"> <input type=\"button\" value=\"Competencia #1\" id=\"Comp_1_Boton\"/>\n");
      out.write("                                            <label id=\"Status_1\" class=\"incomplete\"> Evaluacion Incompleta </label> </td></tr>\n");
      out.write("                                    <table width=\"1000\" id=\"Comp_1_Area\" class=\"competencia\">\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right> IDENTIFICAR LAS CLASES\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\" rowspan=3> <textarea name=\"comentario\" rows=\"10\" cols=\"40\"></textarea>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right> ESTABLECER LAS REGLAS DE NEGOCIOS\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right valign= \"top\"> DEPURAR EL PROGRAMA\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\" valign= \"top\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\" align=\"right\"><input type=\"button\" value=\"Guardar Evaluacion\" id=\"Guardar_1\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                 </table>\n");
      out.write("                                     <tr> <td align=\"center\" colspan=\"3\"> <input type=\"button\" value=\"Competencia #2\" id=\"Comp_2_Boton\"/>\n");
      out.write("                                         <label id=\"Status_2\" class=\"incomplete\"> Evaluacion Incompleta </label></td></tr>\n");
      out.write("                                    <table width=\"1000\" id=\"Comp_2_Area\" class=\"competencia\">\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right> IDENTIFICAR LAS CLASES\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\" rowspan=3> <textarea name=\"comentario\" rows=\"10\" cols=\"40\"></textarea>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right> ESTABLECER LAS REGLAS DE NEGOCIOS\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right valign= \"top\"> DEPURAR EL PROGRAMA\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\" valign= \"top\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\" align=\"right\"><input type=\"button\" value=\"Guardar Evaluacion\" id=\"Guardar_2\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                 </table>\n");
      out.write("                                      <tr> <td align=\"center\" colspan=\"3\"> <input type=\"button\" value=\"Competencia #3\" id=\"Comp_3_Boton\"/>\n");
      out.write("                                          <label id=\"Status_3\" class=\"incomplete\"> Evaluacion Incompleta </label></td></tr>\n");
      out.write("                                    <table width=\"1000\" id=\"Comp_3_Area\" class=\"competencia\">\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right> IDENTIFICAR LAS CLASES\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\" rowspan=3> <textarea name=\"comentario\" rows=\"10\" cols=\"40\"></textarea>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right> ESTABLECER LAS REGLAS DE NEGOCIOS\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("\t\t\t\t<TR>\n");
      out.write("                                    <TD align=right valign= \"top\"> DEPURAR EL PROGRAMA\n");
      out.write("                                    </TD>\n");
      out.write("                                    <TD align= \"right\" valign= \"top\">\n");
      out.write("                                        <SELECT>\n");
      out.write("                                            <OPTION> COMPETENTE </OPTION>\n");
      out.write("                                            <OPTION> INDEPENDIENTE </OPTION>\n");
      out.write("                                            <OPTION> NO SE </OPTION>\n");
      out.write("                                            <OPTION> BASICO </OPTION>\n");
      out.write("                                            <OPTION> INCOMPETENTE </OPTION>\n");
      out.write("\t\t\t\t\t</SELECT>\n");
      out.write("                                    </TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td colspan=\"3\" align=\"right\"><input type=\"button\" value=\"Guardar Evaluacion\" id=\"Guardar_3\"/></td>\n");
      out.write("                                </tr>\n");
      out.write("                                 </table>\n");
      out.write("\t\t\t\t</TABLE>\n");
      out.write("\t\t\t\t</DIV>\n");
      out.write("\t\t\t\t</TD>\n");
      out.write("\t\t\t\t</TR>\n");
      out.write("<!-- AQUI TERMINA LA MATERIA DE PROGRA -->\n");
      out.write("\t\t\t</TABLE>\n");
      out.write("\t\t</CENTER>\n");
      out.write("\t</BODY>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
