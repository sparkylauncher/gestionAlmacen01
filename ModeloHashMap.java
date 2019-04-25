
/**
 * Write a description of class ModeloHaspMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.HashMap;

public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;
    
    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }

	@Override
	public boolean insertarProducto(Producto p) {
		Producto prod = this.lista.putIfAbsent(p.getCodigo(), p);
		if (prod == null) {
			return true;
		}
		return false;
	}

	@Override
	boolean borrarProducto(int codigo) {
		Producto res = this.lista.remove(codigo);
		if (res == null)
			return false;
		return true;
	}

	@Override
	public Producto buscarProducto(int codigo) {
		return this.lista.get(codigo);
	}

	@Override
	void listarProductos() {
		for (Integer i : this.lista.keySet()) {
			System.out.println(this.lista.get(i));
		}
		
	}

	@Override
	boolean modificarProducto(Producto nuevo) {
		Producto p;
		for (Integer i : this.lista.keySet()) {
			p = this.lista.get(i);
			if (p.getCodigo() == nuevo.getCodigo()) {
				this.lista.put(i,nuevo);
				return true;				
			}
		}
		return false;
	}

	@Override
	void listarPocoStock() {
		Producto p;
		for (Integer i : this.lista.keySet()) {
			p = this.lista.get(i);
			if(p.getStock() < p.getStock_min())
				System.out.println(p);
		}	
	}
    
    
}
