import java.util.Scanner;

public class Contar_vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un texto para contar vocales:");
		String texto = scan.nextLine();
		int vocal = 0;
		
		for(int i= 0; i < texto.length();i++){
			if(texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
				vocal ++;
			}
		}
				
			
			System.out.println("Hay " + vocal + " vocales");
		
	}//TERMINA CODIGO

}
