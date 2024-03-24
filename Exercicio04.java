import java.util.Scanner;

public class Exercicio04 {
     public static void executar(){

    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = leitor.nextDouble();
        double soma = num1 + num2;
        double sub = num1 - num2;
        double divi = num1 / num2;
        double multi = num1 * num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Divisão: " + divi);
        System.out.println("Multiplicação: " + multi);

    
    leitor.close();
    }
}
