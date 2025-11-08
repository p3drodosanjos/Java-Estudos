package ExerciciosEC;

import java.util.Scanner;

import ExerciciosES.Sc;

public class ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.println("Digite a hora inicial e a hora final de um jogo:");

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        } else {
            duracao = 24 - horaInicial + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            
        }

        sc.close();
        
    }

}
