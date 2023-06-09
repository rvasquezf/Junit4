package app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarritoTest {
	
	
	//El sujeto de prueba
	private Carrito carrito;
	private Producto producto1;
	private Producto producto2;
	
	//Configuracion inicial antes de cada @Test ( método de prueba )
	
	@Before
	public void setUp() {
		carrito = new Carrito();
		producto1 = new Producto("Monitor Gamer Asus", 250000);
		producto2 = new Producto("Mouse Razer", 65000);
		
		carrito.agregarProducto(producto1);
		
	}
	
	
	@Test
	public void testAgregarProducto() {
		
		assertEquals(1, carrito.getProductos().size());
		
		carrito.agregarProducto(producto2);
		assertEquals(2, carrito.getProductos().size());
	
	}

	
	@Test
	public void testEliminarProducto() {
		
		carrito.eliminarProducto(producto1);
		
		assertEquals(0, carrito.getProductos().size());
	}
	
	
	@Test
	public void testCalcularTotal() {
		
		double total = carrito.calcularTotal();
		assertEquals(250000, total, 0.0);
	}
	
	@Test
	public void testCalcularTotalDespuesDeAgregarProductos() {
	    carrito.agregarProducto(producto2);
	    double total = carrito.calcularTotal();
	    assertEquals(315000, total, 0.0);
	}

	@Test
	public void testEliminarProductoInexistente() {
	    Producto producto3 = new Producto("Teclado Logitech", 120000);
	    carrito.eliminarProducto(producto3);
	    assertEquals(1, carrito.getProductos().size());
	}
	
	
	
}
