public class Cantina {
    String nome;
    Salgado salgados[] = new Salgado[3];
    int i = 0;
    void addSalgado(Salgado novoSalgado, i) {
        salgados[i] = novoSalgado;
        i++;
    }
    void mostrarInfo() {
        for(Salgado nSalgado : salgados) {
            System.out.println(nSalgado.nome);
        }
    }
}
