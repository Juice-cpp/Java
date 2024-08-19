public class Zumbi {
    String nome;
    double vida;

    double mostraVida() {
        return this.vida;
    }
    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        this.vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
