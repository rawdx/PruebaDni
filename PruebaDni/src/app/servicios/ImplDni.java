package app.servicios;

import java.util.Scanner;

import app.entidades.dni;

public class ImplDni implements InterfazDni {

	@Override
	public dni calcularDni() {
		
		dni miDni = new dni();
		char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el número del DNI: ");
		int numDni = sc.nextInt();
		System.out.print("Introduce la letra del DNI: ");
		char letraDni = sc.next().charAt(0);

		while (numDni < 0 || numDni > 99999999) {
			System.out.print("[Error] El numero " + numDni + " no es válido, introduzca otro número: ");
			numDni = sc.nextInt();
		}
		
		char letraDniReal = letrasDni[numDni%23];
		
		while(letraDni != letraDniReal) {
			System.out.print("[Error] La letra " + letraDni + " no es válida, introduzca otra letra: ");
			letraDni = sc.next().charAt(0);
		}
		System.out.println("El numero y la letra son correctos.");
		
		miDni.setNumDni(numDni);
		miDni.setLetraDni(letraDni);
		System.out.println(miDni.toString());
		
		sc.close();
		return miDni;
	}

}
