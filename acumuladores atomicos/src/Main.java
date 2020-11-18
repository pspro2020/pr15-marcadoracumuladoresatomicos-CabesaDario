public class Main {


    public static void main(String[] args) throws InterruptedException{
        Marcador count = new Marcador();
        long sum;
        for(int i = 0; i < 3; i++){
            Thread hilo = new Thread(new Lanzador(count), "hilo "+i);
            hilo.start();
            hilo.join();
        }
        sum = count.counterOne.longValue() + count.counterTwo.longValue() + count.counterThree.longValue() +
                count.counterFour.longValue() + count.counterFive.longValue() + count.counterSix.longValue();
        System.out.printf("Número 1: %d veces.%nNúmero 2: %d veces.%nNúmero 3: %d veces.%n" +
                        "Número 4: %d veces.%nNúmero 5: %d veces.%nNúmero 6: %d veces.%nTotal de veces:" +
                        " %d + %d + %d + %d + %d + %d = %d"
                ,count.counterOne.longValue(), count.counterTwo.longValue(), count.counterThree.longValue(),
                count.counterFour.longValue(), count.counterFive.longValue(), count.counterSix.longValue(), count.counterOne.longValue(),
                count.counterTwo.longValue(), count.counterThree.longValue(),
                count.counterFour.longValue(), count.counterFive.longValue(), count.counterSix.longValue(), sum);

    }

}
