import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vendas = 0;
        int x;
        for(int i = 1; i <= 3; i++) {
            System.out.println("Insira a quantidadede vendas na " + i + "ª hora:");
            x = entrada.nextInt();
            vendas = vendas + x;
        }
        double media = vendas / (3*1.0);
        System.out.println("Total: " + vendas);
        System.out.println("Media: " + media);
    }
}