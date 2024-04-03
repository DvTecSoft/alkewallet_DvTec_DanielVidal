package clases;

/**
 * Clase para realizar la conversión de moneda a Euro, según su factor de conversión
 */
public class Euro implements Moneda 
{

	/**
	 * Creación de constructor vacío
	 */
	public Euro() 
	{
	}

	/**
	 * Asigna el Factor de conversión
	 */
	@Override
	public double factorConversion() 
	{
		return 1063.00; // Al 26/03/2024
	}
	
	/**
	 * Realiza la conversión del monto con el factor de conversión
	 */
	@Override
	public double convertir(double monto) 
	{
		return monto / this.factorConversion();
	}

	
}
