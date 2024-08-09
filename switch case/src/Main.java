import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numAlunos = entrada.nextInt();

        switch (numAlunos) {
            case 10:
                System.out.println("Sala I-16");
                break;

            case 20:
                System.out.println("Sala I-16");
                break;

            case 30:
                System.out.println("Sala I-22");
                break;

            default:
                System.out.println("Sempre será executado");
        }
        entrada.close();
    }
}