import java.util.Locale;
import java.util.Scanner;

public class ContagemJava {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("VALOR DE I :" + i);
		}

		sc.close();
	}

}
