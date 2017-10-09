import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		double decimal = 1.234;
		
		int entero2 = (int)decimal;
		System.out.println(entero2);
		*/
		
		double numazar = (Math.random() * 100);
		/*System.out.println("numero azar:"+numazar);*/
		int entero = (int)numazar;
		/*System.out.println("numero entero:"+entero);*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Intenta acertar el numero:");
		int numero = scan.nextInt();
		int intento = 1;
		
		while(numero != entero){
		
			if (numero > entero){
				System.out.println("El numero es menor, prueba de nuevo");
				numero = scan.nextInt();
				intento ++;
			}else{
				System.out.println("El numero es mayor, prueba de nuevo");
				numero = scan.nextInt();
				intento ++;
			}
		} /* Cierra while*/
		System.out.println("BIEN!!! Has acertado, era el numero:"+entero);
		if(intento=1){
			System.out.println("Lo has hecho en "+intento+" intento");
		}else{
		System.out.println("Lo has hecho en "+intento+" intentos");
		}
		
	} /* termina codigo */

} 
