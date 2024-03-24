public class Exercicio16 {
    public static void executar(){
        
        System.out.println("Nota 1: ");
        double nota1 = Prompt.lerDecimal();
        System.out.println("Nota 2: ");
        double nota2 = Prompt.lerDecimal();
        System.out.println("Nota 3: ");
        double nota3 = Prompt.lerDecimal();
    
        double media = (nota1 + nota2 + nota3) /3;
    
        System.out.println("Média: " + media);
    }
}
    