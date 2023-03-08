package etu1876.framework.servlet;
import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import utilitaire.*;



public class FrontServlet extends HttpServlet {
   public void processRequest(HttpServletRequest request,HttpServletResponse res)
         throws ServletException, IOException {
            res.setContentType("text/html;charset=UTF-8");
            try(PrintWriter out= res.getWriter()){
                  Utilitaire utilitaire=new Utilitaire();
                  String url=request.getRequestURI();
                  String demande=utilitaire.getMethode(url);
                  out.println("url:"+ demande);
            }

         }
public void doGet(HttpServletRequest request , HttpServletResponse res)
   throws ServletException,IOException {
      processRequest(request, res);
   }

public void doPost(HttpServletRequest request , HttpServletResponse res)
   throws ServletException,IOException {
      processRequest(request, res);
   }
}
