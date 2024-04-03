/**
 * Clase cuenta que permitirá crear una cuenta, aumentar, rebajar y consultar saldo 
 */
package clases;

import java.util.Scanner;

/**
 * Se define la clase Cuenta con sus respectivos parámetros
 * @author	: DvTec
 * @version	: 1.0.0
 * @since	: 25.03.2024 
 */

public class Cuenta 
{

	static Scanner scanner  	= new Scanner(System.in);
	
	/**
	 * Declaración  de atributos de clase 
	 */
	int numeroCuenta;
	String titular;
	double saldo;
	/*
	
	/**
	 * Creación de constructores
	 */
	public Cuenta()
	{
	}

	/**
	 * Constructor de Cuenta
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 */
	public Cuenta(int numeroCuenta, String titular, double saldo) 
	{
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	/**
	 * Creción de getters & setters
	 * @return the numeroCuenta
	 */
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(int numeroCuenta) 
	{
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() 
	{
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) 
	{
		this.titular = titular;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() 
	{
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}

	/*
	 * ==========================================================
	 * Métodos propios
	 * ==========================================================
	 */
	
	/**
	 * Método que aumenta el saldo actual según el monto ingresado
	 * @param monto es el dinero que aumentará al saldo actual
	 */
	public void ingresarDinero(double montoIngresado)
	{
		this.saldo = this.saldo + montoIngresado;
	}

	/**
	 * Método para retirar monto de nuestra cuenta
	 * @param montoRetirado es el dinero que disminuirá del saldo actual
	 */
	public void retirarDinero(double montoRetirado)
	{
		this.saldo = this.saldo - montoRetirado;
	}
	
	/**
	 * Método para la creación de la cuenta con los datos de numero de cuenta, titular y saldo inicial
	 * @return Objeto cuenta con los datos ingresados
	 */
	public static Cuenta crearCuenta()
	{
		// Instancia la clase Cuenta
		Cuenta cuenta = new Cuenta();

		System.out.println("Ingrese Nombre de cliente: ");
		cuenta.setTitular(scanner.nextLine());

		System.out.println("Ingrese el # de cuenta bancaria: ");
		cuenta.setNumeroCuenta(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Ingrese el saldo inicial: ");
		cuenta.setSaldo(scanner.nextDouble());

		// Retorna objeto cuenta
		return cuenta;
	}	
	/*
	 * ==========================================================
	 * FIN Métodos propios
	 * ==========================================================
	 */
	
	
	
	

}
