package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import clases.Cuenta;

class CuentaTest 
{

	@Test
	void testConstructorCuenta() 
	{
		Cuenta cuenta = new Cuenta(100, "Daniel", 1000000);
		assertEquals(100, cuenta.getNumeroCuenta());
		assertEquals("Daniel", cuenta.getTitular());
		assertEquals(1000000, cuenta.getSaldo());
	};
	
	@Test
	void testSetNumeroCuenta()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setNumeroCuenta(100);
		assertEquals(100, cuenta.getNumeroCuenta());
	}
	
	@Test
	void testGetNumeroCuenta()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setNumeroCuenta(100);
		cuenta.getNumeroCuenta();
		assertEquals(100, cuenta.getNumeroCuenta());
	}
	
	@Test
	void testSetTitular()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setTitular("Daniel");
		cuenta.getTitular();
		assertEquals("Daniel", cuenta.getTitular());
	}	

	@Test
	void testGetTitular()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setTitular("Daniel");
		cuenta.getTitular();
		assertEquals("Daniel", cuenta.getTitular());
	}	
	
	@Test
	void testSetSaldo()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldo(1000000);
		cuenta.getSaldo();
		assertEquals(1000000, cuenta.getSaldo());
	}	

	@Test
	void testGetSaldo()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldo(1000000);
		cuenta.getSaldo();
		assertEquals(1000000, cuenta.getSaldo());
	}	
	
	@Test
	void testIngresarDinero()
	{
		Cuenta cuenta = new Cuenta(100, "Daniel", 1000000);
		cuenta.ingresarDinero(100000);
		assertEquals(1100000, cuenta.getSaldo());
	};
	
	@Test
	void testRetirarDinero()
	{
		Cuenta cuenta = new Cuenta(100, "Daniel", 1000000);
		cuenta.retirarDinero(200000);
		assertEquals(800000, cuenta.getSaldo());
	}
	
	@Test
	void testCrearCuenta()
	{
		Cuenta cuenta = new Cuenta();
		cuenta.setNumeroCuenta(100);
		cuenta.setTitular("Daniel");
		cuenta.setSaldo(1000000);
		
		assertEquals(100, cuenta.getNumeroCuenta());
		assertEquals("Daniel", cuenta.getTitular());
		assertEquals(1000000, cuenta.getSaldo());		
	}
	
	

}
