public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();

        zumbi1.nome = "Poles";
        zumbi1.idade = 20;

        Zumbi zumbi2 = new Zumbi();

        zumbi2.nome = "Soabed Saliv";
        zumbi2.idade = 30;

        zumbi1.seAlimentar();
        zumbi2.seAlimentar();
    }
}