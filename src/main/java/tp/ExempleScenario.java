package tp;


import bandeau.Bandeau;


import java.awt.Color;


public class ExempleScenario {
    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        bandeau.setBackground(Color.PINK);
        Scenario scenario = new Scenario();


        scenario.ajouterEffet(new Clignotant(10, 200));
        scenario.ajouterEffet(new Zoom(10));
        scenario.ajouterEffet(new Rotation(2));


        scenario.jouerScenario(bandeau);
        bandeau.setMessage("Terminé !");
        bandeau.sleep(2000);
        bandeau.close();
    }
}
