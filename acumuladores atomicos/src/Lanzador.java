import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Lanzador implements Runnable{
    private Marcador marcador;

    public Lanzador(Marcador marcador) {
        this.marcador = marcador;
    }

    @Override
    public void run() {
        Integer dice;
        Random random = new Random();
        for(int i=0;i < 10000; i++){
            dice=random.nextInt(6)+1;
            increment(dice);
        }

    }
    private void increment(int dice){
        switch (dice) {
            case 1:
                marcador.counterOne.add(1);
                break;
            case 2:
                marcador.counterTwo.add(1);
                break;
            case 3:
                marcador.counterThree.add(1);
                break;
            case 4:
                marcador.counterFour.add(1);
                break;
            case 5:
                marcador.counterFive.add(1);
                break;
            case 6:
                marcador.counterSix.add(1);
                break;

        }

    }
}
