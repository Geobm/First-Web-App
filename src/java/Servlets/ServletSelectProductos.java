/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import DataBaseAccess.AccesoProductos;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
@WebServlet(name = "ServletSelectProductos", urlPatterns = {"/ServletSelectProductos"})
public class ServletSelectProductos extends HttpServlet {

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
            
            //ResultSet result;
            //AccesoProductos accesoProductos = new AccesoProductos();
            
            //String precio, nombre, tiempo, categoria, descripcion;
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Listado de Productos</title>"); 
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center><h1>Listado de productos</h1></center>");
            /*
            out.println("<table align=center>");
            out.println("<tr><td style=\"border-style: none; border-bottom-style: dotted;\"><b>Precio</b></td>"
                    + "<td style=\"border-style: none; border-bottom-style: dotted;\"><b>Articulo</b></td>"
                    + "<td style=\"border-style: none; border-bottom-style: dotted;\"><b>Tiempo de preparación (minutos)</b></td>"
                    + "<td style=\"border-style: none; border-bottom-style: dotted;\"><b>Categoria</b></td>"
                    + "<td style=\"border-style: none; border-bottom-style: dotted;\"><b>Descripcion</b></td></tr>");
                  
            result = null;
            
            if(("".equals(request.getParameter("precio"))) && ("".equals(request.getParameter("nombre"))) && ("".equals(request.getParameter("tiempo"))) && (!"".equals(request.getParameter("categoria"))) && ("".equals(request.getParameter("descripcion")))){
                result = accesoProductos.BuscarNombreProducto(request.getParameter("nombre"));
            }
            
            if(("".equals(request.getParameter("precio"))) && (!"".equals(request.getParameter("nombre"))) && ("".equals(request.getParameter("tiempo"))) && ("".equals(request.getParameter("categoria"))) && ("".equals(request.getParameter("descripcion")))){
                result = accesoProductos.BuscarNombreProducto(request.getParameter("nombre"));
            }
            
            if(("".equals(request.getParameter("precio"))) && ("".equals(request.getParameter("nombre"))) && ("".equals(request.getParameter("tiempo"))) && ("".equals(request.getParameter("categoria"))) && ("".equals(request.getParameter("descripcion")))){
                result = accesoProductos.Listado();
            }
            
           /*
            while(result.next()){
                precio = result.getString("precio");
                nombre = result.getString("nombre");
                tiempo = result.getString("tiempo");
                categoria = result.getString("categoria");
                descripcion = result.getString("descripcion");
                
                
                out.println("<tr><td>" + precio + "</td><td>" + nombre + "</td><td>" + tiempo + "</td><td>" + categoria + "</td><td>" + descripcion + "</td></tr>");
            }
            */
            
            //out.println("</table>");
           
            
            out.println("<br/><center><img src=\"Images/pruebas.png\" alt=\"Productos\"></center>");
            
            
            out.println("<br/><center><h3><a href = \"SelectProductos.jsp\">Buscar otro producto</a></h3></center>");
            out.println("<br/><center><h3><a href = \"FCFM.html\">Volver a mi perfil</a></h3></center>");
            
            out.println("</body>");
            out.println("</html>");
            out.close();
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
