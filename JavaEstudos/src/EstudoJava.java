import java.util.Locale;
import java.util.Scanner;

public class EstudoJava {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
		Scanner sc = new Scanner (System.in);
		
		int a, b ,d, f;
		double  c, e , resultado;
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		c = sc.nextDouble();
		
		f = sc.nextInt();
		
		d = sc.nextInt();
		e = sc.nextDouble();
		
		resultado = (b*c)+(d*e);
		
		System.out.println(" C�digo da pe�a (1): " + a );
		System.out.println(" N�mero de pe�as: " + b);
		System.out.printf(" Pre�o ou Valor unitario de cada pe�a: % .2f\n " , c);
		System.out.println("                     " );
		System.out.println(" C�digo da pe�a (2): " + f );
		System.out.println(" N�mero de pe�as: " + d);
		System.out.printf(" Pre�o ou Valor unitario de cada pe�a: % .2f\n " , e);
		System.out.println("                     " );
		
		
		System.out.printf(" Valor total a pagar: % .2f\n ", resultado);
		
		
		
		sc.close();

	}

}
