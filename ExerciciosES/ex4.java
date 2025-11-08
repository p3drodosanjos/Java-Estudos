package ExerciciosES;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        String nomeFuncionario;
        int numeroFuncionario, horasTrabalhadas, valorHora;
        double salario;

        System.out.println("Digite o nome do funcionário:");
        System.out.println("Digite o número do funcionário:");
        System.out.println("Digite a quantidade de horas trabalhadas:");
        System.out.println("Digite o valor que recebe por hora:");  
        
        nomeFuncionario = sc.nextLine();
        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextInt();
        salario = horasTrabalhadas * valorHora;

        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.printf("Salário: R$ %.2f%n", salario);


        sc.close();

        
    }
}
