package tp;

import bandeau.Bandeau;
import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private List<Effet> effets;
    public Scenario() {
        this.effets = new ArrayList<>();
    }

    public void ajouterEffet(Effet effet) {
        effets.add(effet);
    }

    public void jouerScenario(Bandeau bandeau) {
        for (Effet effet : effets) {
            effet.appliquerEffet(bandeau);
        }
    }
}
