import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int nRand = rand.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Adivinhe o número de 1 a 10: ");
        while(true) {
            int nAdv = entrada.nextInt();
            if (nAdv == nRand) {
                System.out.println("Acertou!!");
                break;
            } else {
                System.out.println("Errou.");
            }
        }
    }
}