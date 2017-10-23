import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
int numero = 0;
		
		for(int i =0; i < 10;i++){
			System.out.println("Introduzca un numero");
			numero = numero +scan.nextInt();
			
		}
		System.out.println("La media es : " + (numero/10));
	}//TERMINA CODIGO

}
