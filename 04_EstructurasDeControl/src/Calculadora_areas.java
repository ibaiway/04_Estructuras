import java.util.Scanner;

public class Calculadora_areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int opcion;
		
		do{
			System.out.println("Opciones disponibles:\n"+"1-Area del circulo\n"+"2-Area del cuadrado\n"+"3-Area del triangulo \n"+"4-Salir");
			opcion = scan.nextInt();
			
			switch (opcion){
			case 1: 
				System.out.println("Introduce radio del circulo:");
				double a_circulo = scan.nextDouble();
				System.out.println("El area del circulo es:"+(a_circulo*a_circulo*Math.PI));
				break;
			case 2:
				System.out.println("Introduce lado del cuadrado:");
				double a_cuadrado = scan.nextDouble();
				System.out.println("El area del cuadrado es:"+(a_cuadrado*a_cuadrado));
				break;
			case 3: 
				System.out.println("Introduce base del triangulo");
				double a_triangulo = scan.nextDouble();
				System.out.println("Introduce altura del triangulo");
				double b_triangulo = scan.nextDouble();
				System.out.println("El area del triangulo es:"+(a_triangulo/2*b_triangulo));
				break;
			case 4: 
				System.out.println("Cerrando sistema");
				break;
			default: 
				System.out.println("Opcion incorrecta");
			
			}
			
		}while(opcion != 4);
		
		System.out.println("Fin del programa");
	} //TERMINA CODIGO

}
