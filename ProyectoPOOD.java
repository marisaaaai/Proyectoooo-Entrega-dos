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

class ProyectoPOOD{
	public static void main (String[] args){
		//Se instancia el scanner
		Scanner scan = new Scanner(System.in);
		// se definen las variables de instancia

		//Una variable que comienza el while
		int w=0;
		//variable para usar la calse y llamar bas de datos 
		//Linea 22 y opcion 386
		proveedores p = new proveedores(); 
		transporte t = new transporte();
		hoteles h = new hoteles();
		//variable para enfermedad
		enfermedad enfermedad = new enfermedad(); 
		//Un while que comienza mostrandole el menú principal al usuario
		while (w!=2){
			//Se le muestra la opcion de si es paciente o proveedor
			System.out.println("Bienvenido a la simulacion de un servicio de llamadas");
			System.out.println("Departamentos:");
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
			System.out.println("20. Sacatepequez");
			System.out.println("21. Huehuetenango");
			System.out.println("22. Chiquimula");
			System.out.println("Por favor ingrese el numero del departamento en el que se encuentra: ");
			int dept = scan.nextInt();
			scan.nextLine();
			System.out.println("------------------------------------------------------");
			System.out.println("Para ir a la opcion de pacientes presione 1");
			System.out.println("Para ir a la opcion de proveedores presione 2");
			int opcion = scan.nextInt();
			scan.nextLine();
			System.out.println("------------------------------------------------------");
			//si la opcion es de ser paciente
			if (opcion==1){
				//Se le pregunta el nombre
				System.out.println("Ingrese su nombre completo: ");
				String nombre = scan.nextLine();   
				System.out.println("");
				//Se le muestran los sintomas que podria estar teniendo
				System.out.println("Buen dia " + nombre + " lamentamos que te estes sintiendo mal");
				//while para poder ingresar mas de un sintoma en caso que sea necesario 
				String massintomas = "si";
				int sintoma;
				//acumula el diagnostico para mostrar al final (al final del if de paciente) 
				String diagnosticos = "Sus posibles enfermedades son: "; 
				while (massintomas.equalsIgnoreCase("si")){
					System.out.println("A continuacion te enlistaremos sintomas que puedes estar sintiendo, por favor ingresa el numero del sintoma que mas te esta afectando:");
					System.out.println("1. Tos");
					System.out.println("2. Dolor de garganta");
					System.out.println("3. Dolor de oido");
					System.out.println("4. Dolores de cabeza");
					System.out.println("5. Dolores al orinar, picazón en genitales");
					System.out.println("7. Vomitos y diarrea");
					System.out.println("8. Cambio de peso repentino");
					System.out.println("9. Presion alta");
					System.out.println("10. Escalofrios, dolor intenso en torax");
					System.out.println("11. Fiebre alta, ronchas o rash en la piel");
					System.out.println("12. Congestion");  
					System.out.println("13. Dolores en el pecho agudo");
					System.out.println("14. Dolor de estomago");
					System.out.println("15. Dolor en las articulaciones ( dolor en brazo, piernas, manos, ect... )");				
					System.out.println("16. Temblores en el cuerpo");
					System.out.println("17. Perdida del equilibrio");
					System.out.println("18. Dolor de espalda");
					sintoma = scan.nextInt();
					scan.nextLine(); 
					//saldria algo asi Sus posibles enfermedades son: tos, hipertension, alergia, 
					diagnosticos = diagnosticos + enfermedad.diagnostico(sintoma)+", " ;
					System.out.println("Tiene otro sintoma que desee agregar? (si/no)");
					massintomas = scan.nextLine(); 
				}
				System.out.println("Ya has hecho una consulta con algun doctor o especialista");
				System.out.println("Si esta es su primera cita, presione 1");
				System.out.println("Si ya ha tenido una consulta medica, presione 2");
				int consulta= scan.nextInt();
				scan.nextLine(); 
				if (consulta==1){
					System.out.println("");
					System.out.println("------------------------------------------------------");
					//se le pregunta si es menor o mayor de edad
					System.out.println("------------------------------------------------------");
					System.out.println("");
					System.out.println("El paciente es menor a 18 anios? (si/no)");
					System.out.println("Si la respuesta es 'Si' presione 1");
					System.out.println("Si la respuesta es 'No' presione 2");
					int edad = scan.nextInt();
					scan.nextLine(); 
					//Si es menor de edad, se le aconseja ir con un pediatra, ya que ellos suelen tener registro de todos los antecedentes médicos y es mejor ir con ellos por una consulta
					if (edad==1){
						System.out.println("");
						System.out.println("Por favor, deberia de contactar a su pediatra, con el que ha ido desde niño para chequear si estos sintomas se deben a falta de vacunacion");
						//Se toma la posibilidad que puede que no posea algun pediatra al cual llamar 
						System.out.println("Usted posee un pediatra con el cual consultar?");
						System.out.println("Si su respuesta es 'Si' presione 1");
						System.out.println("Si su respuesta es 'No' presione 2");
						int pediatra = scan.nextInt();
						scan.nextLine(); 
						//Si si posee un pediatra se le aonseja que lo llame y haga una cita
						if (pediatra==1){
							System.out.println("");
							System.out.println("------------------------------------------------------");
							System.out.println("Su respuesta ha sido que si tiene pediatra, si se ha equivocado, cuelgue e intente de nuevo");
							System.out.println("Si esta si ha sido su respuesta, por favor llame a su pediatra y consulte si puede agende una cita con el");
							System.out.println("Su posible diagnostico por el momento es");
							System.out.println("");
							System.out.println("");
							System.out.println(diagnosticos);
							System.out.println("");
							System.out.println("");
							//Se le pregunta al usuario si se desea que se le programe una cita
							System.out.println("Desea que nosotros lo llamemos y agendemos una cita por usted?");
							System.out.println("Si la respuesta es 'Si' presione 1");
							System.out.println("Si la respuesta es 'No' presione 2");
							int cita = scan.nextInt();
							scan.nextLine(); 
							//si la respuesta es si
							if (cita==1){
								//preguntarle el numero de contacto del pediatra y la fecha en la cual desea hacer la cita
								System.out.println("");
								System.out.println("------------------------------------------------------");
								System.out.println("Por favor ingrese la fecha, con el formato de DD/MM/AA, y la hora a la que desearía atender a la cita");
								String citaprogramada= scan.nextLine();
								citaprogramada = scan.nextLine();                                                                                                   //bug de scanner
								System.out.println("Por favor ingrese el número de contacto del pediatra, sin guiones ni espacios, para poder contactarlo");
								int numeropediatra=scan.nextInt();
								scan.nextLine(); 
								System.out.println("Nosotros estaremos llamando a su pediatra para programar una cita, su pediatra deberia de llamarlo a usted para confirmarle la cita, o para programar a otra hora en todo caso no estuviera disponible");
								System.out.println("");
								System.out.println("Estos es el diagnostico que puede tener:");
								System.out.println(diagnosticos);
								System.out.println("");
							}
							else{
								//si no desea que se le haga la cita insistir en que el la haga y llame al pediatra
								if(cita==2){
									System.out.println("");
									System.out.println("------------------------------------------------------");
									System.out.println("Su respuesta ha sido que no quiere que le agendemos una cita con su pediatra");
									System.out.println("Esta bien, pero por favor luego de esta llamada no olvide de contactar con su pediatra, entre mas tiempo espera peor se pueden poner los sintomas, es mejor resolverlo lo antes posible");
									System.out.println("");
									System.out.println("Estos es el diagnostico que puede tener:");
									System.out.println(diagnosticos);
									System.out.println("");
								}
								else{
									System.out.println("------------------------------------------------------");
									System.out.println("El numero que ingresó no es una opcion, intentelo de nuevo");
									System.out.println("------------------------------------------------------");
								}
							}
						}
						else{
							//si el usuario no tiene pediatra
							if (pediatra==2){
								System.out.println("");
								System.out.println("------------------------------------------------------");
								System.out.println("Su respuesta ha sido que no tiene pediatra");
								//se le pregunta si desea que se le proporcione informacion de un pediatra
								System.out.println("Desea que nosotros le proporcionemos el contacto de un pediatra?");
								System.out.println("Si la respuesta es 'Si' presione 1");
								System.out.println("Si la respuesta es 'No' presione 2");
								int nuevopediatra=scan.nextInt();
								scan.nextLine();
								//Si la respuesta es que si
								if (nuevopediatra==1){
									System.out.println("Con gusto le proporcionaremos informacion de pediatras");
									//el dept esta en dept                                                                                       
									System.out.println("");
									System.out.println("Su posible diagnostico por el momento es");
									System.out.println("");
									System.out.println("");
									System.out.println(diagnosticos);
									System.out.println("");
									System.out.println("");

									System.out.println("Se muestra los hospitales que puede ir en su departamento que tienen pediatras: "+hosp.DBhospitales(dept-1));
								}
								else {
									if (nuevopediatra==2){
										System.out.println("Esta bien, pero por favor contacte un especialista");
										System.out.println("Su posible diagnostico por el momento es");
										System.out.println("");
										System.out.println("");
										System.out.println(diagnosticos);
										System.out.println("");
										System.out.println("");
									}
									else {
										System.out.println("El numero ingresado es invalido");
									}
								}
							}
							else {
								System.out.println("El numero ingresado es invalido");
							}
						}
					}
					else{
						//Si si es mayor de edad
						if (edad==2){
							System.out.println("");
							System.out.println("------------------------------------------------------");
							System.out.println("Ha contestado que el paciente es mayor de edad");
							System.out.println("A continuacion se le brindara informacion sobre los procesos que debera de llevar en su consulta");
							System.out.println("Ya conoce algun doctor con el cual ir, o alguna clinica medica?");	
							System.out.println("Si es asi presiones 1");
							System.out.println("Si no, por favor presione 2");
							int doctor=scan.nextInt();
							scan.nextLine(); 
							if (doctor==1){
								System.out.println("------------------------------------------------------");
								System.out.println("Esta bien, nos alegra que ya tenga un especialista conocido con el cual ir");
								System.out.println("Este es el proceso basico de una consulta clinica");
								System.out.println("Su posible diagnostico es");
								System.out.println("");
								System.out.println("");
								System.out.println(diagnosticos);
								System.out.println("");
								System.out.println("");
							}
							else{
								if (doctor==2){
									//en dept esta su departamento 
									System.out.println("------------------------------------------------------");
									System.out.println("Se le mostrara los hospitales en su departamento que puede ir para tener un doctor: "+p.DBhospitales(dept));
									System.out.println("Teniendo la informacion de doctores, este es el proceso basico que se necesita en la clinica");
									System.out.println("Su posible diagnostico es");
									System.out.println("");
									System.out.println("");
									System.out.println(diagnosticos);
									System.out.println("");
									System.out.println("");								
								}
								else{
									System.out.println("El numero ingresado es invalido");
								}
							}
						}
						else{
							System.out.println("El numero ingresado es invalido");
						}
					}
				}
				else if (consulta==2){
						System.out.println("");
						System.out.println("------------------------------------------------------");
						System.out.println("Usted ha ingresado aqui porque ya tuvo una consulta medica antes");
						System.out.println("Su consulta es con un doctor lejos de su ubicacion?");
						System.out.println("Si su respuesta es 'Si' presione 1");
						System.out.println("Si su respuesta es 'No' presione 2");
						int lejania=scan.nextInt();
						scan.nextLine();
						if (lejania==1){
							System.out.println("");
							System.out.println("A donde necesita ir?");
							System.out.println("Departamentos:");
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
							System.out.println("20. Sacatepequez");
							System.out.println("21. Huehuetenango");
							System.out.println("22. Chiquimula");
							System.out.println("Por favor ingrese el numero de su departamento: ");
							int deptlejano = scan.nextInt();
							scan.nextLine(); 
							System.out.println("");
							System.out.println("Ya sabe con quien ir?");
							System.out.println("1.Si");
							System.out.println("2.No");
							int decicionLejana = scan.nextInt();
							scan.nextLine(); 
							if (decicionLejana==1){
								scan.nextLine();
								System.out.println("");
								System.out.println("------------------------------------------------------");
								System.out.println("Necesita transporte y/o hospedaje?");
								System.out.println("1.Si");
								System.out.println("2.No");
								int DecicionHospedajeLejano = scan.nextInt();
								scan.nextLine(); 
								if (DecicionHospedajeLejano== 1){
									System.out.println("------------------------------------------------------");
									System.out.println("Estos son los hoteles disponibles: " + p.DBhoteles(deptlejano-1));
									System.out.println("Estos son los transportes disponibles: " + p.DBtransporte(deptlejano-1));
								}
								else if (DecicionHospedajeLejano == 2){
									System.out.println("Perfecto.");
								}
							}

							else if (decicionLejana == 2){
								System.out.println("------------------------------------------------------");
								System.out.println("Desea que le demos informacion de doctores cerca de su lugar escogido?");
								System.out.println("1.Si");
								System.out.println("2.No");
								int infoDoctores = scan.nextInt();
								scan.nextLine(); 
								if (infoDoctores==1){
									System.out.println("------------------------------------------------------");
									System.out.println("Los hospitales donde encontrara doctores es su departamento son: "+p.DBhospitales(deptlejano-1));
									System.out.println("Estos son los hoteles disponibles: " + p.DBhoteles(deptlejano-1));
									System.out.println("Estos son los transportes disponibles: " + p.DBtransporte(deptlejano-1));
								}
								else if (infoDoctores==2){
									System.out.println("");
									System.out.println(" Le recomendamos que busque informacion por su cuenta.");
								}
								else{
									System.out.println("");
									System.out.println("Ha ingresado una opcion incorrecta."); 
								}
							}
							else{
								System.out.println("");
								System.out.println("Ha ingresado una opcion incorrecta."); 
							}
						}
						else if (lejania == 2){
							System.out.println("------------------------------------------------------");
							System.out.println("Desea que le demos transporte?");
							System.out.println("1. Si");
							System.out.println("2. No");
							int quiereTransporte = scan.nextInt();
							scan.nextLine();
							if(quiereTransporte== 1){
								System.out.println("------------------------------------------------------");
								System.out.println("Estos son los transportes disponibles: " + p.DBtransporte(dept-1));
							}
							if(quiereTransporte== 2){
								System.out.println("Perfecto.");
								w = 2;
							}
						}
					}
					else{
						System.out.println("");
						System.out.println("El numero ingresado es invalido");
					}

			}
			else {
				if (opcion ==2){
					//mostrar opciones de los proveedores
					System.out.println("");
					System.out.println("------------------------------------------------------");
					System.out.println("Para ser agregado a nuestra base de datos, indique el numero de servicio que usted brinda:");
					System.out.println("Servicios:");
					System.out.println("1. Transporte");
					System.out.println("2. Hoteles");
					int servicio = scan.nextInt();
					scan.nextLine(); 
					//departamento esta en dept 
					//le pedimos que ingrese la informacion 
					System.out.println("Ingrese la informacion de su servicio (nombre, numero de contacto: ");
					String nombreNegocio = scan.nextLine();
					if (servicio == 1){ 
						p.addDBtransporte(nombreNegocio,dept-1);
					}
					else if (servicio==2){
						p.addDBhoteles(nombreNegocio, dept-1);
					}
					else {
						System.out.println("Ingreso una opcion incorrecta.");
					}
				}
				else {
					System.out.println("El numero ingresado es invalido");
				}
			}
			System.out.println("------------------------------------------------------");
			System.out.println("Desea continuar usando este servicio de llamada?");
			System.out.println("Si su respuesta es 'Si' apachar el 1");
			System.out.println("Si su respuesta es 'No' apachar el 2");
			w = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("------------------------------------------------------");
		System.out.println("Gracias por llamarnos :)");
	}
}