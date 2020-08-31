
package DataBaseAccess;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "Productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT e FROM Productos e")
    , @NamedQuery(name = "Productos.findByIdProducto", query = "SELECT e FROM Productos e WHERE e.idProductos = :idProductos")
    , @NamedQuery(name = "Productos.findByPrecio", query = "SELECT e FROM Productos e WHERE e.precio = :precio")
    , @NamedQuery(name = "Productos.findByNombre", query = "SELECT e FROM Productos e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Productos.findByTiempo", query = "SELECT e FROM Productos e WHERE e.tiempo = :tiempo")
    , @NamedQuery(name = "Productos.findByCategoria", query = "SELECT e FROM Productos e WHERE e.categoria = :categoria")
    , @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT e FROM Productos e WHERE e.descripcion = :descripcion")}) 
    


public class Productos implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "idProducto")
    private Integer idProductos;
    
    @Basic(optional = false)
    @Column(name = "precio")
    private String precio;

    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    
    @Basic(optional = false)
    @Column(name = "tiempo")
    private String tiempo;
    
    @Basic(optional = false)
    @Column(name = "categoria")
    private String categoria;
    
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    
   
    public Productos(){
        
    }
    
    public Productos(Integer idProductos){
        this.idProductos = idProductos;
    }
    
    public Productos(Integer idProductos, String precio, String tiempo, String nombre, String categoria, String descripcion){
        this.idProductos = idProductos;
        this.precio = precio;
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }
    
    
    public Integer getIDProducto(){
        return idProductos;
    }
    
    public void setIDProducto(Integer idProducto){
        this.idProductos = idProducto;
    }
    
    public String getPrecio(){
        return precio;
    }
    
    public void setPrecio(String precio){
        this.precio = precio;
    }
    
    public String getTiempo(){
        return tiempo;
    }
    
    public void setTiempo(String tiempo){
        this.tiempo = tiempo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProductos != null ? idProductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.idProductos == null && other.idProductos != null) || (this.idProductos != null && !this.idProductos.equals(other.idProductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DataBaseAccess.AccesoProductos[ idProducto = " + idProductos + " ]";
    }
}
