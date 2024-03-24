public class Exercicio06 {

    public static void executar(){
        
        System.out.println("Digite a temperatura em graus celsius: ");
        int celsius = Prompt.lerInteiro();

        double fah = (celsius * 1.8) + 32;
        
        System.out.println("Temperatura em graus fahrenheit: " + fah);


    }
    
}
