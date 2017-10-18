import java.util.Scanner;

public class DarleLaVuelta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Escribe una frase/palabra para darle la vuelta");
		String frase = scan.nextLine();
		int i;
		String vuelta= "";
		
		for(i=frase.length()-1;i>=0;i--){
			vuelta = vuelta + frase.charAt(i);
		}System.out.println(vuelta);

			
			
	}

}
