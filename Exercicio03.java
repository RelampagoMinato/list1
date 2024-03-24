import java.util.Scanner;

public class Exercicio03 {
    public static void executar(){

    
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = leitor.nextInt();
        

        if(a > b){
            System.out.println("O primeiro número é o maior: " + a );
        }else if(a < b){
            System.out.println("O segundo número é o maior: " + b );
        }
        else{
            System.out.println("sequência de números informados é inválida");
        }
        
    
    
    leitor.close();
    }
  
}