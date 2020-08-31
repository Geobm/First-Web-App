/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DataBaseAccess.Productos;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JG
 */
@WebServlet(name = "ServletInsertProductos", urlPatterns = {"/ServletInsertProductos"})
public class ServletInsertProductos extends HttpServlet {

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
            
            Productos productos = new Productos();

            productos.setNombre(request.getParameter("nombre"));
            productos.setPrecio(request.getParameter("precio"));
            productos.setTiempo(request.getParameter("tiempo"));
            productos.setCategoria(request.getParameter("categoria"));
            productos.setDescripcion(request.getParameter("descripcion"));

            
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insertar Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            */
            out.println("<br/><center><h1>Datos agregados correctamente</h1></center>");
            out.println("<br/><center><h3><a href = \"InsertProductos.jsp\">Agregar otro producto</a></h3></center>");
            out.println("<br/><center><h3><a href = \"FCFM.html\">Volver a mi perfil</a></h3></center>");
            /*
            out.println("</body>");
            out.println("</html>");
            */
        }catch(Exception e){
            Logger.getLogger(ServletProductos.class.getName()).log(Level.SEVERE, null, e); 
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
