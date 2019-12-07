import java.util.Scanner;

public class AgendaNombre {

	static Scanner scan;
	static String[] nombres;
	static String nombre;

	public static void main(String[] args) {

		scan = new Scanner(System.in);

		System.out.println("Ingrese el tamaño de la Agenda: ");
		int tam = scan.nextInt();

		llenarVector(tam);		
		
		//mostrarVector();

		System.out.println("\n" + "Ingrese el nombre a buscar en la lista: ");
		String name = scan.next();

		buscarNombre(name);
	}

	public static void llenarVector(int tamVector) {

		nombres = new String[tamVector];
		
		System.out.println("\n" + "El tamaño de la Agenda es: " + nombres.length + "\n");
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(i + 1 + "-" + "Ingrese nombre:");
			nombre = scan.next();
			if (nombreRepetido(nombre) == false) {
				nombres[i] = nombre;
			}
		}

	}

	/*public static void mostrarVector() {
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("\n" +"Nombres " + nombres[i]);
		}
	}*/

	public static boolean nombreRepetido(String nombre) {
		
		boolean nombreRepetido = false;
		
		for (int i = 0; i < nombres.length; i++) {
			if (nombre.equals(nombres[i])) {				
				System.out.println("El nombre "+nombre+" ya esta en la agenda ingrese otro nombre:");				
				nombre = scan.next();
				nombres[i] = nombre;				
				nombreRepetido = true;
			}
			if (nombres[i] != nombre) {
				nombreRepetido = false;
			}
		}

		return nombreRepetido;

	}

	public static String buscarNombre(String nomb) {

		int pos = 0;
		boolean encontrado = false;

		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i].equalsIgnoreCase(nomb)) {
				pos = i;
				System.out.println("\n" + "El nombre " + nomb + " existe en la posicion " + pos);
				encontrado = true;
			}
		}
		if (encontrado == false) {
			
			System.out.println("\n" + "El nombre " + nomb + " no existe en la agenda");			

		}
		return nomb;

	}

}
