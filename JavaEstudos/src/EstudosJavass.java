import java.util.Scanner;

public class EstudosJavass {

	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Digite um numero");
		numero = sc.nextInt();
		
		
		if (numero >=0) {
				System.out.println ("NAO NEGATIVO");
			}else {
				System.out.println ("NEGATIVO");
			}
		}

	

}
