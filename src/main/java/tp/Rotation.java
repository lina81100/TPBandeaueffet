package tp;


import bandeau.Bandeau;


public class Rotation implements Effet {
    private int repetitions;


    public Rotation(int repetitions) {
        this.repetitions = repetitions;
    }


    @Override
    public void appliquerEffet(Bandeau bandeau) {
        bandeau.setMessage("Ça tourne...");
        for (int i = 0; i < repetitions; i++) {
            bandeau.setRotation(Math.PI / 2);
            bandeau.sleep(300);
            bandeau.setRotation(Math.PI);
            bandeau.sleep(300);
            bandeau.setRotation(3 * Math.PI / 2);
            bandeau.sleep(300);
            bandeau.setRotation(0);
            bandeau.sleep(300);
        }
    }
}
