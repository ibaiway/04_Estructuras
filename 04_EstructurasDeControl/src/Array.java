
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] notas = new int[10];
		
		//Rellenar el array con 0-s
		for(int i = 0; i < notas.length; i++){
			notas[i] = 0;
		}
		int suma_notas;
		suma_notas = notas [0] + notas [1] + notas[3];
		System.out.println("La suma de notas es: " + suma_notas);
		
		
		//Se declara, Se crea y Se inicializa
		String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
		System.out.println(semana.length);
		System.out.println(semana[1]);
		
		
		
		//Saca todos los dias de la semana
		for(int i = 0; i < semana.length; i++){
			System.out.println(semana [i]);
		}
	}//TERMINA CODIGO

}
