/**
 * Interfaz de moneda con los métodos a usar por Dolar y Euro
 */
package clases;

/**
 * Declaración de interfaz y métodos
 */
public interface Moneda 
{
	public double factorConversion();
	public double convertir(double monto);
}
