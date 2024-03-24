public class Exercicio18 {

    public static void executar(){
  
      System.out.println("Informe as notas: ");
  
      System.out.println("Nota 1: ");
      double nota1 = Prompt.lerDecimal();
  
      System.out.println("Nota 2: ");
      double nota2 = Prompt.lerDecimal();
      
      System.out.println("Nota 3: ");
      double nota3 = Prompt.lerDecimal();
      
      double mediaharmonica = 3 / ((1/nota1) +(1/nota2) + (1/nota3));
  
      System.out.println("A média harmônica é: " + mediaharmonica);
  
  
    }
  
  }
  