import java.util.Scanner;

public class Contador_caracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce texto:");
		String texto = scan.nextLine();
		System.out.println("Introduce caracter a contar:");
		String caracter = scan.nextLine();
		int veces = 0;
		char caracteres = caracter.charAt(0);
		
		
		for(int i = 0; i < texto.length(); i++ ){
			if(texto.charAt(i) == caracteres){
			veces++;	
			}
		} //TERMINA FOR
	
		
		System.out.println("################");
		System.out.println("El texto \"" + texto + "\" tiene " + veces + " "+ caracter);
		
		
	} //TERMINA CODIGO

}
