public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.cliente = "Joaquina";
        c1.saldo = 1000.0;
        c1.limite = 2500;
        c1.numero = 12345678;

        c1.sacar(500);
        System.out.println("Seu saldo é: " + c1.saldo);
    }
}
