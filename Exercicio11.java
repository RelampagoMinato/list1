public class Exercicio11 {

    public static void executar(){
 
        System.out.println("Digite o primeiro número: ");
        int a = Prompt.lerInteiro();
        System.out.println("Digite o segundo número: ");
        int b = Prompt.lerInteiro();
        System.out.println("Digite o terceiro número: ");
        int c = Prompt.lerInteiro();
        
        if(a == b || a ==c || b == c){
            System.out.println("números não são distintos!");
            return;
        }

        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));
        int meio = (a + b + c) - menor - maior;

        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);
    }
}
