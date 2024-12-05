package tp;

import java.awt.Color;
import java.awt.Font;


public class Bandeau {


    private String message;
    private double rotation;
    private Color background;
    private Color foreground;
    private Font font;


    public Bandeau() {
        this.message = "";
        this.rotation = 0.0;
        this.background = Color.WHITE;
        this.foreground = Color.BLACK;
        this.font = new Font("Arial", Font.PLAIN, 20);
    }

}


