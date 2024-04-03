package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Dolar;

class DolarTest 
{

	@Test
	void testFactorConversion() 
	{
		Dolar dolar = new Dolar();
		assertEquals(982.00, dolar.factorConversion());
	}

	@Test
	void testConvertir() 
	{
		Dolar dolar 	= new Dolar();
		double valorTest 	= 1000000 / dolar.factorConversion(); 
		assertEquals(valorTest 	, dolar.convertir(1000000));
	}
}
