//Javinha é de cria

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Campo campo = new Campo();

        System.out.println("Este campo tem um tamanho 2x2.");
        System.out.println("Deseja começar? (1) Sim  (0) Não");
        int comecar = entrada.nextInt();

        if(comecar == 1) {
            campo.start();
        }
        while(comecar == 1) {
            System.out.print("Insira uma coordenada: ");
            int coordX = entrada.nextInt();
            int coordY = entrada.nextInt();
            campo.verificar(coordX, coordY);
            comecar = campo.continuar;
        }
    }
}