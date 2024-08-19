public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.vida = 100;
        z2.vida = 200;

        z1.nome = "Poles";
        z2.nome = "Soebad Saliv";

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());
        
        z1.transfereVida(z2, 50);

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());
    }
}