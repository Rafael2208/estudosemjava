
import java.util.Scanner;

public class EstudosDeJava {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		int x, y, soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x+y;
		
		System.out.println(" voc? digitou: "+ x + " mais: "+ y + " que somado ficou: " + soma);
		
		sc.close();

	}

}
