import java.util.Locale;
import java.util.Scanner;

public class EstudoJavaNovos {

	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner (System.in);
		
		int a, b;
		double  c, resultado;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextDouble();
		
		resultado = b*c ;
		
		System.out.println(" N?mero do funcion?rio: " + a);
		System.out.println(" Horas trabalhadas:" + b);
		System.out.printf(" Valor que recebe por hora: % .2f\n " , c);
		System.out.println("                     " );
		
		System.out.println(" N?mero do funcion?rio: " + a);
		System.out.printf(" Sal?rio: % .2f\n ", resultado);
		
		
		
		sc.close();

	}

}
