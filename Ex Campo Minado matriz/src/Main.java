import java.util.Scanner;
public class Main {
    private static java.lang.Object continuar;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Campo campo = new Campo();

        System.out.println("Deseja começar? (1) Sim  (0) Não");
        boolean começar = entrada.nextBoolean();
        int coordX = entrada.nextInt();
        int coordY = entrada.nextInt();
        while(começar) {
            campo.start();
            
            int coordX = entrada.nextInt();
            int coordY = entrada.nextInt();
            campo.verificar();
            começar = campo.continuar;
        }
    }
}