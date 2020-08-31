
package DataBaseAccess;

import java.sql.*;

public class AccesoProductos extends Conexion{
    private ResultSet result;
    
    Productos productos = new Productos();
    
    public AccesoProductos(){
        Connect();
    }
    
    public ResultSet Listado() throws Exception{
        try{
            getStatement();
            result = statement.executeQuery("SELECT * FROM hacking.productos;");
            return result;
        }catch (Exception e){
            System.err.println("SQL Exception " + e.getMessage());
            return null;
        }
    }
    
    public ResultSet BuscarCategoriaProducto(String categoria) throws Exception{
        try{
            getStatement();
            result = statement.executeQuery("SELECT * FROM hacking.productos WHERE categoria = '" + categoria + "';");
            return result;
        }catch(Exception e){
            System.out.println("SQL Exception " + e.getMessage());
            return null;
        }
    }
    
    public ResultSet BuscarNombreProducto(String nombre) throws Exception{
        try{
            getStatement();
            result = statement.executeQuery("SELECT * FROM hacking.productos WHERE nombre = '" + nombre + "';");
            return result;
        }catch(Exception e){
            System.out.println("SQL Exception " + e.getMessage());
            return null;
        }
    }
    
    public int InsertarProductos(String precio, String nombre, String tiempo) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("INSERT INTO hacking.productos(precio, nombre, tiempo) values ('" + productos.getPrecio() + "','" + productos.getNombre() + "','" + productos.getTiempo() + "');");
            return 1;
        }catch (Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
            return 0;
        }
    }
    
    
    public void ActualizarProductos(String precio, String nombre, String tiempo, String categoria, String descripcion) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("UPDATE hacking.productos set precio = '" + precio + "', tiempo = '" + tiempo + "', categoria = '" + categoria + "', descripcion = '" + descripcion +"' WHERE nombre = '" + nombre + "';");
        }catch (Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }
    
    public void ActualizarPrecioProducto(String precio, String nombre) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("UPDATE hacking.productos set precio = '" + precio + "' WHERE nombre = '" + nombre + "';");
        }catch(Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }
    
    public void ActualizarTiempoProducto(String tiempo, String nombre) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("UPDATE hacking.productos set tiempo = '" + tiempo + "' WHERE nombre = '" + nombre + "';");
        }catch(Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }
    
    public void ActualizarCategoriaProducto(String categoria, String nombre) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("UPDATE hacking.productos set categoria = '" + categoria + "' WHERE nombre = '" + nombre + "';");
        }catch(Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }
    
    public void ActualizarDescripcionProducto(String descripcion, String nombre) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("UPDATE hacking.productos set descripcion = '" + descripcion + "' WHERE nombre = '" + nombre + "';");
        }catch(Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }
    
    public void BorrarNombreProducto(String nombre) throws Exception{
        try{
            getStatement();
            statement.executeUpdate("DELETE FROM hacking.productos WHERE nombre = '" + nombre +"';");
        }catch(Exception ex){
            System.out.println("SQL Exception " + ex.getMessage());
        }
    }
    
    
    public void setIDProducto(Integer idProducto){
        throw new UnsupportedOperationException("No soportada todavia");
    }
    
    public void setPrecio(String precio){
        throw new UnsupportedOperationException("No soportada todavia");
    }
    
    public void setNombre(String nombre){
        throw new UnsupportedOperationException("No soportada todavia");
    }
    
    public void setTiempo(String tiempo){
        throw new UnsupportedOperationException("No soportada todavia");
    }
    
    public void setCategoria(String categoria){
        throw new UnsupportedOperationException("No soportada todavia");
    }
    
    public void setDescripcion(String descripcion){
        throw new UnsupportedOperationException("No soportada todavia");
    }

}
