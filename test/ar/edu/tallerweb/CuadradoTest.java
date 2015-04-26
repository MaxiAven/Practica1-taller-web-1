package ar.edu.tallerweb;

import org.junit.Assert;
import org.junit.Test;

public class CuadradoTest {
	
	
	@Test
	
	public void testArea(){
		
		Cuadrado prueba = new Cuadrado(4);
		float pruebaArea = prueba.area();
		Assert.assertEquals(16, pruebaArea,0.1);
		
	}
	
@Test
	
	public void testPerimetro(){
		
		Cuadrado prueba = new Cuadrado(8);
		float pruebaPerimetro = prueba.perimetro();
		Assert.assertEquals(32, pruebaPerimetro,0.1);
		
	}

}
