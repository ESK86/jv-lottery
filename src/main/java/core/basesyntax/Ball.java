package core.basesyntax;

public class Ball extends ColorSupplier {
    private String color;
    private final int number;

    public Ball(int number) {
        this.color = getRandomColor();
        this.number = number;
    }

    @Override
    public String toString() {
        return "Ball{ "
                + "color= " + color
                + ", number= " + number
                + " }";
    }
}
