package tp;


import bandeau.Bandeau;
import java.awt.Color;


public class Clignotant implements Effet {
    private int repetitions;
    private int delai;


    public Clignotant(int repetitions, int delai) {
        this.repetitions = repetitions;
        this.delai = delai;
    }


    @Override
    public void appliquerEffet(Bandeau bandeau) {
        bandeau.setMessage("Ça clignote...");
        Color originalColor = bandeau.getForeground();
        for (int i = 0; i < repetitions; i++) {
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(delai);
            bandeau.setForeground(Color.BLACK);
            bandeau.sleep(delai);
        }


    }
}
