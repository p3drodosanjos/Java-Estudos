package ExerciciosWhile;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int X, Y;
        System.out.println("Digite duas coordenadas:");

        X = sc.nextInt();
        Y = sc.nextInt();

        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro Quadrante");
            } else {
                System.out.println("Quarto Quadrante");
            }
            System.out.println("Digite outras coordenadas:");
            X = sc.nextInt();
            Y = sc.nextInt();
            
        }

        sc.close();
    }

}
