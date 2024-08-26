public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();

        Salgado s1 = new Salgado();
        Salgado s2 = new Salgado();
        Salgado s3 = new Salgado();

        s1.nome = "Coxinha";
        s2.nome = "Esfiha";
        s3.nome = "Kibe";

        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        cantina.mostraInfo();
    }
}