
// Saida de Dados 

import java.util.Locale; // faz o importação do pacote Locale para configurar o formato de saída



public class SaidadeDados {
    public static void main(String[] args) throws Exception {
        
         Locale.setDefault(Locale.US); //configura o Locale para usar ponto como separador decimal
         

        int idade;
        double salario, altura;
        String genero;
        String nome;

        idade = 30;
        salario = 2500.50;
        altura = 1.75;
        genero = "Masculino";
        nome = "João Silva";

        // Exibe os dados formatados
        /* 
        System.out.println("Dados do usuário:");
        System.out.println("idade = " + idade);
        System.out.println("salario = " + String.format("%.2f", salario ));
        System.out.println("altura = " +  String.format("%.2f", altura));
        System.out.println("gênero = " + genero);     
        System.out.println("nome = " + nome);
        */


        System.out.println("O funcionário " + nome + " tem " + idade + " anos, " +
                           "tem um salário de R$ " + String.format("%.2f", salario) + ", " +
                           "tem a altura de " + String.format("%.2f", altura) + " metros e" +
                           " é do gênero " + genero + ".");
             
    
    
    
        

        }   
}
