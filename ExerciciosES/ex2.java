package ExerciciosES;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, PI = 3.14159;

        System.out.println("Digite o valor do raio:");

        R = sc.nextDouble();

        A = PI * R * R;

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }

}
