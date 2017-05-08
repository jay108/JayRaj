/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jay;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.lang.AbstractMethodError.*;
import javafx.animation.*;
/**
 *
 * @author jay
 */
public class JayDemo extends HttpServlet 
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try
            {   
             out.println("<h1>Welcome</h1>");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String str=request.getParameter("un");
            String pwd=request.getParameter("pw");
            Connection con=DriverManager.getConnection("jdbc:oracle:oci8:@localhost:1521:jay", "jay", "jay10895");
            Statement s=con.createStatement();
            ResultSet rs=s.executeQuery("select * from student_it where name=un");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            out.println("<title>Servlet JayDemo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table>");
            int i=0;
            while(rs.next())
            {
                out.println("<h1>Hello Bhai Gand Fat gai...</h1>");
                out.println("<tr>");
                out.println("<td>" + rs.getString(i) + "</td>");
                out.println("</tr>");
                i++;
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
            }
            catch(Exception e)
            {
                System.out.print("error accure");
            }
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
