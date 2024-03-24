import java.util.Scanner;

public class Exercicio15 {
    public static void executar(){

        Scanner leitor = new Scanner(System.in);
        

        System.out.println("Informe coordenadas de P1");
        System.out.println("Informe x1: ");
        double x1 =  leitor.nextDouble();
        System.out.println("Informe x2: ");
        double y1 =  leitor.nextDouble();

        System.out.println("Informe coordenadas de P2");
        System.out.println("Informe y1: ");
        double  x2 = leitor.nextDouble();
        System.out.println("Informe y2: ");
        double y2 = leitor.nextDouble();

        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        String dFormatado = String.format("%.2f", d);

        System.out.println("A distância é: " + dFormatado);



    leitor.close();
    }
}
