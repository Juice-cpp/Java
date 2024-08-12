public class Conta {
    //atributos
    double saldo;
    String cliente;
    int limite;
    int numero;

    public void sacar(double quantia) {
        saldo -= quantia;
    }

    //métodos
    public void depositar(double quantia) {
        saldo += quantia;
    }
}