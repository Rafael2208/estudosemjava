import java.util.Locale;
import java.util.Scanner;

public class EstudosJava {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner (System.in);
		
		int x, y, w, z, resultado;
		
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		z = sc.nextInt();
		
		resultado = x*y-w*z;
		
		
		System.out.println(" Diferença: " + resultado);
		
		 
		
		sc.close();

	}

}
