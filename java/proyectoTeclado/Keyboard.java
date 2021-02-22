package proyectoTeclado;
import java.util.InputMismatchException;
import java.util.Scanner;
import static proyectoTeclado.Colores.*;

public  class Keyboard {	
	static Scanner keyboard = new Scanner(System.in);
	static void closekeyboard() {
//		Plantamiento:
//			1ºCerrar teclado.
		 keyboard.close();
	}
//	-----------------Creacion de los limites de números.------------------
	public enum limitOfNumberInRange{INCLUIDO,EXCLUIDO,MININC,MAXINC}
	public enum comparisonNumber{MAYOROIGUAL,MENOROIGUAL,MAYORQUE,MENORQUE}/*En está función el número introducido por el usuario se le asigna a los parametros*/

//	-----------------Funciones de leer un caracter y leer un cadena.------------------
//	Estas funciones le he agregado un parametro para que no haga falta mostrar antes el mensaje que se le va ha pedir sino se introduce en el parametro y ya lo muestra.
	public static char readcharacter(String question) {
//		PLANTAMIENTO: "Se aplica a sus dos funciones de readcharacter"
//			1º Mostrar la pregunta.
//			2º Devolver el resultado.
		char letter;
		boolean exit=false;
//			1º Mostrar la pregunta.
			System.out.println(question);
			letter=readcharacter();
//		2º Devolver el resultado.
		return letter;
		
	}
	public static char readcharacter() {
//		PLANTAMIENTO: "Se aplica a sus dos funciones de readcharacter"
//		1º Comprobar que es un caracter sino repetir paso.
//		2º Devolver el resultado.
		String cadena;
		char letter = 0;
		boolean exit=false;
//		1º Comprobar que es un caracter sino repetir paso.
		do {
			cadena=keyboard.nextLine();
			if (cadena.length()==1) {
				letter=cadena.charAt(0);
				exit=true;
			}
			else {
				System.out.println(FONDO_BLANCO+CELESTE+"No ha introducido un solo caracter"+RESET);
			}	
		}while(!exit);
//		2º Devolver el resultado.
		return letter;
		
	}
	public static String readstring(String question) {
//		PLANTAMIENTO:
//			1º Mostrar la pregunta.
//			2º Pedir la cadena.
//			3º Devolverla.
		String cadena;
//			1º Mostrar la pregunta..
		System.out.println(question);
//			2º Pedir la cadena.
		cadena=readstring();
//			3º Devolverla.		
		return cadena;
		
	}
	public static String readstring() {
//		PLANTAMIENTO:
//			1º Introducir cadena.
//			2º Mostrar cadena.
		String cadena;
//		1º Introducir cadena.
		cadena=keyboard.nextLine();
//		2º Mostrar cadena.
		return cadena;
		
	}
//	-----------------Funciones de leer número enteros.------------------
//	Función leer entero y comprobar que es un numero entero.
	public static int readint() {
//		Plantamiento: "Este plantamiento se le aplicara a todos los metodos de esta seccion"
//			1º Introducir número.
//			2º Comprobar que es un entero.
//				2.1 Si no es un numero entero, repetir proceso.
//			3º Mostrar resultado.
		int number=0;
		boolean option;
		do {
			try {
//				1º Introducir número.
				number = keyboard.nextInt();
				option=true;
//				2º Comprobar que es un entero.
			} catch (InputMismatchException e) {
				System.out.println(FONDO_BLANCO+CELESTE + "No ha introducido un número entero o el número no esta en el rango comprendido, vuelva ha introducir el dato" + RESET);
				option = false;
			} 
			finally {
				keyboard.nextLine();//Limpieza de buffer para que no entre en bucle.
			}
		} while (!option);
//		3º Mostrar resultado.
		return number;
	}
	public static int readint(String question) {
//		Plantamiento: "Este plantamiento se le aplicara a todos los metodos de esta seccion"
//			1º Introducir número.
//			2º Mostrar resultado.
		int number=0;
			System.out.println(question);
//		1º Introducir número.
				number = readint();
//		2º Mostrar resultado.
		return number;
	}
//	Función leer byte y comprobar que es un número entero tipo byte comprendido en el byte.
	public static byte readbyte() {
		byte number=0;
		boolean option;
		do {
			try {
				number = keyboard.nextByte();
				option=true;
			} catch (InputMismatchException e) {
				System.out.println(FONDO_BLANCO+CELESTE + "No ha introducido un número entero o el número no esta en el rango comprendido, vuelva ha introducir el dato" + RESET);
				option = false;
			} 
			finally {
				keyboard.nextLine();//Limpieza de buffer para que no entre en bucle.
			}
		} while (!option);
		return number;
	}
	public static byte readbyte(String question) {
		byte number=0;
			System.out.println(question);
				number = readbyte();
		return number;
	}
//	Función leer long y comprobar que es un número entero long comprendido en el rango de long.
	public static long readlong() {
		long number=0;
		boolean option;
		do {
			try {
				number = keyboard.nextLong();
				option=true;
			} catch (InputMismatchException e) {
				System.out.println(FONDO_BLANCO+CELESTE+ "No ha introducido un número entero o el número no esta en el rango comprendido, vuelva ha introducir el dato"+RESET);
				option = false;
			}
			finally {
				keyboard.nextLine();//Limpieza de buffer para que no entre en bucle.
			}
		} while (!option);
		return number;
	}
	public static long readlong(String question) {
		long number=0;
		System.out.println(question);
		number = readlong();
		return number;
	}
//	Función leer short y comprobar que es un número entero short comprendido en el rango de short.
	public static short readshort() {
		short number=0;
		boolean option;
		do {
			try {
				number = keyboard.nextShort();
				option=true;
			} catch (InputMismatchException e) {
				System.out.println(FONDO_BLANCO+CELESTE+"No ha introducido un número entero o el número no esta en el rango comprendido, vuelva ha introducir el dato"+RESET);
				option = false;
			} 
			finally {
				keyboard.nextLine();//Limpieza de buffer para que no entre en bucle.
			}
		} while (!option);
		return number;
	}
	public static short readshort(String question) {
		short number=0;
		System.out.println(question);
		number = readshort();
		return number;
	}

	//	-----------------Funciones de leer número decimales.------------------
//	Función leer float y comprobar que es un número decimal float comprendido en el rango de float.
	public static float readfloat() {
//		Plantamiento: "Este plantamiento se le aplicara a todos los metodos de esta sección"
//		1º Introducir número entero o decimal.
//		2º Si no has introducido un número repetir proceso.
//		3º Mostrar el resultado.
		float number=0;
		boolean option;
		do {
			try {
//				1º Introducir número entero o decimal.
				number = keyboard.nextFloat();
				option=true;
//				2º Si no has introducido un número repetir proceso.
			} catch (InputMismatchException e) {
				System.out.println(FONDO_BLANCO+CELESTE+"No ha introducido un número decimal o el número no esta en el rango comprendido, vuelva ha introducir el dato"+RESET);
				option = false;
			} 
			finally {
				keyboard.nextLine();//Limpieza de buffer para que no entre en bucle.
			}
		} while (!option);
//		3º Mostrar resultado.
		return number;
	}
	public static float readfloat(String question) {
		float number=0;
		System.out.println(question);
		number = readfloat();
		return number;
	}
//	Función leer double y comprobar que es un número decimal double comprendido en el rango de float.
	public static double readdouble() {
		double number=0;
		boolean option;
		do {
			try {
				number = keyboard.nextDouble();
				option=true;
			} catch (InputMismatchException e) {
				System.out.println(FONDO_BLANCO+CELESTE+"No ha introducido un número decimal o el número no esta en el rango comprendido, vuelva ha introducir el dato"+RESET);
				option = false;
			} 
			finally {
				keyboard.nextLine();//Limpieza de buffer para que no entre en bucle.
			}
		} while (!option);
		return number;
	}
	public static double readdouble(String question) {
		double number=0;
		System.out.println(question);
		number = readdouble();
		return number;
	}
	//	-----------------Funciones booleanas.------------------
//		Funciones Booleanas: Introducir valores booleanos con menú y sin menú.
	public static boolean readboolean(String m1, String m2, String m3) {
//		Plantamiento:
//		1º Introduce los mensajes que vamos ha mostrar en el menu en el siguiente orden:
//			1.1 Pregunta.
//			1.2 Respuesta-1
//			1.2 Respuesta-2
//		2º Elige opcion.
//		3º Devuelve el resultado.
		int option;
		boolean result=true;
//		1º Introduce los mensajes que vamos ha mostrar en el menu en el siguiente orden:
//		1.1 Pregunta.
//		1.2 Respuesta-1
//		1.2 Respuesta-2
		do {
			System.out.printf("%s\n"+"   1-%s\n"+"   2-%s\n",m1,m2,m3);
//			2º Elige opcion.
			System.out.println("Elige una opción");
			option=readint();
//			2.1 Opcion de valor verdadero.
			if (option==1) {
				System.out.printf("Has elegido %s, tu respuesta es correcta\n",m2);
			}
//			2.1 Opcion de valor falsa.
			else if(option==2) {
				System.out.printf("Has elegido %s, tu respuesta es erronea\n",m3);
				result = true;
			}
		}while(option!=1 && option!=2);
//		3º Devuelve el resultado.
	return result;
	}	
	public static boolean readboolean(String m1) {
//		Planteamiento:
//			Introducir la pregunta.
//			2ºMostrar las opciones.
//			3ºElegir una de las opciones.
//				3.1 Si no metes una de las opciones mostradas, repetir paso 2.
//			4ºDevolver la respuesta.
		String option;
		boolean result=true,exit;
		do {
//			Introducir la pregunta.
//			2ºMostrar las opciones.
			System.out.printf("%s\n"+"(S/N)\n",m1);
			option=readstring();
//			3ºElegir una de las opciones.
			if (option.equals("s")||option.equals("S")||option.equals("Si")||option.equals("Sí")||option.equals("SI")||option.equals("SÍ")||option.equals("si")){
				System.out.printf("Has elegido %s\n",option);
				exit=true;
			}
			else if (option.equals("n")||option.equals("N")||option.equals("No")||option.equals("NO")||option.equals("no")) {
				System.out.printf("Has elegido %s\n",option);
				result=false;
				exit=true;
			}
//			3.1 Si no metes una de las opciones mostradas, repetir paso 2.
			else {
				System.out.printf(FONDO_BLANCO+CELESTE+"No has introducido una opcion valida, vuelve ha introducir una de las opciones disponibles.\n"+RESET);
				result=false;
				exit=false;
			}
		}while(!exit);
//		4ºDevolver la respuesta.
	return result;
	}	


	//	-----------------Funciones de Rangos con un rango preestablecido de números enteros------------------
//	Función con Rangos con enteros tipo int."Aquí tenemos el plantamiento de todas estas funciones."
	public static int limits(limitOfNumberInRange limit,int MIN,int MAX) {
//		Plantamiento Limites con rangos:"Esté plantamiento se le aplicará a todas las funciones del tipo de los rangos."
//			1º Pedir dato al usuario.
//				1.1 Se comprueba que el menor no sea mayor al maximo, si no se cumple, abortamos.
//			2º Comprobar que ese número este en el tipo de rango que hemos indicado.
//				2.1 Ambos incluidos.
//				2.2 Ambos excluidos.
//				2.3 El mínimo incluido y el máximo excluido.
//				2.4 El mínimo excluido y el máximo incluido.
//			3º Si alguna  opcion falla, se repetira los pasos.
//			4º Mostrar dato.
		int number=0;
		boolean option;
//		1.1 Se comprueba que el menor no sea mayor al maximo, si no se cumple, abortamos.
		if(MAX<MIN) {
			throw new IllegalArgumentException(FONDO_BLANCO+CELESTE+"Has introducido en el minimo un numero mayor que el mayor introducido"+RESET);
		}
		
//					2º Comprobar que ese número este en el tipo de rango que hemos indicado.
//					2.1 Ambos incluidos.
					if (limit == limitOfNumberInRange.INCLUIDO) {
						do {
//							1º Pedir dato al usuario.
							number = readint();
							option = false;
							if (number < MIN || number > MAX) {
								System.out.println(FONDO_BLANCO+CELESTE+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+ RESET);
							}
						} while (number < MIN || number > MAX);

					}
//					2.3 El mínimo incluido y el máximo excluido.
					else if (limit == limitOfNumberInRange.MININC) {
						do {
//							1º Pedir dato al usuario.
							number = readint();
							option = false;
							if (number < MIN || number >= MAX)
								System.out.println(FONDO_BLANCO+CELESTE
										+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+ RESET);
						} while (number < MIN || number >= MAX);
					}
//					2.2 Ambos excluidos.
					else if (limit == limitOfNumberInRange.EXCLUIDO) {
						do {
//							1º Pedir dato al usuario.
							number = readint();
							option = false;
							if (number <= MIN || number >= MAX)
								System.out.println(FONDO_BLANCO+CELESTE
										+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"
										+ RESET);
						} while (number <= MIN || number >= MAX);
					}
//					2.4 El mínimo excluido y el máximo incluido.
					else if (limit == limitOfNumberInRange.MAXINC) {
						do {
//							1º Pedir dato al usuario.
							number = readint();
							option = false;
							if (number <= MIN || number > MAX)
								System.out.println(VERDE
										+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+ RESET);
						} while (number <= MIN || number > MAX);
					}
		//		4º Mostrar dato.
		return number;
	}
	public static int limits(String question,limitOfNumberInRange limit,int MIN,int MAX) {
		int number=0;
		boolean option;
		
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		System.out.println(question);
					if (limit == limitOfNumberInRange.INCLUIDO) {
						do {
							number = readint();
							option = false;
							if (number < MIN || number > MAX) {
								System.out.println(FONDO_BLANCO+CELESTE
										+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+ RESET);
							}
						} while (number < MIN || number > MAX);

					}
					else if (limit == limitOfNumberInRange.MININC) {
						do {
							number = readint();
							option = false;
							if (number < MIN || number >= MAX)
								System.out.println(FONDO_BLANCO+CELESTE+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+ RESET);
						} while (number < MIN || number >= MAX);
					}
					else if (limit == limitOfNumberInRange.EXCLUIDO) {
						do {
							number = readint();
							option = false;
							if (number <= MIN || number >= MAX)
								System.out.println(FONDO_BLANCO+CELESTE
										+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"
										+ RESET);
						} while (number <= MIN || number >= MAX);
					}
					else if (limit == limitOfNumberInRange.MAXINC) {
						do {
							number = readint();
							option = false;
							if (number <= MIN || number > MAX)
								System.out.println(FONDO_BLANCO+CELESTE
										+ "El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+ RESET);
						} while (number <= MIN || number > MAX);
					}
		return number;
	}
//	Función con Rango con enteros tipo short.
	public static short limits(limitOfNumberInRange limit,short MIN,short MAX) {
		short number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readshort();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readshort();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readshort();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readshort();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
	public static short limits(String question,limitOfNumberInRange limit,short MIN,short MAX) {
		short number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		System.out.println(question);
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readshort();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readshort();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readshort();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readshort();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
//	Función con Rango con enteros tipo byte.
	public static byte limits(limitOfNumberInRange limit,byte MIN,byte MAX) {
		byte number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readbyte();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readbyte();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readbyte();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readbyte();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
	public static byte limits(String question,limitOfNumberInRange limit,byte MIN,byte MAX) {
		byte number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		System.out.println(question);
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readbyte();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readbyte();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readbyte();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readbyte();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
//	Función con Rango con enteros tipo long.
	public static long limits(limitOfNumberInRange limit,long MIN,long MAX) {
		long number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readlong();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readlong();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readlong();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readlong();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
	public static long limits(String question,limitOfNumberInRange limit,long MIN,long MAX) {
		long number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		System.out.println(question);
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readlong();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readlong();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readlong();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readlong();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
//	-----------------Funciones de Rangos con un rango preestablecido de números decimales------------------
//	Función con Rango con números decimales tipo float.
	public static float limits(limitOfNumberInRange limit,float MIN,float MAX) {
		float number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readfloat();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readfloat();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readfloat();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readfloat();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
	public static float limits(String question,limitOfNumberInRange limit,float MIN,float MAX) {
		float number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		System.out.println(question);
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readfloat();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readfloat();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readfloat();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readfloat();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
//	Función con Rango con números decimales tipo double.
	public static double limits(limitOfNumberInRange limit,double MIN,double MAX) {
		double number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readdouble();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readdouble();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readdouble();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readdouble();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}
	public static double limits(String question,limitOfNumberInRange limit,double MIN,double MAX) {
		double number=0;
		boolean option;
		if(MAX<MIN) {
			throw new IllegalArgumentException();
		}
		System.out.println(question);
		if (limit==limitOfNumberInRange.INCLUIDO) {
			do {
				number=readdouble();
				option=false;
				if(number<MIN||number>MAX) {
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
				}
			}while(number<MIN || number>MAX);
				
		}
		else if(limit==limitOfNumberInRange.MININC) {
			do {
				number=readdouble();
				option=false;
				if(number<MIN||number>=MAX)
				System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.EXCLUIDO) {
			do {
				number=readdouble();
				option=false;
				if(number<=MIN || number>=MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>=MAX);
		}
		else if(limit==limitOfNumberInRange.MAXINC) {
			do {
				number=readdouble();
				option=false;
				if(number<=MIN || number>MAX)
					System.out.println(FONDO_BLANCO+CELESTE+"El valor introducido no está comprendido en el rango solicitado, vuelva ha introducir los datos"+RESET);
			}while(number<=MIN || number>MAX);
		}
		return number;
	}


	//-----------------Funciones de comparacion entre la peticion del usuario y número establecido------------------
	public static int comparison(comparisonNumber comparison, int number) {
//		Plantamiento de comparación:"Esté plantamiento se le aplicará a todas las funciones del tipo de comparación."
//		1º Pedir número.	
//		2º Comprobar una de las siguientes opciones en funcion de el número introducido.
//			2.1 Mayor o igual que el valor
//			2.2 Menor o igual que el valor
//			2.3 Mayor que el valor
//			2.4 Menor que el valor
//		3º Si alguna de las opciones falla, se repetira el proceso fallado.
//		4º Mostrar dato.
		boolean option;
		int comparator = 0;
//		2º Comprobar una de las siguientes opciones en funcion de el número introducido.
			if(comparison == comparisonNumber.MAYOROIGUAL) {
//				2.1 Mayor o igual que el valor
				do {
//					1º Pedir número.
					comparator=readint();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
//				2.2 Menor o igual que el valor
				do {
//					1º Pedir número.
					comparator=readint();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
//				2.3 Mayor que el valor
				do {
//					1º Pedir número.
					comparator=readint();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
//				2.4 Menor que el valor
				do {
//					1º Pedir número.
					comparator=readint();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
//			3º Si alguna de las opciones falla, se repetira el proceso fallado.
//			4º Mostrar dato.
		return comparator;
	}
	public static int comparison(String question,comparisonNumber comparison, int number) {
		boolean option;
		int comparator = 0;
		System.out.println(question);
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readint();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readint();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readint();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readint();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static short comparison(comparisonNumber comparison, short number) {
		boolean option;
		short comparator = 0;
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readshort();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readshort();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readshort();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readshort();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static short comparison(String question,comparisonNumber comparison, short number) {
		boolean option;
		short comparator = 0;
		System.out.println(question);
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readshort();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readshort();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readshort();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readshort();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static byte comparison(comparisonNumber comparison, byte number) {
		boolean option;
		byte comparator = 0;
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static byte comparison(String question,comparisonNumber comparison, byte number) {
		boolean option;
		byte comparator = 0;
		System.out.println(question);
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readbyte();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static long comparison(comparisonNumber comparison, long number) {
		boolean option;
		long comparator = 0;
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readlong();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readlong();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readlong();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readlong();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static long comparison(String question,comparisonNumber comparison, long number) {
		boolean option;
		long comparator = 0;
		System.out.println(question);
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readlong();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readlong();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readlong();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readlong();
					option = true;
					if (comparator <= number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator > number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static float comparison(comparisonNumber comparison, float number) {
		boolean option;
		float comparator = 0;
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static float comparison(String question,comparisonNumber comparison, float number) {
		boolean option;
		float comparator = 0;
		System.out.println(question);
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readfloat();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static double comparison(comparisonNumber comparison, double number) {
		boolean option;
		double comparator = 0;
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
	public static double comparison(String question,comparisonNumber comparison, double number) {
		boolean option;
		double comparator = 0;
		System.out.println(question);
			if(comparison == comparisonNumber.MAYOROIGUAL) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator >= number) {
						System.out.println("Su número es mayor o igual");
					} else if (comparator < number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENOROIGUAL) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator <= number) {
						System.out.println("Su número es menor o igual");
					} else if (comparator > number) {
						System.out.println(FONDO_BLANCO+CELESTE+"Error: Su número no es menor o igual, vuelva ha introducir el número"+RESET);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MAYORQUE) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator > number) {
						System.out.printf("Su número es mayor que %d\n",number);
					} else if (comparator <= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es mayor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}else if(comparison == comparisonNumber.MENORQUE) {
				do {
					comparator=readdouble();
					option = true;
					if (comparator < number) {
						System.out.printf("Su número es menor que %d\n",number);
					} else if (comparator >= number) {
						System.out.printf(FONDO_BLANCO+CELESTE+"Error: Su número no es menor que %d, vuelva ha introducir el número\n"+RESET,number);
						option = false;
					}
				}while(!option);
			}
		return comparator;
	}
}


	
