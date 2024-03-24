
import java.util.Scanner;

public class Exercicio01 {

    public static void executar(){
    
      int num;

      Scanner leitor = new Scanner(System.in);
      System.out.println("Digite um número: ");
      num = leitor.nextInt();

      if(num > 10){
         System.out.println("Número maior que 10!");
        }else{
        System.out.println("Número menor que 10!");
        }

      leitor.close();
}

}
