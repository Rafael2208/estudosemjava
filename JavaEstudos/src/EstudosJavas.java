import java.util.Locale;
import java.util.Scanner;

public class EstudosJavas {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner (System.in);
		
		
		double a, b , c ,d ,e ,f ,g , resultado, result , prova;
		
		a = sc.nextDouble();
		c = sc.nextDouble();
		
		b = sc.nextDouble();
		d = sc.nextDouble();
		
		e = sc.nextDouble();
		f = sc.nextDouble();
		g = sc.nextDouble();
		
		
		resultado = (a*c)/2;
		result = (b*d)*b;
		prova = ((e+f)*g)/2;
		
		
		System.out.printf(" TRIANGULO: % .3f\n " , resultado);
		System.out.printf(" CIRCULO: % .3f\n " , result);
		System.out.printf(" TRAPEZIO: % .3f\n " , prova);
		
		
		
		
		sc.close();

	}

}
