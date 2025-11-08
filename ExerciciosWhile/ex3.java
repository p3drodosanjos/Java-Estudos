package ExerciciosWhile;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tipo, alcool = 1, gasolina = 2, diesel = 3, sair = 4;

        System.out.println("Digite o tipo de combustível (1-álcool, 2-gasolina, 3-diesel, 4-sair):");
        tipo = sc.nextInt();

        while (tipo != sair) {
            if (tipo == alcool) {
                System.out.println("Álcool");
            } else if (tipo == gasolina) {
                System.out.println("Gasolina");
            } else if (tipo == diesel) {
                System.out.println("Diesel");
            } else {
                System.out.println("Código inválido. Tente novamente:");
            }
            System.out.println("Muito obrigado!");
            System.out.println("Digite o tipo de combustível (1-álcool, 2-gasolina, 3-diesel, 4-sair):");
            tipo = sc.nextInt();
            
        }
        
    }

}
