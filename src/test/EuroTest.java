package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Euro;

class EuroTest {

	@Test
	void testFactorConversion() 
	{
		Euro euro = new Euro();
		assertEquals(1063.00, euro.factorConversion());
	}

	@Test
	void testConvertir() 
	{
		Euro euro 	= new Euro();
		double valorTest 	= 1000000 / euro.factorConversion(); 
		assertEquals(valorTest 	, euro.convertir(1000000));
	}

}
