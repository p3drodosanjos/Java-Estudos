package ExerciciosEC;

import java.util.Scanner;

import ExerciciosES.Sc;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite dois números inteiros:");
        
        A = sc.nextInt();
        B = sc.nextInt();

        
        if (A % B == 0 || B % A == 0) {
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
            
        }

        sc.close();
        
    }
}
