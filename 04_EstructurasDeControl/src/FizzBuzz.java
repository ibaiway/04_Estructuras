import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce hasta que numero se ejecutara");
		int numero = scan.nextInt();
		int i;
		for (i =0 ; i <= numero ; i++){
			if(i%3==0 || i%5==0){
				if(i%3==0 && !(i%5==0)){
					System.out.println("Fizz");
				}
				if(i%5==0 && !(i%3==0)){
					System.out.println("Buzz");
				}
				else{
					System.out.println("FizzBuzz");
				}
			}
			else{
				System.out.println(i);
			}
		}//TERMINA FOR
	}//TERMINA CODIGO

}
