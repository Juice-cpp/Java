public class Main {
    public static void main(String[] args) {
        //criando instâncias do kart
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        //nomeando cada instância
        kart1.nome = "Kart 1";
        kart2.nome = "Kart 2";

        //criando instâncias do piloto
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        //agregando cada piloto a cada kart
        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        //definindo as informações do motor de cada kart
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 95.20f;

        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 76.10f;
    }
}