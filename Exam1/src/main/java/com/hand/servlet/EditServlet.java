package com.hand.servlet;

import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import freemarker.template.*;


public class EditServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3655928023683160865L;
	private Configuration cfg; 
    
    public void init() {

        cfg = new Configuration();
        
        cfg.setServletContextForTemplateLoading(
                getServletContext(), "WEB-INF/templates");

    }
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html; charset=UTF-8");
    	
    	int film_id = Integer.parseInt(req.getParameter("film_id"));
        String title = req.getParameter("title");
        String description = req.getParameter("description");

        Map root = new HashMap();
        root.put("film_id", film_id);
        root.put("title", title);
        root.put("description", description);
        

        Template t = cfg.getTemplate("test.ftl");
        

        //resp.setContentType("text/html; charset=" + t.getEncoding());
        //Writer out = new OutputStreamWriter(new FileOutputStream("src/main/webapp/WEB-INF/test.html"));
        Writer out = resp.getWriter();

        try {
            t.process(root, out);
        } catch (TemplateException e) {
            throw new ServletException(
                    "Error while processing FreeMarker template", e);
        }
    }
}