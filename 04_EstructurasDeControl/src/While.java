import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero hasta el que contar:");
		int max = scan.nextInt();
		
		while(contador <= max){
			
			System.out.println("Contador: " + contador);
			contador = contador + 1;
			
		}
	}

}
