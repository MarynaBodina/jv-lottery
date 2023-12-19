package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();
    private static final int MAX_RANDOM_NUMBER = 100;

    public static Ball getRandomBall() {
        Color randomColor = ColorSupplier.getRandomColor();
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;
        return new Ball(randomColor, randomNumber);
    }
}

