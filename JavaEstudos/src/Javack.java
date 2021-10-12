import java.util.Scanner;

public class Javack {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
		
		int a , b ;
		double c , d , e , f , g , resultado, resultado2 , resultado3, resultado4, resultado5;
		
		System.out.println("Digite um código de 1 a 5 ");
		a = sc.nextInt();  // codigo
		System.out.println("digite a quantidade desejada "  );
		b = sc.nextInt(); // quantidade
		
		c = 4.00; // cachorro quente
		d = 4.50; //x-salada
		e = 5.00;  //x-bacon
		f = 2.00;  // torrada simples
		g = 1.50;	// refrigerante	
		
		resultado = c*b;
		resultado2 = d*b;
		resultado3 = e*b;
		resultado4 = f*b;
		resultado5 = g*b;
		
		
		if (a==1) {
			System.out.printf("TOTAL: % .2f\n ", resultado );
		} else if (a==2) {
			System.out.printf("TOTAL: % .2f\n", resultado2 );
		} else if (a==3) {
			System.out.printf("TOTAL: % .2f\n", resultado3 );
		} else if (a==4) {
			System.out.printf("TOTAL: % .2f\n", resultado4 );
		} else {
			System.out.printf("TOTAL: % .2f\n", resultado5 );
		}
		
		
		sc.close();

	}

	}


