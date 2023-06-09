package app;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private List<Producto> productos;

	public Carrito() {
		productos = new ArrayList<>();
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
	}
	
	public double calcularTotal() {
		double total = 0.0;
		
		for (Producto producto : productos) {
			total += producto.getPrecio();
		}
		
		return total;
	}
	
	

}
