package proyectoTeclado;
import static proyectoTeclado.Keyboard.*;
import static proyectoTeclado.Colores.*;
public class MenuPruebas {

	public static void main(String[] args) {
		int option,exit=0,min,max;
		do {//Repetir Menu de pruebas mientras no es una de las opciones puestas.
			System.out.printf(AMARILLO+"-MENU DE PRUEBAS-\n"+RESET+CELESTE+ "1-Leer Entero\n2-Leer Decimal\n3-Leer Booleano\n4-Leer Texto\n5-Leer Rango\n6-Leer Limite\n7-Salir\n"+RESET);
			option = readint();
			if (option < 1 || option > 7) {
				System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
			}
			switch (option) {
			
			case 1:
				do {
				System.out.printf(AMARILLO+"\t*MENU DE ENTEROS*\n"+RESET+CELESTE+"Elige opcion:\n1-Con mensaje\n2-Sin mensaje\n3-Salir\n"+RESET);
				option = readint();
				if(option<1||option>3) {
					System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
				}
				switch(option) {
				case 1:
					do {//Repetir Menu de leer tipo entero mientras no es una de las opciones puestas.
						System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-LeerByte\n2-LeerShort\n3-LeerInt\n4-LeerLong\n5-Salir\n"+RESET);
						option = readint();
						if(option<1||option>5) {
							System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
						}
						switch (option) {
						case 1:
							readbyte("Introduce un número comprendido en el rango de byte (-127 a 128)");
							break;
						case 2:
							readshort("Introduce un número comprendido en el rango de short (-32.768 a 32.767)");
							break;
						case 3:
							readint("Introduce un número comprendido en el rango del int (-2.147.483.648 a 2.147.483.647)");
							break;
						case 4:
							readlong("Introduce un número comprendido en el rango del long (-9 · 10^18 a 9 · 10^18)");
						case 5:
							exit=1;
							break;
						}
					} while (exit!=1);
					exit=0;//Limpieza del valor para que se salga del todo.
					break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
				case 2:
					do {//Repetir Menu de leer tipo entero mientras no es una de las opciones puestas.
						System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-LeerByte\n2-LeerShort\n3-LeerInt\n4-LeerLong\n5-Salir\n"+RESET);
						option = readint();
						if(option<1||option>5) {
							System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
						}
						switch (option) {
						case 1:
							System.out.println("Introduce un número comprendido en el rango de byte (-128 a 127)");
							readbyte();
							break;
						case 2:
							System.out.println("Introduce un número comprendido en el rango de short (-32.768 a 32.767)");
							readshort();
							break;
						case 3:
							System.out.println("Introduce un número comprendido en el rango del int (-2.147.483.648 a 2.147.483.647)");
							readint();
							break;
						case 4:
							System.out.println("Introduce un número comprendido en el rango del long (-9 · 10^18^ a 9 · 10^18^)");
							readlong();
						case 5:
							exit=1;
							break;
						}
					} while (exit!=1);
					exit=0;//Limpieza del valor para que se salga del todo.
					break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
				case 3:
					exit=1;
					break;
				}
			}while(exit!=1);
				exit=0;//Limpieza del valor para que se salga del todo.
				break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
			case 2://HACER MENU PRINCIPAL: EL DE CON MENSAJE O SIN MENSAJE
				do {
					System.out.printf(AMARILLO+"\t*MENU DE DECIMALES*\n"+RESET+CELESTE+"Elige opcion:\n1-Con mensaje\n2-Sin mensaje\n3-Salir\n"+RESET);
					option = readint();
					if (option < 1 || option > 3) {
						System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
					}
					switch (option) {
					case 1:
						do {//Repetir Menu de leer tipo decimal mientras no es una de las opciones puestas.
							System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-LeerFloat\n2-LeerDouble\n3-Salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 3) {
								System.out.println(
										"No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1:
								readfloat(
										"Introduce un número comprendido en el rango de float (-3,4*10^38 a 3,4*10^38)");
								break;
							case 2:
								readdouble(
										"Introduce un número comprendido en el rango de float (-1,79*10^308 a 1,79*10^308)");
								break;
							case 3:
								exit = 1;
								break;
							}
						} while (exit != 1);
						exit = 0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 2:
						do {//Repetir Menu de leer tipo decimal mientras no es una de las opciones puestas.
							System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-LeerFloat\n2-LeerDouble\n3-Salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 3) {
								System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1:
								System.out.println("Introduce un número comprendido en el rango de float (-3,4*10^38 a 3,4*10^38)");
								readfloat();
								break;
							case 2:
								System.out.println("Introduce un número comprendido en el rango de float (-1,79*10^308 a 1,79*10^308)");
								readdouble();
								break;
							case 3:
								exit = 1;
								break;
							}
						} while (exit != 1);
						exit = 0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 3:
						exit=1;
						break;
					}
				} while (exit!=1);
				exit=0;//Limpieza del valor para que se salga del todo.
				break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
			case 3:
				do {
					System.out.printf(AMARILLO+"\t*MENU BOOLEANO*\n"+RESET+CELESTE+"Elige opcion:\n1-Con Menú\n2-Con Respuesta (S/N) o (Si/No)\n3-Salir\n"+RESET);
					option = readint();
					if (option < 1 || option > 3) {
						System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
					}
					switch (option) {
					case 1:
						System.out.println("He visto un coche que es mas rápido que el viento, ¡era un Lamborgini!");
						readboolean("¿Que coche es?","Lamborgini","Ferrari");
						break;
					case 2:
						readboolean("¿Te gusta la tortilla?");
						break;
					case 3:
						exit=1;
						break;
					}
				} while (exit!=1);
				exit=0;//Limpieza del valor para que se salga del todo.
				break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
			case 4:
				do {
					System.out.printf(AMARILLO+"\t*MENU DE TEXTOS*\n"+RESET+CELESTE+"Elige opcion:\n1-Con mensaje\n2-Sin mensaje\n3-Salir\n"+RESET);
					option = readint();
					if (option < 1 || option > 3) {
						System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
					}
					switch (option) {
					case 1:
						do {//Repetir Menu de leer un tipo de texto mientras no es una de las opciones puestas.
							System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-LeerCaracter\n2-LeerCadena\n3-Salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 3) {
								System.out.println(
										"No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1:
								readcharacter("Introduce una caracter solo, puede ser letra o un numero o un signo");
								break;
							case 2:
								readstring("Introduce una cadena cualquiera");
								break;
							case 3:
								exit = 1;
								break;
							}
						} while (exit != 1);
						exit = 0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 2:
						do {//Repetir Menu de leer un tipo de texto mientras no es una de las opciones puestas.
							System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-LeerCaracter\n2-LeerCadena\n3-Salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 3) {
								System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1:
								System.out.println("Introduce una caracter solo, puede ser letra o un numero o un signo");
								readcharacter();
								break;
							case 2:
								System.out.println("Introduce una cadena cualquiera");
								readstring();
								break;
							case 3:
								exit = 1;
								break;
							}
						} while (exit != 1);
						exit = 0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 3:
						exit=1;
						break;
					}
				} while (exit!=1);
				exit=0;//Limpieza del valor para que se salga del todo.
				break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
			case 5:
				do {
					System.out.printf(AMARILLO+"\t*MENU DE RANGOS*\n"+RESET+CELESTE+"Elige opcion:\n1-Con mensaje\n2-Sin mensaje\n3-Salir\n"+RESET);
					option = readint();
					if (option < 1 || option > 3) {
						System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
					}
					switch(option) {
					case 1:
						do {
							System.out.printf(AMARILLO+"\nElige con que tipos haremos las funciones de rango:\n"+RESET+CELESTE+"1-int\n2-short\n3-byte\n4-long\n5-float\n6-double\n7-Comprobar validacion del minimo y maximo\n8-salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 8) {
								System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1://ESTAMOS AQUI//
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.EXCLUIDO,5,10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.INCLUIDO,5,10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MAXINC,5,10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MININC,5,10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 2:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.EXCLUIDO,(short)5,(short)10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.INCLUIDO,(short)5,(short)10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MAXINC,(short)5,(short)10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MININC,(short)5,(short)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 3:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.EXCLUIDO,(byte)5,(byte)10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.INCLUIDO,(byte)5,(byte)10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MAXINC,(byte)5,(byte)10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MININC,(byte)5,(byte)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 4:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.EXCLUIDO,(long)5,(long)10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.INCLUIDO,(long)5,(long)10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MAXINC,(long)5,(long)10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MININC,(long)5,(long)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 5:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.EXCLUIDO,(float)5,(float)10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.INCLUIDO,(float)5,(float)10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MAXINC,(float)5,(float)10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MININC,(float)5,(float)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 6:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.EXCLUIDO,(double)5,(double)10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.INCLUIDO,(double)5,(double)10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MAXINC,(double)5,(double)10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:\n",limitOfNumberInRange.MININC,(double)5,(double)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 7:
								System.out.println(AMARILLO+"Con este metodo sera para comprobar que el minimo sea menor que el mayor"+RESET);
								min=readint("Introduce el minimo");
								max=readint("Introduce el maximo");
								System.out.printf("Usaremos la funcion rango conn minimo y maximo incluidos, si el minimo introducido es mayor\n que el maximo introducido tiene que saltarnos un error\n si lo has introducido bien, hacemos la funcion y salimos.\n");
								limits("Introduce el numero:",limitOfNumberInRange.EXCLUIDO,min,max);
								break;
							case 8:
								exit = 1;
								break;
							}
						} while (exit!=1);
						exit=0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 2:
						do {
							System.out.printf(AMARILLO+"\nElige con que tipos haremos las funciones de rango:\n"+RESET+CELESTE+"1-int\n2-short\n3-byte\n4-long\n5-float\n6-double\n7-Comprobar validacion del minimo y maximo\n8-salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 8) {
								System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1://ESTAMOS AQUI//
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:",limitOfNumberInRange.EXCLUIDO,5,10);
									break;
								case 2:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:",limitOfNumberInRange.INCLUIDO,5,10);
									break;
								case 3:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:",limitOfNumberInRange.MAXINC,5,10);
									break;
								case 4:
									limits("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:",limitOfNumberInRange.MININC,5,10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 2:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\\n Inserte su numero:");
									limits(limitOfNumberInRange.EXCLUIDO,(short)5,(short)10);
									break;
								case 2:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.INCLUIDO,(short)5,(short)10);
									break;
								case 3:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MAXINC,(short)5,(short)10);
									break;
								case 4:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MININC,(short)5,(short)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 3:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.EXCLUIDO,(byte)5,(byte)10);
									break;
								case 2:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.INCLUIDO,(byte)5,(byte)10);
									break;
								case 3:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MAXINC,(byte)5,(byte)10);
									break;
								case 4:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MININC,(byte)5,(byte)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 4:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.EXCLUIDO,(long)5,(long)10);
									break;
								case 2:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.INCLUIDO,(long)5,(long)10);
									break;
								case 3:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MAXINC,(long)5,(long)10);
									break;
								case 4:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MININC,(long)5,(long)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 5:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.EXCLUIDO,(float)5,(float)10);
									break;
								case 2:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.INCLUIDO,(float)5,(float)10);
									break;
								case 3:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MAXINC,(float)5,(float)10);
									break;
								case 4:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MININC,(float)5,(float)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 6:
								do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Minimo y Maximo exlucidos\n2-Minimo y Maximo incluidos\n3-Minimo incluido y Maximo excluido\n4-Minimo excluido y Maximo incluido\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos a probar.
								case 1:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.EXCLUIDO,(double)5,(double)10);
									break;
								case 2:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.INCLUIDO,(double)5,(double)10);
									break;
								case 3:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MAXINC,(double)5,(double)10);
									break;
								case 4:
									System.out.printf("El rango de todos los casos se comprenderan entre el minimo de 5 y el maximo de 10\n Inserte su numero:");
									limits(limitOfNumberInRange.MININC,(double)5,(double)10);
									break;
								case 5:
									exit=1;
									break;
								}
							} while (exit!=1);
							exit=0;//Limpieza del valor para que se salga del todo.
							break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 7:
								System.out.println("Con este metodo sera para comprobar que el minimo sea menor que el mayor");
								min=readint("Introduce el minimo");
								max=readint("Introduce el maximo");
								System.out.printf("Usaremos la funcion rango conn minimo y maximo incluidos, si el minimo introducido es mayor\n que el maximo introducido tiene que saltarnos un error\n si lo has introducido bien, hacemos la funcion y salimos.\n");
								limits("Introduce el numero:",limitOfNumberInRange.EXCLUIDO,min,max);
								break;
							case 8:
								exit = 1;
								break;
							}
						} while (exit!=1);
						exit=0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 3:
						exit=1;
						break;
					}

				} while (exit!=1);
				exit=0;//Limpieza del valor para que se salga del todo.
				break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
				
			case 6:
				do {
					System.out.printf(AMARILLO+"\t*MENU DE COMPARACION*\n"+RESET+CELESTE+"Elige opcion:\n1-Con mensaje\n2-Sin mensaje\n3-Salir\n"+RESET);
					option = readint();
					if (option < 1 || option > 3) {
						System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
					} 
					switch(option) {
					case 1:
						do {
							System.out.printf(AMARILLO+"\nElige tipo:\n"+RESET+CELESTE+"1-int\n2-short\n3-byte\n4-long\n5-float\n6-double\n7-salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 7) {
								System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1:
							do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
								case 1:
									comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYOROIGUAL,5);
									break;
								case 2:
									comparison("Su número tiene que ser menor o igual a 5",comparisonNumber.MENOROIGUAL,5);
									break;
								case 3:
									comparison("Su número tiene que ser mayor a 5",comparisonNumber.MAYORQUE,5);
									break;
								case 4:
									comparison("Su número tiene que ser menor a 5",comparisonNumber.MENORQUE,5);
									break;
								case 5:
									exit=1;
									break;
								}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 2:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYOROIGUAL,(short)5);
										break;
									case 2:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENOROIGUAL,(short)5);
										break;
									case 3:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYORQUE,(short)5);
										break;
									case 4:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENORQUE,(short)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 3:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYOROIGUAL,(byte)5);
										break;
									case 2:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENOROIGUAL,(byte)5);
										break;
									case 3:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYORQUE,(byte)5);
										break;
									case 4:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENORQUE,(byte)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 4:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYOROIGUAL,(long)5);
										break;
									case 2:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENOROIGUAL,(long)5);
										break;
									case 3:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYORQUE,(long)5);
										break;
									case 4:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENORQUE,(long)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 5:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYOROIGUAL,(float)5);
										break;
									case 2:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENOROIGUAL,(float)5);
										break;
									case 3:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYORQUE,(float)5);
										break;
									case 4:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENORQUE,(float)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 6:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYOROIGUAL,(double)5);
										break;
									case 2:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENOROIGUAL,(double)5);
										break;
									case 3:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MAYORQUE,(double)5);
										break;
									case 4:
										comparison("Su número tiene que ser mayor o igual a 5",comparisonNumber.MENORQUE,(double)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 7:
								exit=1;
								break;
							}
						} while (exit!=1);
						exit=0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 2:
						do {
							System.out.printf(AMARILLO+"\nElige tipo:\n"+RESET+CELESTE+"1-int\n2-short\n3-byte\n4-long\n5-float\n6-double\n7-salir\n"+RESET);
							option = readint();
							if (option < 1 || option > 7) {
								System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
							}
							switch (option) {
							case 1:
							do {
								System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
								option = readint();
								if (option < 1 || option > 5) {
									System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
								}
								switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
								case 1:
									System.out.println("Su número tiene que ser mayor o igual a 5");
									comparison(comparisonNumber.MAYOROIGUAL,5);
									break;
								case 2:
									System.out.println("Su número tiene que ser mayor o igual a 5");
									comparison(comparisonNumber.MENOROIGUAL,5);
									break;
								case 3:
									System.out.println("Su número tiene que ser mayor o igual a 5");
									comparison(comparisonNumber.MAYORQUE,5);
									break;
								case 4:
									System.out.println("Su número tiene que ser mayor o igual a 5");
									comparison(comparisonNumber.MENORQUE,5);
									break;
								case 5:
									exit=1;
									break;
								}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 2:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										System.out.println("Su número tiene que ser mayor o igual a 5");
										comparison(comparisonNumber.MAYOROIGUAL,(short)5);
										break;
									case 2:
										System.out.println("Su número tiene que ser menor o igual a 5");
										comparison(comparisonNumber.MENOROIGUAL,(short)5);
										break;
									case 3:
										System.out.println("Su número tiene que ser mayor a 5");
										comparison(comparisonNumber.MAYORQUE,(short)5);
										break;
									case 4:
										System.out.println("Su número tiene que ser menor a 5");
										comparison(comparisonNumber.MENORQUE,(short)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 3:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										System.out.println("Su número tiene que ser mayor o igual a 5");
										comparison(comparisonNumber.MAYOROIGUAL,(byte)5);
										break;
									case 2:
										System.out.println("Su número tiene que ser menor o igual a 5");
										comparison(comparisonNumber.MENOROIGUAL,(byte)5);
										break;
									case 3:
										System.out.println("Su número tiene que ser mayor a 5");
										comparison(comparisonNumber.MAYORQUE,(byte)5);
										break;
									case 4:
										System.out.println("Su número tiene que ser menor a 5");
										comparison(comparisonNumber.MENORQUE,(byte)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 4:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										System.out.println("Su número tiene que ser mayor o igual a 5");
										comparison(comparisonNumber.MAYOROIGUAL,(long)5);
										break;
									case 2:
										System.out.println("Su número tiene que ser menor o igual a 5");
										comparison(comparisonNumber.MENOROIGUAL,(long)5);
										break;
									case 3:
										System.out.println("Su número tiene que ser mayor a 5");
										comparison(comparisonNumber.MAYORQUE,(long)5);
										break;
									case 4:
										System.out.println("Su número tiene que ser menor a 5");
										comparison(comparisonNumber.MENORQUE,(long)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 5:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										System.out.println("Su número tiene que ser mayor o igual a 5");
										comparison(comparisonNumber.MAYOROIGUAL,(float)5);
										break;
									case 2:
										System.out.println("Su número tiene que ser menor o igual a 5");
										comparison(comparisonNumber.MENOROIGUAL,(float)5);
										break;
									case 3:
										System.out.println("Su número tiene que ser mayor a 5");
										comparison(comparisonNumber.MAYORQUE,(float)5);
										break;
									case 4:
										System.out.println("Su número tiene que ser menor a 5");
										comparison(comparisonNumber.MENORQUE,(float)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 6:
								do {
									System.out.println(AMARILLO+"\t*OPCIONES*\n"+RESET+CELESTE+"Elige opcion:\n1-Mayor o igual\n2-Menor o igual\n3-Mayor que\n4-Menor que\n5-Salir"+RESET);
									option = readint();
									if (option < 1 || option > 5) {
										System.out.println("No has introducido una de las opciones, vuelva ha introducir una opcion");
									}
									switch(option) {//Para probar con los demas tipos hacer un casting para probar con cada uno cuando vayamos ha probar.
									case 1:
										System.out.println("Su número tiene que ser mayor o igual a 5");
										comparison(comparisonNumber.MAYOROIGUAL,(double)5);
										break;
									case 2:
										System.out.println("Su número tiene que ser menor o igual a 5");
										comparison(comparisonNumber.MENOROIGUAL,(double)5);
										break;
									case 3:
										System.out.println("Su número tiene que ser mayor a 5");
										comparison(comparisonNumber.MAYORQUE,(double)5);
										break;
									case 4:
										System.out.println("Su número tiene que ser menor a 5");
										comparison(comparisonNumber.MENORQUE,(double)5);
										break;
									case 5:
										exit=1;
										break;
									}
								} while (exit!=1);
								exit=0;//Limpieza del valor para que se salga del todo.
								break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
							case 7:
								exit=1;
								break;
							}
						} while (exit!=1);
						exit=0;//Limpieza del valor para que se salga del todo.
						break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
					case 3:
						exit=1;
						break;
					}
				} while (exit!=1);
				exit=0;//Limpieza del valor para que se salga del todo.
				break;//NO OLVIDARSE DEL BREAK DESPUES DE CADA WHILE!!
			case 7:
				exit=1;
				break;
			}
		} while (exit!=1);//con el case 7 salimos del menu principal y finalizamos el programa.
	closekeyboard();
	}
}
