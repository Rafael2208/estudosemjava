import java.util.Locale;
import java.util.Scanner;

public class EstudosJavac {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 10; i > 0; i--) {
			System.out.println("VALOR DE I :" + i);
		}

		sc.close();

	}

}
