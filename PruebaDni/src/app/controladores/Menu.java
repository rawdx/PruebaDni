package app.controladores;

import java.util.ArrayList;

import app.entidades.dni;
import app.servicios.ImplDni;
import app.servicios.InterfazDni;

public class Menu {

	public static void main(String[] args) {
		InterfazDni miDni = new ImplDni();
		ArrayList<dni> listaDni = new ArrayList<>();
		
		listaDni.add(miDni.calcularDni());
	}

}
