import java.util.Locale;
import java.util.Scanner;

public class EstudosJavaNovo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner (System.in);
		
		double x, y, resultado;
		
		x = sc.nextDouble();
		y = 3.14159;
		
		resultado = (x*y) *x;
		
		
		System.out.printf(" Valor da área: %.4f\n " , resultado);
		
		 
		
		sc.close();

	}

}
