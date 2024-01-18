package controle;

import modelo.Coordenada;
import modelo.Rua;
import modelo.Ruas;
import modelo.Trajeto;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import java.util.Random;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Carro extends Thread {
    Random random = new Random();
    Trajeto caminho;
    int tPLUS = random.nextInt(100);
    long tempo = 500 + tPLUS;
    boolean primeiraExecucao = true;
    String nome;
    int proporcao = 100;
    int borda = 100;
    Image carroImage = new Image("controle/car.png");
    ImageView carroImageView = new ImageView(carroImage);
    Ruas ruasPorOndeAndar;

    public Carro(Trajeto T, String Nome, BorderPane root,VBox menu, Ruas ruas) {
        this.caminho = T;
        this.nome = Nome;
        ruasPorOndeAndar = ruas;
        carroImageView.setFitWidth(40); // Ajustar a largura da imagem
        carroImageView.setPreserveRatio(true); // Manter a proporção da imagem
        root.getChildren().add(carroImageView);
        carroImageView.setLayoutX(borda - 20);
        carroImageView.setLayoutY(borda - 20);

        Slider slider = new Slider();
        slider.setMin(1);
        slider.setMax(100);
        slider.setValue(50);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        
        Label label = new Label(nome+ ": ");
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            label.setText(nome+ ": " + newValue.intValue());
            tempo = (1000/newValue.intValue())*10+ tPLUS;
        });

        menu.getChildren().addAll(label,slider);
        menu.setPadding(new Insets(30));
        menu.setSpacing(10);

    }

    public void run() {

        int ti = random.nextInt(50);
        try {
            sleep(ti);
        } catch (Exception e) {
            e.printStackTrace();
        }

        TranslateTransition transition = new TranslateTransition(Duration.millis(tempo), carroImageView);

        while (true) {
            for (int p = 0; p < caminho.get_size() - 1; p++) {
                if (primeiraExecucao == true) {
                    int rand = random.nextInt(caminho.get_size() - 1);
                    p = p + rand;
                    primeiraExecucao = false;
                }

                Coordenada coordenadaAtual = caminho.get_cordenada(p);
                Coordenada coordenadaProxima = caminho.get_cordenada(p + 1);

                Rua atual = ruasPorOndeAndar.getRua(coordenadaAtual.get_X(), coordenadaAtual.get_Y(), coordenadaProxima.get_X(),
                        coordenadaProxima.get_Y());

                try {
                    atual.entrarRua();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                transition.setFromX(coordenadaAtual.get_X() * proporcao);
                transition.setFromY(coordenadaAtual.get_Y() * proporcao);
                transition.setToX(coordenadaProxima.get_X() * proporcao);
                transition.setToY(coordenadaProxima.get_Y() * proporcao);
                transition.setDuration(Duration.millis(tempo));

                // Iniciar a transição
                transition.play();

                // Aguardar até que a transição seja concluída
                try {
                    Thread.sleep(tempo);
                    transition.stop();
                    atual.sairRua();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}