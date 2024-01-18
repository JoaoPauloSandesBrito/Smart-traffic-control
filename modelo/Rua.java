package modelo;

import java.util.concurrent.Semaphore;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;

public class Rua {
    int Xi, Xf, Yi, Yf;
    boolean disponivel = true;

    Semaphore mutex = new Semaphore(1);
    GraphicsContext gc;

    public Rua(int xi, int yi, int xf, int yf, Canvas cv) {
        this.Xi = xi;
        this.Yi = yi;
        this.Xf = xf;
        this.Yf = yf;
        gc = cv.getGraphicsContext2D();
    }

    public void entrarRua() throws Exception {
        mutex.acquire();
        disponivel = false;
    }

    public void sairRua() {
        mutex.release();
        disponivel = true;
    }

    public int get_Xi() {
        return Xi;
    }

    public int get_Yi() {
        return Yi;
    }

    public int get_Xf() {
        return Xf;
    }

    public int get_Yf() {
        return Yf;
    }
}