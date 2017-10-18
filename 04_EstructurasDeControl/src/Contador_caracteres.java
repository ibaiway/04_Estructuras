import java.util.Scanner;

public class Contador_caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce texto:");
		String texto = scan.nextLine();
		System.out.println("Introduce caracter a contar:");
		String caracter = scan.nextLine();
		//char caracteres = texto.charAt(0);
		int veces = 0;
		//char caracteres ; texto.toCharArray();
		
		for (int i = texto.indexOf(caracter); i != -1;
				i = texto.indexOf(caracter, i + caracter.length())){
				veces ++;
		}		
	
		
		System.out.println("################");
		System.out.println("El texto \"" + texto + "\" tiene " + veces + " "+ caracter);
		
		
	} //TERMINA CODIGO

}
