package libro;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibroTest {

	@Test
	public void testPrestamo() {
		Libro libro = new Libro();
		libro.prestamo();
		boolean resultado = libro.getDisponible();
		boolean esperado = false;
		assertEquals(esperado,resultado);
		
	}
	
	@Test
	public void testDevolucion() {
		Libro libro = new Libro();
		boolean resultado = libro.getDisponible();
		boolean esperado = true;
		assertEquals(esperado,resultado);
	}
	@Test
	public void testDevolucion2() {
		Libro libro = new Libro();
		libro.prestamo();
		boolean resultado = libro.getDisponible();
		boolean esperado = false;
		assertEquals(esperado,resultado);
	}
}
