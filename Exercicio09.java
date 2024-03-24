public class Exercicio09 {

    public static void executar(){

        System.out.println("Informe número A");
        int a = Prompt.lerInteiro();

        System.out.println("Informe número B");
        int b = Prompt.lerInteiro();

        if(a == b){
            System.out.println("Números iguais");
        }else{
            System.out.println("Números Diferentes!  \n");
            if(a > b){
                System.out.println("Número A é o maior!");
            }else{
                System.out.println("Números B é o maior!");
            }


        }

    }
    
}
