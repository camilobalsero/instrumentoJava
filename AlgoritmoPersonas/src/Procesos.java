import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	HashMap<String, ArrayList<String>> mapPersonas = new HashMap<String, ArrayList<String>>();
	ArrayList<String> listaUs = new ArrayList<String>();
	public void ingreso(){
		int edad = 0;
		String profesion = null;
		String nombre = null;
		String documento = null;
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas que desea ingresar"));
		for (int i = 0; i < cantidad; i++) {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre");
			documento = JOptionPane.showInputDialog("Ingrese su numero de documento");
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
			profesion = JOptionPane.showInputDialog("Ingrese su profesion");
			
			validarEdad(edad);
			mapPersonas.put(documento, listaUs);
			listaUs.add(documento);
			listaUs.add(profesion);
			listaUs.add(nombre);
			listaUs.add(edad+"");
		}
		System.out.println("las personas ingresadas fueron: " + cantidad);
		System.out.println("Los mayores de edad son: " + mayor);
		System.out.println("Las personas menores de edad son: " + menor);
	}
	int mayor = 0;
	int menor = 0;
	public void validarEdad(int edad) {
		if(edad >= 18) {
			mayor++;
		}else {
			menor++;
		}
		
	}

}
	
