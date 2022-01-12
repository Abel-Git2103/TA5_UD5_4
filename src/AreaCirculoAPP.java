import java.util.Scanner;

public class AreaCirculoAPP {

	public static void main(String[] args) {
		
		final double PI = Math.PI; 
		String radio = "";
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Indica el valor del radio: ");
		radio = consola.nextLine();
		double radioDouble = Double.parseDouble(radio);
		System.out.println("El área del circulo es = " + PI * Math.pow(radioDouble, 2));
		
	}
}
