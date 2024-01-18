package modelo;
import java.util.ArrayList;
import javafx.scene.canvas.Canvas;

public class Ruas {
    ArrayList<Rua> ruas = new ArrayList<Rua>();

    public Ruas(int t, Canvas cv) {
        for (int x = 0; x <= t; x++) {
            for (int y = 0; y < t; y++) {
                ruas.add(new Rua(x, y, x, y + 1,cv));
            }
        }

        for (int x = 0; x < t; x++) {
            for (int y = 0; y <= t; y++) {
                ruas.add(new Rua(x, y, x + 1, y,cv));
            }
        }
    }

    public Rua getRua(int xi, int yi, int xf, int yf) {
        for (Rua elemento : ruas) {
            if (((elemento.get_Xi() == xi) && (elemento.get_Xf() == xf) &&
                    (elemento.get_Yi() == yi) && (elemento.get_Yf() == yf)) ||
                    ((elemento.get_Xi() == xf) && (elemento.get_Xf() == xi) &&
                            (elemento.get_Yi() == yf) && (elemento.get_Yf() == yi))) {
                return elemento;
            }

        }
        System.out.print("null\n ");
        return null;
    }

}
