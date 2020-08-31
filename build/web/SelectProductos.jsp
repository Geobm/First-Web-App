<%-- 
    Document   : SelectProductos
    Created on : 8/10/2017, 09:15:55 AM
    Author     : JG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de productos</title>
        <link rel="stylesheet" type="text/css" href="css_Registro.css"/>
    </head>
    <body>
        <center><h1>Búsqueda de Productos</h1></center>
    
        <center><p>Llene uno de los campos conforme al cual quiera hacer la consulta, o 
               no llene ninguno para mostrar todos los registros.</p></center>
        
    <center>
        
        <form action="ServletSelectProductos" method="post">
    
    
    <table>
        <tr><td style="border-style: none; border-top-style: dotted; border-bottom-style: dotted;"><b>ID</b></td><td style="border-style: none;"><input type="number" name="idProductos"></td></tr>
        <tr><td style="border-style: none; border-bottom-style: dotted;"><b>Precio</b></td><td style="border-style: none;"><input type="text" name="precio"></td></tr>
        <tr><td style="border-style: none; border-bottom-style: dotted;"><b>Artículo</b></td><td style="border-style: none;"><input type="text" name="nombre"></td></tr>
        <tr><td style="border-style: none; border-bottom-style: dotted;"><b>Tiempo de preparación (minutos)</b></td><td style="border-style: none;"><input type="text" name="tiempo"></td></tr>
        <tr><td style="border-style: none; border-bottom-style: dotted;"><b>Categoria</b></td><td style="border-style: none;"><input type="text" name="categoria"></td></tr>
        <tr><td style="border-style: none; border-bottom-style: dotted;"><b>Descripción</b></td><td style="border-style: none;"><input type="text" name="descripcion"></td></tr>
    </table>
    
            <center>
                <input type="submit" name="Buscar" value="Consultar" class="botones">
                <center><h3><a href="FCFM.html">Volver a mi perfil</a></h3></center>
            </center>
            
            
        </form>
        
    </center>
        
    </body>
</html>
