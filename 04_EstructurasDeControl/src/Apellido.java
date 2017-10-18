import java.util.Scanner;

public class Apellido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int A_LARGO = 1;
		final int A_ORDENADO = 2;
		final int A_EXTRAER = 3;
		final int A_SALIR = 4;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("#######################");
		System.out.println("SISTEMA DE GESTION DE APELLIDOS INICIADO");
		System.out.println("#######################\n");
		System.out.println("Elija una de las siguientes opciones:\n");
		System.out.println(A_LARGO + " - Apellidos mas largos");
		System.out.println(A_ORDENADO + " - Ordenar alfabeticamente los apellidos");
		System.out.println(A_EXTRAER + " - Extraer del nombre apellido el apellido");
		System.out.println(A_SALIR + " - SALIR");
		
		int opcion = Integer.parseInt(scan.nextLine());
		String  apellido1, apellido2, apellido3, apellido4, apellido5;
		
		switch (opcion){
			case A_LARGO:
				System.out.println("Introduzca primer apellido:");
				apellido1 = scan.nextLine();
				System.out.println("Introduzca segundo apellido:");
				apellido2 = scan.nextLine();
				
				if (apellido1.length() > apellido2.length()) {
					System.out.println(apellido1 + " es mas largo que " + apellido2);
					System.out.println("- " + apellido1 + " tiene " + apellido1.length() + " caracteres");
					System.out.println("- " + apellido2 + " tiene " + apellido2.length() + " caracteres");	
				}else if (apellido1.length() < apellido2.length()){
					System.out.println(apellido2 + " es mas largo que " + apellido1);
					System.out.println("- " + apellido1 + " tiene " + apellido1.length() + " caracteres");
					System.out.println("- " + apellido2 + " tiene " + apellido2.length() + " caracteres");
				}else{
					System.out.println(apellido1 + " y " + apellido2 + " tienen la misma longitud.");
					System.out.println("Su longitud es de " + apellido1.length() + " caracteres");
				}
				break;
				
				//METODO DE ABAJO ES PEOR
				/*
				if(apellido1.length() > apellido2.length()){
					System.out.println(apellido1 + " es mas largo que " + apellido2);
					System.out.println("- " + apellido1 + " tiene " + apellido1.length() + " caracteres");
					System.out.println("- " + apellido2 + " tiene " + apellido2.length() + " caracteres");
				}
				if(apellido2.length() > apellido1.length()){
					System.out.println(apellido2 + " es mas largo que " + apellido1);
					System.out.println("- " + apellido1 + " tiene " + apellido1.length() + " caracteres");
					System.out.println("- " + apellido2 + " tiene " + apellido2.length() + " caracteres");	
				}
				if(apellido1.length() == apellido2.length()){
					System.out.println(apellido1 + " y " + apellido2 + " tienen la misma longitud.");
					System.out.println("Su longitud es de " + apellido1.length() + " caracteres");
				}
				
				*/
			case A_ORDENADO:
				System.out.println("Introduzca primer apellido:");
				apellido3 = scan.nextLine();
				System.out.println("Introduzca segundo apellido:");
				apellido4 = scan.nextLine();
				
				if(apellido3.compareTo(apellido4) < 0){
					System.out.println(apellido3 + " va antes que " + apellido4);
				}
				if(apellido3.compareTo(apellido4) > 0){
					System.out.println(apellido4 + " va antes que " + apellido3);
				}
				break;
			case A_EXTRAER:
				System.out.println("Introduza nombre y apellido");
				apellido5 = scan.nextLine();
				System.out.println("Tu apellido es " + apellido5.substring(apellido5.lastIndexOf(" ") + 1));
				break;
			case A_SALIR:
				System.out.println("CERRANDO PROGRAMA");
				System.out.println("#######################");
				break;
			default:
				System.out.println("CERRANDO PROGRAMA");
				System.out.println("#######################");
		} //CIERRA SWITCH
	} //TERMINA CODIGO

}
