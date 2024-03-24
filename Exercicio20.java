public class Exercicio20 {

    public static void executar(){

    System.out.println("Digite o tempo em horas da viagem: ");
    double hora = Prompt.lerDecimal();

    System.out.println("Digite a velocidade média percorrida: ");
    double velmed = Prompt.lerDecimal();

    double km = velmed * hora;
    double litros = km/12;


    System.out.println("Total de litros gastos: " + litros);

    }
}
