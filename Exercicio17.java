public class Exercicio17 {
    
    public static void executar(){

    System.out.println("Informe a nota e o peso em seguida: ");

    System.out.println("Nota 1: ");
    double nota1 = Prompt.lerDecimal();
    System.out.println("peso: ");
    double peso1 = Prompt.lerInteiro();

    System.out.println("Nota 2: ");
    double nota2 = Prompt.lerDecimal();
    System.out.println("peso: ");
    double peso2 = Prompt.lerInteiro();
    
    System.out.println("Nota 3: ");
    double nota3 = Prompt.lerDecimal();
    System.out.println("peso: ");
    double peso3 = Prompt.lerInteiro();

    double mediap = (nota1*peso1 + nota2*peso2 + nota3*peso3) / (peso1+peso2+peso3);

    System.out.println("A média ponderada é: " + mediap);
    }
    
}
