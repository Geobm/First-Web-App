<%-- 
    Document   : DeleteProductos
    Created on : 8/10/2017, 09:06:43 AM
    Author     : JG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar registros</title>
        <link rel="stylesheet" type="text/css" href="css_Registro.css"/>
    </head>
    <body>
        <center><h1>Eliminar Producto</h1></center>
        
    <center>
        
        <form action="ServletDeleteProductos" method="post">
            
          
            <table>
                <thead>
                    <tr>
                        <th>Nombre del articulo</th>
                    </tr>
                </thead>
                
                <tbody>
                    <tr>
                        <td style="border-style: none;"><input type="text" name="nombre" required></td>
                    </tr>
                </tbody>
            </table>
          
            
            <br/>
            
            <input type="submit" name="BotonEliminar" value="Eliminar" class="botones">
            
            <center><h3><a href="FCFM.html">Volver a mi perfil</a></h3></center>
            
           
                  
        </form>
    </center>
    </body>
</html>
