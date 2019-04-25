
/**
 * Implementa la parte de Modelo de Datos
 * 
 * @author Diego
 * @version 22/04/2019
 */
import java.util.ArrayList;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
    	for (Producto prod : this.lista) {
    		if (prod.getCodigo() == p.getCodigo()) {
    			//producto ya existe en la lista
    			return false;
    		}
    	}
      return this.lista.add(p);  
    }
 
    public boolean borrarProducto ( int codigo ){
    	//comprobar si devuelve false al no encontrar producto
    	return this.lista.removeIf(x -> x.getCodigo() == codigo);
    }
    
    public Producto buscarProducto ( int codigo) {
    	for (Producto prod : this.lista) {
    		if (prod.getCodigo() == codigo) {
    			return prod;
    		}
    	}
      return null;
    }
    
    public void listarProductos (){
    	for (Producto prod : this.lista) {
    		System.out.println(prod);

    	}   
    }
    
    public boolean modificarProducto (Producto nuevo){
    	for (Producto prod : this.lista) {
    		if (prod.getCodigo() == nuevo.getCodigo()) {
    			prod = nuevo;
    		}
    	}
       return false;
    }
    
    public void listarPocoStock() {
    	for (Producto p : this.lista) {
    		if (p.getStock() < p.getStock_min())
    			System.out.println(p);
    	}
    }
}    

