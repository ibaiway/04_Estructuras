import java.util.Scanner;

public class SumaAcumulada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SE INTRODUCEN 10 NUMEROS Y EL PROGRAMA LOS SUMA TODOS Y DICE EL RESULTADO

		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		for(int i =0; i < 10;i++){
			System.out.println("Introduzca un numero");
			numero = numero +scan.nextInt();
			
		}
		System.out.println("La suma total es: " + numero);
	}//TERMINA CODIGO

}
