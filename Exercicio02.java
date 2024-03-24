
import java.util.Scanner;

public class Exercicio02 {
    public static void executar(){

    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = leitor.nextDouble();
        double  soma = num1 + num2;


        System.out.println("A soma é:" + soma );
    
    
    leitor.close();
    }
  
}
