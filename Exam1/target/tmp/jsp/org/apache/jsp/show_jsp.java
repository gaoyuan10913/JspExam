/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-08-07 15:07:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.hand.entity.Film;
import java.util.ArrayList;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>电影信息</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h1>电影列表</h1>\r\n");
      out.write("\t\t<a href=\"index.jsp\">返回</a>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t\r\n");
      out.write("\t<table align=\"center\" width=\"666\" border=\"1\" height=\"180\"\r\n");
      out.write("\t\tbordercolor=\"white\" bgcolor=\"black\" cellpadding=\"1\" cellspacing=\"1\">\r\n");
      out.write("\t\t<tr align=\"center\" bgcolor=\"#e1ffc1\">\r\n");
      out.write("\t\t\t<td><b>ID</b></td>\r\n");
      out.write("\t\t\t<td><b>标题</b></td>\r\n");
      out.write("\t\t\t<td><b>描述</b></td>\r\n");
      out.write("\t\t\t<td><b>语言</b></td>\r\n");
      out.write("\t\t\t<td width=\"50\"><b>操作</b></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
 
			// 获取电影信息集合 
			ArrayList<Film> list = (ArrayList<Film>) request.getAttribute("list");
			// 判断集合是否有效  
			if (list == null || list.size() < 1) {
				out.print("没有数据！");
			} else {
				for (Film film : list) {
		
      out.write("\r\n");
      out.write("\t\t<tr align=\"center\" bgcolor=\"white\">\r\n");
      out.write("\t\t\t<td>");
      out.print(film.getFilm_id());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(film.getTitle());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(film.getDescription());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(film.getLanguage_name());
      out.write("</td>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=\"#\">删除&nbsp;</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\">编辑&nbsp;</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
			}
		
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("</body>\r\n");
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