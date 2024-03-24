public class Exercicio14 {
    public static void executar(){

        System.out.println("Digite a1 (primeiro termo da PA): ");
        int a1 = Prompt.lerInteiro();
        System.out.println("Digite r (razão): ");
        int r = Prompt.lerInteiro();
        System.out.println("Digite n (n-ésimo termo)");
        int n = Prompt.lerInteiro();
        
        int an;

        an = a1 + (n-1) * r;

        System.out.println("Resultado: " + an);
        
        
    }
    
}
