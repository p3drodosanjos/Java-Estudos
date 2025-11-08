package ExerciciosEC;

import java.util.Scanner;

import ExerciciosES.Sc;

public class ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int numero;

        System.out.println("Digite um número inteiro:");

        numero = sc.nextInt();

        

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }



        sc.close();
    }

  

}
