
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Hola mundo";
		
		System.out.println(cadena);
		System.out.println("Hola mundo");
		
		System.out.println("La cadena\"" + cadena + "\" tiene " + cadena.length() + " caracteres");
		System.out.println("El septimo caracter de \"" + cadena + "\" es " + cadena.charAt(6));
		System.out.println(cadena.substring(0, 4));
		System.out.println(cadena.substring(5, cadena.length()));
	}

}
