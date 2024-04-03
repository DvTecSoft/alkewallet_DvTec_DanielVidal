package wallet;

//Importa Clases Nativas 
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.text.DecimalFormat;

// Impora clases de trabajo
import clases.Cuenta;
import clases.Dolar;
import clases.Euro;

/**
 * Clase principal
 * @author DvTec Spa
 * @version 1.0
 * @sence 30/03/2024
 */
public class Main 
{
	// Instancia Librerías
	static Scanner scanner  	= new Scanner(System.in);
	static Scanner enter 		= new Scanner(System.in);
	static DecimalFormat decimalForm = new DecimalFormat("#.0000");
	
	// Declarción de variables para los menú e inicializa
	static int select 			= -1;
	static int selectConversion	= -1;
	
	/** 
	 * Método pricipal para ejecución de la app
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Declaración de variables locales
		boolean cuentaCreada 	= false; 
		int monto 				= 0;
		Cuenta cuentaNueva 		= null ;
		
		// Ciclo para el menú principal
		while(select != 0)
		{
			// Muestro opciones del menú principal
			System.out.println("Bienvenido a su banco ALKEDV");
			System.out.println("Indique opción");
			System.out.println("");
			System.out.println("1.- Crear cuenta\n" +
					"2.- Girar\n" +
					"3.- Depositar\n" +
					"4.- Saldo\n" +
					"5.- Convertir Saldo\n" +
					"0.- Salir\n");
			
			//Try catch para evitar que el programa termine si hay un error
			try
			{
				// Obtengo el valor ingresado por el usuario
				select = Integer.parseInt(scanner.nextLine()); 	
				
				// Menú principal
				switch(select)
				{
					case 1: // Opción Crear Cuenta
						if (cuentaCreada == false) 
						{
							// Cuenta cuentaNueva = new Cuenta();
							cuentaNueva = Cuenta.crearCuenta();
							if (cuentaNueva.getNumeroCuenta() != 0)
							{
								cuentaCreada = true;
								System.out.println("La cuenta ha sido creada correctamente.");
								enter();
							}
						}
						else
						{
							System.out.println("La cuenta ya ha sido creada.\nPara crear una nueva, seleccione la opción 0.- Salir y reintente.");
							enter();
						}
						break;
					case 2: // Opción Girar
						
						if (cuentaCreada == true) 
						{
							System.out.println("Ingrese monto a girar:");
							monto = Integer.parseInt(scanner.nextLine()); 
							
							if (monto <= cuentaNueva.getSaldo()) 
							{
								cuentaNueva.retirarDinero(monto);
								System.out.println("Su saldo después del giro es: " + cuentaNueva.getSaldo() + " pesos.");
							}
							else
							{
								System.out.println("Saldo insuficiente para retiro.\nSu saldo actual es: " + cuentaNueva.getSaldo() + " pesos.\nValide y reintente.");
							}
							enter();
						}
						else
						{
							System.out.println("No existe la cuenta para realizar esta acción.\nValide y reintente.");
							enter();
						}
						
						break;
					case 3: // Opción Depositar
						if (cuentaCreada == true) 
						{
							System.out.println("Ingrese monto a depositar:");
							monto = Integer.parseInt(scanner.nextLine()); 
							cuentaNueva.ingresarDinero(monto);
							System.out.println("Su saldo después del depósito es: " + cuentaNueva.getSaldo() + " pesos.");
							enter();
						}
						else
						{
							System.out.println("No existe la cuenta para realizar esta acción. Valide y reintente.");
							enter();
						}
						break;
					case 4: // Opción Saldo
						if (cuentaCreada == true) 
						{
							System.out.println("Su saldo actual es de: " + cuentaNueva.getSaldo() + " pesos.");
							enter();
						}
						else
						{
							System.out.println("No existe la cuenta para realizar esta acción. Valide y reintente.");
							enter();
						}
						break;
					case 5: // Opción Convertir Saldo
						if (cuentaCreada == true) 
						{
							System.out.println("Conversión de saldo");
							System.out.println("Indique a qué moneda desea convertir");
							System.out.println("1.- Peso CLP\n" +
									"2.- Dolar USD\n" +
									"3.- Euro EUR\n" +
									"0.- Volver\n");
							try
							{
								// Obtengo selección del menú conversión de monedas
								selectConversion = Integer.parseInt(scanner.nextLine()); 
								
								// Menú de conversión de monedas
								switch(selectConversion)
								{
									case 1: // Opción Covertir a CLP
										System.out.println("Su saldo es de: " + cuentaNueva.getSaldo() + " pesos.");
										enter();
										break;
									case 2: // Opción Covertir a USD
										Dolar usd = new Dolar();
										System.out.println("Su saldo es de: " + decimalForm.format(usd.convertir(cuentaNueva.getSaldo())) + " dolares.");
										System.out.println("Factor de conversión: " + usd.factorConversion() + " al día 26/03/2024");
										enter();
										break;
									case 3: // Opción Covertir a Eur
										Euro eur = new Euro();
										System.out.println("Su saldo es de: " + decimalForm.format(eur.convertir(cuentaNueva.getSaldo())) + " euros.");
										System.out.println("Factor de conversión: " + eur.factorConversion() + " al día 26/03/2024");
										enter();
										break;
									case 0: // Opción Salir
										break;
								} // fin switch
							}
							catch(Exception e) 
							{
								System.out.println("Opción inválida. Valide y reintente.");
								break;
							}
						}
						else
						{
							System.out.println("No existe la cuenta para realizar esta acción. Valide y reintente.");
						}
						break;
					case 0: // Salir
						if (cuentaCreada == true) 
						{ 
							System.out.println("Gracias por su preferencia " + cuentaNueva.getTitular() + ", vuelva pronto.\nSu banco ALKEDV...");
						}
						else
						{
							System.out.println("Gracias por su preferencia, vuelva pronto.\nSu banco ALKEDV...");
						}
						break;
				} // fin switch
				System.out.println("\n"); //Mostrar un salto de línea en Java
			}
			catch(Exception e)
			{
				// System.out.println(e);
				System.out.println("Opción inválida. Valide y reintente.");
			}
		}		
	}
	
	/**
	 * Método que envía mensaje para continuar y espera pulsar enter
	 */
	public static void enter()
	{
		System.out.println("\nPresione <Enter> para continuar...");
		scanner.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER
	}

}
