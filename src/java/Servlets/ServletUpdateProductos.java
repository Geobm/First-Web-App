/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DataBaseAccess.AccesoProductos;
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
@WebServlet(name = "ServletUpdateProductos", urlPatterns = {"/ServletUpdateProductos"})
public class ServletUpdateProductos extends HttpServlet {

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
            
            AccesoProductos accesoProductos = new AccesoProductos();
            
            if((!"".equals(request.getParameter("precio"))) && (!"".equals(request.getParameter("nombre"))) && (!"".equals(request.getParameter("tiempo"))) && (!"".equals(request.getParameter("categoria"))) && (!"".equals(request.getParameter("descripcion")))){
                String precio = request.getParameter("precio");
                String nombre = request.getParameter("nombre");
                String tiempo = request.getParameter("tiempo");
                String categoria = request.getParameter("categoria");
                String descripcion = request.getParameter("descripcion");
                
                accesoProductos.ActualizarProductos(precio, nombre, tiempo, categoria, descripcion);
            }
            
            if((!"".equals(request.getParameter("precio"))) && (!"".equals(request.getParameter("nombre"))) && ("".equals(request.getParameter("tiempo"))) && ("".equals(request.getParameter("categoria"))) && ("".equals(request.getParameter("descripcion")))){
                String precio = request.getParameter("precio");
                String nombre = request.getParameter("nombre");

                accesoProductos.ActualizarPrecioProducto(precio, nombre);
            }
            
            if(("".equals(request.getParameter("precio"))) && (!"".equals(request.getParameter("nombre"))) && (!"".equals(request.getParameter("tiempo"))) && ("".equals(request.getParameter("categoria"))) && ("".equals(request.getParameter("descripcion")))){
                String tiempo = request.getParameter("tiempo");
                String nombre = request.getParameter("nombre");

                accesoProductos.ActualizarTiempoProducto(tiempo, nombre);
            }
            
            out.println("<center><h1>Datos actualizados correctamente</h1></center>");
            
            out.println("<center><h3><a href=\"UpdateProductos.jsp\">Actualizar otro producto</a></h3></center>");
            out.println("<center><h3><a href=\"FCFM.html\">Volver a mi perfil</a></h3></center>");
            
            
            /*
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Actualizar Productos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUpdateProductos at " + request.getContextPath() + "</h1>");
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
