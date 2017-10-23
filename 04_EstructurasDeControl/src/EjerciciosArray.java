
public class EjerciciosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numero = new int[15];
		int total = 0;
		for(int i = 0; i < numero.length; i++){
			numero[i] = (int) (Math.random()*10);
			System.out.print(numero[i]+",");
			total = total + numero[i];
		}
		System.out.println("\nLa suma de todos los numeros es: " + total);
		System.out.println("La media de todos los numero es: " + total/numero.length);
		
		
	}

}
