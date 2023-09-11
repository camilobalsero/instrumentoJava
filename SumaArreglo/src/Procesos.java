import javax.swing.JOptionPane;

public class Procesos {
	
	int arreglo1[] = new int[5];
    int arreglo2[] = new int[5];
	public int[] sumaArreglos(int[] arreglo1, int[] arreglo2) {
        int resultado[] = new int[arreglo1.length];

        for (int i = 0; i < arreglo1.length; i++) {
            resultado[i] = arreglo1[i] + arreglo2[i];
        }
        return resultado;
    }
	
	public void ingresoImprimir() {
		
	    for (int i = 0; i < arreglo1.length; i++) {
	        arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
	    }
	    for (int i = 0; i < arreglo2.length; i++) {
	        arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero para la suma en la posicion " + i));
	    }
	    int sumaArreglos[] = sumaArreglos(arreglo1, arreglo2);
	    System.out.print("La suma de los arreglos es: ");
	    for (int numero : sumaArreglos) {
	        System.out.print(numero + " ");
	    }
	    System.out.println("\n");
	    for (int numero : arreglo1) {
            System.out.print(numero + " ");
        }
	    System.out.println("Arreglo 1");

        for (int numero : arreglo2) {
            System.out.print(numero + " ");
        }
        System.out.println("Arreglo 2");
	}
	
	
        
    
}
