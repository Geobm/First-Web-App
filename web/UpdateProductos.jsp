<%-- 
    Document   : UpdateProductos
    Created on : 8/10/2017, 09:25:35 AM
    Author     : JG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width"> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar Productos</title>
        <link rel="stylesheet" type="text/css" href="css_Registro.css"/>
    </head>
    <body>
        <h1>Actualizar Producto</h1>
        
        
        <form action="ServletUpdateProductos" method="post">
        
            <label>Precio: </label>
            <input class="datos" type="text" name="precio" placeholder="43.25"/><br /><br />
            <label>Artículo: </label>
            <input class="datos" type="text" name="nombre" placeholder="Tacos de Trompo" required/><br /><br />
            <label>Tiempo de preparación (minutos): </label>
            <input class="datos" type="text" name="tiempo" placeholder="20"/>
            <label>Categoría: </label>
            <input class="datos" type="text" name="categoria" placeholder="Plato fuerte"/><br /><br />
            <label>Descripción: </label>
            <input class="datos" type="text" name="descripcion" placeholder="Orden de 6 tacos"/><br /><br />
             
            <input type="submit" name="Boton" value="Agregar" class="botones">
            <input type="reset" name="Boton" value="Reset" class="botones">
            
            <h3><a href="FCFM.html">Volver a mi perfil</a></h3>

            
        </form>
        
    </body>
</html>
