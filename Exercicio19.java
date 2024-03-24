public class Exercicio19 {

    public static void executar(){

    System.out.println("Digite o raio: ");
    double raio = Prompt.lerDecimal();
    System.out.println("Digite a altura: ");
    double altura = Prompt.lerDecimal();

    double volume = 3.14 * Math.pow(raio,2)*altura;

    System.out.println("O volume é:" + volume);


    }
    
}
