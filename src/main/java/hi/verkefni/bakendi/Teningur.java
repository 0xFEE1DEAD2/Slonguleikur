package hi.verkefni.bakendi;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Random;

public class Teningur {
    private static final int MAX = 6;
    private final IntegerProperty talaProperty = new SimpleIntegerProperty(MAX);

    /**
     * Skilar slembitölu 1 - 6.
     *
     * @return slembitala
     */
    public void kasta() {
        Random randomInteger = new Random();
        talaProperty.set(randomInteger.nextInt(MAX) + 1);
    }

    /**
     * Sækir gildi á teningnum.
     *
     * @return talaProperty gildi
     */
    public int getKasta() {
        return talaProperty.get();
    }

    public static void main(String[] args) {
        Teningur teningur = new Teningur();

        teningur.kasta(); // Kasta
        System.out.println(teningur.getKasta()); // Sækja kast gildi
    }
}
