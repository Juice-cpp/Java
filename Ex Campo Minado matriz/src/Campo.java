import java.util.Random;

public class Campo {
    Random rand = new Random();
    boolean[][] mapa = new boolean[2][2];
    int continuar = 1;
    int localSeguro = 0;

    void start() {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = rand.nextBoolean();

                if(!mapa[i][j]) {
                    localSeguro += 1;
                }
            }
        }
    }

    void verificar(int linha, int coluna) {
        if(mapa[linha][coluna]) {
            System.out.println("Explodiu!!");
            continuar = 0;
        }
        else {
            localSeguro -= 1;
            System.out.println("Está seguro!!");
            if(localSeguro == 0) {
                System.out.println("Parabéns! Jogo finalizado.");
                continuar = 0;
            }
        }
    }
}
