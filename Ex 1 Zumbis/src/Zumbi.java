public class Zumbi {
    String nome;
    boolean fome = true;
    boolean escutar = true;
    public void comer() {
        fome = false;
        escutar = false;
    }
    public void falar() {
        System.out.println("Eerrr...");
    }

}
