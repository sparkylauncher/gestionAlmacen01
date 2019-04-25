
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
	private static int gen_codigo = 0;
    // instance variables - replace the example below with your own
    private int codigo;    // Código del producto, se utiliza para buscar
    private String nombre; // Nombre un texto
    private int stock;    // existencia actuales
    private int stock_min; // Número mínimo de existencias recomedadas
    private float precio;  // Precio

    /**
     * Constructor for objects of class Producto
     */
    
    public Producto (String nombre, int stock, int stock_min, float precio){
        this.codigo = gen_codigo;
        gen_codigo++;
        this.nombre = nombre;
        this.stock = stock;
        this.stock_min = stock_min;
        this.precio = precio;
    }

    
    public int getCodigo (){
        return codigo;
    }
    
    @Override
    public String toString(){
       return "Codigo: " + codigo +" || Nombre: "+  nombre +" ||Stock :"+ stock + " || Precio: " + precio;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setStock( int valor ){
        stock = valor;
    }
    
    public int getStock_min(){
        return stock_min;
    }
    
    public void setStock_min( int valor ){
        stock_min = valor;
    }
    
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio( float valor ){
        precio = valor;
    }
    
    public void incrementarStock(int cantidad) {
    	this.stock = this.stock + cantidad;
    }
    
    public boolean decrementarStock(int cantidad) {
    	if (this.stock < cantidad)
    		return false;
    	this.stock = this.stock - cantidad;
    	return true;
    }
}
