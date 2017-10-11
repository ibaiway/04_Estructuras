
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Hola mundo";
		
		String cadena1 = "zubiri";
		String cadena2 = "manteo";
		
		// System.out.println(cadena);
		// System.out.println("Hola mundo");
		
		System.out.println("La cadena\"" + cadena + "\" tiene " + cadena.length() + " caracteres");
		
		System.out.println("El septimo caracter de \"" + cadena + "\" es " + cadena.charAt(6));
		
		System.out.println(cadena.substring(0, 4));
		System.out.println(cadena.substring(5, cadena.length()));
		
		if(cadena.equals(cadena.substring(0,4))){
			System.out.println("Son iguales");
		}else{
			System.out.println("Son diferentes");
		}
		
		System.out.println("\n" + cadena.indexOf("a"));
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena);
		
		int comparacion = (cadena1.compareTo("cadena2"));
		
		System.out.println("Comparacion de " + cadena1 + " con " + cadena2 + " es " + 
				 comparacion);
		
		if(cadena2.equals(cadena1)){
			System.out.println("son iguales");
		}
			
		if(cadena2.compareTo(cadena1) == 0){
			System.out.println("son iguales");
		}
		
		System.out.println("La ultima aparicion de o en " + cadena + " es " + cadena.lastIndexOf("o"));
		
		System.out.println("La primera aparicion de o en " + cadena + " es " + cadena.indexOf("0"));
		

	} //TERMINA CODIGO

}
