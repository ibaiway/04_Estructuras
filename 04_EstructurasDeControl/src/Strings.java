
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
		
	}

}
