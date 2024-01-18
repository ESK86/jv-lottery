package core.basesyntax;

public class Application {
    private static final int COUNT_OF_LOTTERIES = 3;

    public static void main(String[] args) {
        Lottery lot = new Lottery();
        for (int i = 0; i < COUNT_OF_LOTTERIES; i++) {
            System.out.println(lot.getRandomBall());
        }
    }
}
