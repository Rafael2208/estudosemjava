import java.util.Scanner;

public class ArquivoJava {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
		
		
		int x , y;
		
		System.out.println("Digite um número com base em X ");
		 x = sc.nextInt();  // numero
		 
		 System.out.println("Digite um número com base em Y ");
		 y = sc.nextInt();  // numero
		

				
		if (x == 0 && y == 0) {
			System.out.println("PONTO ORIGEM" );
		} else if (x == 0 ) {
			System.out.println("EIXO X" );
		} else if (y == 0) {
			System.out.println("EIXO Y" );
		} else if (x > 0 && y > 0) {
			System.out.println("Q1" );
		} else if (x < 0 && y > 0) {
			System.out.println("Q2" );
		} else if (x < 0 && y < 0) {
			System.out.println("Q3" );
		} else {
			System.out.println("Q4" );
		}
		
		
		sc.close();

	}

}


