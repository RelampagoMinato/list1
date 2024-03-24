import java.util.Scanner;

public class Exercicio13 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Digite o valor de B:");
        double b = scanner.nextDouble();
        
        System.out.println("Digite o operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);
        
        double resultado = 0;
        boolean operacaoValida = true;

        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operador não definido!");
                operacaoValida = false;
        }
       
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
