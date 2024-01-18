/* ***************************************************************
* Autor............: JOAO PAULO SANDES BRITO
* Matricula........: 202110811
* Inicio...........: Desconhecido
* Ultima alteracao.: 18/01/2024
* Nome.............: PRINCIPAL.java
* Funcao...........: Simulacao de semafaros para ruas de transito de veiculos
*************************************************************** */

package visao;

import modelo.Ruas;
import controle.Carro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import modelo.Trajeto;
import java.util.Random;

public class Principal extends Application {
    Ruas SSA;
    Random random = new Random();

    // Configurar o layout principal
    Canvas canvas = new Canvas(700, 700);
    BorderPane root = new BorderPane();
    VBox menu = new VBox();

    Trajeto percurso02 = new Trajeto(0, 0).get_percurso02();
    Trajeto percurso05 = new Trajeto(0, 0).get_percurso05();
    Trajeto percurso12 = new Trajeto(0, 0).get_percurso12();
    Trajeto percurso08 = new Trajeto(0, 0).get_percurso08();
    Trajeto percurso18A = new Trajeto(0, 0).get_percurso18A();
    Trajeto percurso13 = new Trajeto(0, 0).get_percurso13();
    Trajeto percurso21A = new Trajeto(0, 0).get_percurso21A();
    Trajeto percurso22A = new Trajeto(0, 0).get_percurso22A();

    public void start(Stage primaryStage) {
        Image city = new Image("visao/cidade.png");
        ImageView cityImageView = new ImageView(city);

        cityImageView.setFitWidth(700); // Ajustar a largura da imagem
        cityImageView.setPreserveRatio(true); // Manter a proporção da imagem
        root.getChildren().add(cityImageView);
        SSA = new Ruas(5, canvas);
        root.setCenter(canvas);
        root.setRight(menu);

        // Configurar a cena
        Scene scene = new Scene(root, 900, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("App controle de Transito");

        Carro carro01 = new Carro(percurso02, "P02", root, menu, SSA);
        Carro carro02 = new Carro(percurso05, "P05", root, menu, SSA);
        Carro carro03 = new Carro(percurso12, "P12", root, menu, SSA);
        Carro carro04 = new Carro(percurso08, "P08", root, menu, SSA);
        Carro carro05 = new Carro(percurso18A, "P18A", root, menu, SSA);
        Carro carro06 = new Carro(percurso13, "P13", root, menu, SSA);
        Carro carro07 = new Carro(percurso21A, "P21A", root, menu, SSA);
        Carro carro08 = new Carro(percurso22A, "P22A", root, menu, SSA);

        carro04.start();
        carro05.start();
        carro06.start();
        carro01.start();
        carro02.start();
        carro03.start();
        carro07.start();
        carro08.start();

        // Exibir a janela
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
