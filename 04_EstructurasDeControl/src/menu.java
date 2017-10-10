import java.util.Scanner;

public class menu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do{
			System.out.println("Opciones disponibles:\n"+"1-Grabar CD audio\n"+"2-Grabar CD datos\n"+"3-Guardar CD en disco \n"+"4-Salir");
			opcion = scan.nextInt();
			
			switch (opcion){
			case 1: 
				System.out.println("Grabando CD audio........");
				Thread.sleep(1000);
				System.out.println("CD GRABADO");
				Thread.sleep(1000);
				break;
			case 2: 
				System.out.println("Grabando CD datos........");
				System.out.println("CD GRABADO");
				break;
			case 3: 
				System.out.println("Guardando CD en disco");
				System.out.println("CD GUARDADO");
				break;
			case 4: 
				System.out.println("Cerrando sistema");
				break;
			default: 
				System.out.println("Opcion incorrecta");
			
			}
			
		}while(opcion != 4);
		
		System.out.println("Fin del programa");
	}/* TERMINA CODIGO */

}
