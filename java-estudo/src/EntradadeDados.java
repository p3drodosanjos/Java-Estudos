import java.util.Locale;
import java.util.Scanner;

public class EntradadeDados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       String nome;
       int idade;
       double salario;
       char sexo;

       System.out.print("Digite seu nome: ");
       nome = sc.nextLine();
       System.out.print("Digite sua idade: ");
       idade = sc.nextInt();
       System.out.print("Digite seu salário: ");
       salario = sc.nextDouble();
       System.out.print("Digite seu sexo (M/F): ");
       sexo = sc.next().charAt(0);


        System.out.println("Dados do usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário:" + String.format("%.2f", salario));
        System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Feminino"));
        
        sc.close();
    }
} 
