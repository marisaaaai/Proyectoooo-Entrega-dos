/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoya
Main*/
//Se importa el scanner
import java.util.Scanner;
class ProyectoPOO{
	public static void main (String[] args){
		//Se instancia el scanner
		Scanner scan = new Scanner(System.in);
		//Se crean las variables de instancia
		// Usuario guarda los datos del usuario, lo cual falta agregar
		String usuario;
		//Guarda los ingresos del usuario
		float ingresosm;
		//Guarda los gastos mensuales del usuario
		float gastosm;
		// Guarda la variable de ahorros que tendra el usuario 
		float ahorrarm;
		//Se opera para saber el saldo neto que tendra el usuario
		float saldoneto;
		//Se crea un while que le permitira al usuario interactuar con el programa hasta que decida salirse
		while (int w != 4){
			//Se le muestra el menu con las opciones al usuario
			System.out.println("Bienvenido");
			System.out.println("1.Realizar presupuesto");
			System.out.println("2. Recomendaciones de restaurantes");
			System.out.println("3.Recetas");
			System.out.println("Ingrese su opcion en numeros");
			//Se le pide al usuario que ingrese la opcion deseada
			w = scan.nextInt();
			//Si el usuario desea crear un presupesto...
			if (w==1){
				//Se le pide los ingresos y egresos que tiene para crear el presupuesto
				System.out.println("Presupuesto");
				System.out.printn("Ingrese sus ingresos mensuales: ");
				ingresosm = scan.nextFloat();
				System.out.println("Ingrese sus gastos mensuales, los que usted considere que hace cada mes y son constantes, como pagos de carros, casas, prestamos, comida, luz, agua, etc.");
				gastosm = scan.nextFloat();
				//Se instancia la nueva clase de presupuesto 
				presupuesto pres = new presupuesto (ingresosm, gastosm);
			}
			else {
				if ( w ==2){
					System.out.println("Base de datos wtf");
					//Instanciar nueva clase creada de Restaurantes locales
				}
				else{
					if ( w ==3){
						System.out.println("Base de datos X2");
						//Instanciar nueva clase creadad de recetas
					}
				}
			}
			//Se vuelve a mostrar el menu solo que ahora con la opcion de salir
			System.out.println("Bienvenido");
			System.out.println("1. Realizar presupuesto");
			System.out.println("2. Recomendaciones de restaurantes");
			System.out.println("3. Recetas");
			System.out.println("4. Salir");
			System.out.println("Ingrese su opcion en numeros");
			w = scan.nextInt();			
		}
		System.out.println("Gracias por usar nuestro programa");

	}
}