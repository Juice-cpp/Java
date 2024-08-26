import java.util.Random;

public class Campo {
    Random rand = new Random();
    boolean[][] mapa;
    mapa = new boolean[2][2];
    boolean continuar;

    void start() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = rand.nextBoolean();
            }
        }
    }

    void verificar(int linha, int coluna) {
        if(mapa[linha][coluna]) {
            System.out.println("Explodiu!!");
            continuar = 0;
        }
        else {
            System.out.println("Está seguro!!");
            continuar = 1;
        }
    }

}
