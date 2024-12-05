package tp;


import bandeau.Bandeau;
import java.awt.Font;


public class Zoom implements Effet {
    private int repetitions;


    public Zoom(int repetitions) {
        this.repetitions = repetitions;
    }


    @Override
    public void appliquerEffet(Bandeau bandeau) {
        bandeau.setMessage("On zoome...");
        for (int i = 5; i <= 50; i += 5) {
            bandeau.setFont(new Font("Arial", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
        bandeau.setFont(new Font("Arial", Font.PLAIN, 15)); // Reset
    }
}
