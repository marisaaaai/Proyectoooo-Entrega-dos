/*Proyecto de POO
Grupo:
Maria Jose Morales
Andres Paiz
Jose Ramos
Luis Pedro García
Maria Montoyan
Main*/
//Se importa el scanner
import java.util.Scanner;
class ProyectoPOOD{
	public static void main (String[] args){
		//Se instancia el scanner
		Scanner scan = new Scanner(System.in);
		// se definen las variables de instancia
		//Una variable que comienza el while
		int w=0;
		//Un while que comienza mostrandole el menú principal al usuario
		while (w!=3){
			//Se le muestra la opcion de si es paciente o proveedor
			System.out.println("Bienvenido a la simulación de un servicio de llamadas");
			System.out.println("Para ir a la opcion de pacientes presione 1");
			System.out.println("Para ir a la opcion de proveedores presione 2");
			int opcion = scan.nextInt();
			//si la opcion es de ser paciente
			if (opcion==1){
				//Se le pregunta el nombre
				System.out.println("Ingrese su nombre completo: ");
				String nombre = scan.nextLine();
				//Se le muestran los sintomas que podria estar teniendo
				System.out.println("Buen dia " + nombre + " lamentamos que te estes sintiendo mal");
				System.out.println("A continuacion te enlistaremos sintomas que puedes estar sintiendo, por favor ingresa el numero del síntoma que más te está afectando en el momento de ahora:");
				System.out.println("1. Tos");
				System.out.println("2. Dolor de Garganta");
				System.out.println("3. Dolor de oido");
				System.out.println("4. Dolores de cabeza");
				System.out.println("5. Infeccion urinaria (dolores al ir al baño, picazón en las áreas privadas...)");
				System.out.println("6. Dolores de cabeza");
				int sintoma = scan.nextInt();
				//se le pregunta si es menor o mayor de edad
				System.out.println("La persona que está sintiendo estos síntomas es menor, o de la misma edad, de 18 años?");
				System.out.println("Si la respuesta es 'Si' presione 1");
				System.out.println("Si la respuesta es 'No' presione 2");
				int edad = scan.nextInt();
				//Si es menor de edad, se le aconseja ir con un pediatra, ya que ellos suelen tener registro de todos los antecedentes médicos y es mejor ir con ellos por una consulta
				if (edad==1){
					System.out.println("Por favor, deberia de contactar a su pediatra, con el que ha ido desde niño para chequear si estos sintomas se deben a falta de vacunacion");
					//Se toma la posibilidad que puede que no posea algun pediatra al cual llamar 
					System.out.println("Usted posee un pediatra con el cual consultar?");
					System.out.println("Si su respuesta es 'Si' presione 1");
					System.out.println("Si su respuesta es 'No' presione 2");
					int pediatra = scan.nextInt();
					//Si si posee un pediatra se le aonseja que lo llame y haga una cita
					if (pediatra==1){
						System.out.println("Su respuesta ha sido que si tiene pediatra, si se ha equivocado, cuelgue e intente de nuevo");
						System.out.println("Si esta si ha sido su respuesta, por favor llame a su pediatra y consulte si puede agende una cita con el");
						//Se le pregunta al usuario si se desea que se le programe una cita
						System.out.println("Desea que nosotros lo llamemos y agendemos una cita por usted?");
						System.out.println("Si la respuesta es 'Si' presione 1");
						System.out.println("Si la respuesta es 'No' presione 2");
						int cita = scan.nextInt();
						//si la respuesta es si
						if (cita==1){
							//preguntarle el numero de contacto del pediatra y la fecha en la cual desea hacer la cita
							System.out.println("Por favor ingrese la fecha, con el formato de DD/MM/AA, y la hora a la que desearía atender a la cita");
							int citaprogramada= scan.nextLine();
							System.out.println("Por favor ingrese el número de contacto del pediatra, sin guiones ni espacios, para poder contactarlo");
							int numeropediatra=scan.nextInt();
							System.out.println("Nosotros estaremos llamando a su pediatra para programar una cita, su pediatra deberia de llamarlo a usted para confirmarle la cita, o para programar a otra hora en todo caso no estuviera disponible");
						}
						else{
							//si no desea que se le haga la cita insistir en que el la haga y llame al pediatra
							if(cita==2){
								System.out.println("Su respuesta ha sido que no quiere que le agendemos una cita con su pediatra");
								System.out.println("Esta bien, pero por favor luego de esta llamada no olvide de contactar con su pediatra, entre más tiempo espera peor se pueden poner los síntomas, es mejor resolverlo lo antes posible");
							}
							else{
								System.out.println("El numero que ingresó no es una opcion, intentelo de nuevo");
							}
						}
					}
					else{
						//si el usuario no tiene pediatra
						if (pediatra==2){
							System.out.println("Su respuesta ha sido que no tiene pediatra");
							//se le pregunta si desea que se le proporcione informacion de un pediatra
							System.out.println("Desea que nosotros le proporcionemos el contacto de un pediatra?");
							System.out.println("Si la respuesta es 'Si' presione 1");
							System.out.println("Si la respuesta es 'No' presione 2");
							int nuevopediatra=scan.nextInt();
							//Si la respuesta es que si
							if (nuevopediatra==1){
								System.out.println("Con gusto le proporcionaremos informacion de pediatras");
								System.out.println("Pero primero, compartanós el número de departamento en el que se encuentra usted");
								//se le pregunta su ubicacion para darle informacion sobre pediatras en esa área
								System.out.println("1. Peten");
								System.out.println("2. Alta Verapaz");
								System.out.println("3. Baja Verapaz");
								System.out.println("4. Chimaltenango");
								System.out.println("5. El Progreso");
								System.out.println("6. Escuintla");
								System.out.println("7. Guatemala");
								System.out.println("8. Jutiapa");
								System.out.println("9. Jalapa");
								System.out.println("10. Zacapa");
								System.out.println("11. Izabal");
								System.out.println("12. Quetzaltenango");
								System.out.println("13. Quiche");
								System.out.println("14. Retalhuleu");
								System.out.println("15. Santa Rosa");
								System.out.println("16. San Marcos");
								System.out.println("17. Solola");
								System.out.println("18. Suchitepequez");
								System.out.println("19. Totonicapan");
								System.out.orintln("20. Sacatepequez");
								System.out.println("21. Huehuetenango");
								System.out.println("22. Chiquimula");
								System.out.pritnln("Por favor ingrese el numero de su departamento");
								int departamento = scan.nextInt();
								System.out.println("Por favor ingrese su correo para enviarle la informacion deseada:");
								int correousuario= scan.nextLine();
								if (departamento==1){
									System.out.pritnln("A continuacion se le enviará a su correo una lista de pediatras en el departamento de Peten");
									System.out.println("Está lista poseera su ubicacion, numero de telefono y el nombre del Doctor")
								