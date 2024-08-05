import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira a NPA: ");
        double NPA = entrada.nextDouble();
        if(NPA >= 60.0) {
            System.out.println("Passou!!");
        }
        else{
            System.out.println("Infelizmente nao passou.");
            System.out.print("Insira a nota da NP3: ");
            double NP3 = entrada.nextDouble();
            if((NP3 + NPA) / 2 >= 50){
                System.out.println("Passou!!");
            }
            else{
                System.out.println("Reprovado :(");
            }
        }

    }
}