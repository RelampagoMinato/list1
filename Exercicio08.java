public class Exercicio08 {
    public static void executar(){

        System.out.println("Informe um número:");
        int num = Prompt.lerInteiro();

        if(num >= 50){
            System.out.println("Número informado maior ou igual a 50!");
        }else{
            System.out.println("Número informado menor que 50!");
        }

    }
    
}