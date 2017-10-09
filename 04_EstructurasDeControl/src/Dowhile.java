import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num_acertar = (int)(Math.random()*10);
		int num_usuario;
		do{
			System.out.println("Introduce un numero 0-9");
			Scanner scan = new Scanner(System.in);
			num_usuario = scan.nextInt();
			
		}while(num_usuario != num_acertar);
		
		System.out.println("Numero acertado");
	}/* TERMINA CODIGO */

}
