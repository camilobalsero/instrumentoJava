import javax.swing.JOptionPane;

public class Procesos {
	ModeloDatos guardarDatos= new ModeloDatos();
	
	public void ingresar(){
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato"));
		double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));
	}
	
	public void operacion(){
		
	}
}
