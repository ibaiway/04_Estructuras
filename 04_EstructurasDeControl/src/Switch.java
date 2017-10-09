import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Opciones disponibles:\n"+"A-Grabar CD audio\n"+"B-Grabar CD datos\n"+"C-Guardar CD en disco D\n"+"D-Copiar CD a CD");
		
		Scanner scan = new Scanner(System.in);
		String opcion = scan.nextLine();
		
		
		switch (opcion.toUpperCase()){
		case "A": 
			System.out.println("Has elegido la primera opcion");
			break;
		case "B": 
			System.out.println("Has elegido la segunda opcion");
			break;
		case "C": 
			System.out.println("Has elegido la tercera opcion");
			break;
		case "4": 
			System.out.println("Has elegido la cuarta opcion");
			break;
		default: 
			System.out.println("Opcion incorrecta");
		
		}
	}

}
