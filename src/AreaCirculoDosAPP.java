import javax.swing.JOptionPane;

public class AreaCirculoDosAPP {

	public static void main(String[] args) {
		
		final double PI = Math.PI; 
		
		String valorRadio = JOptionPane.showInputDialog("Introduce el valor del radio: ");
		double radio = Double.parseDouble(valorRadio);
		JOptionPane.showMessageDialog(null, "El �rea del circulo es = " + PI * Math.pow(radio, 2));
		
	}
}
