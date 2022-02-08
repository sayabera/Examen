/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajofinal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineJoin;
import javafx.stage.Stage;

/**
 *
 * @author Alumno
 */
public class TrabajoFinal extends Application {

    Image estadistica, retiro, saldo, ingresos, transferencia;
    Image logo, relleno;
    ImageView vistaEstadistica, vistaRetiro, vistaSaldo, vistaTransferencia;
    ImageView vistaLogo, vistaRelleno;
    Button btnAcceder;
    BorderPane bPane = new BorderPane();
    Pane panelLogin = new Pane();
    Label lbUsuario;
    TextField tfUsuario;
    Label lbPsw;
    TextField tfPsw;
    Label errorUsuario = new Label("usuario incorrecto");
    Label errorPsw = new Label("contraseña erronea");

    @Override
    public void start(Stage primaryStage) {

        btnAcceder = new Button();
        btnAcceder.setText("ACCEDER");

        btnAcceder.setLayoutX(90);
        btnAcceder.setLayoutY(230);

        lbUsuario = new Label("Usuario: ");
        lbUsuario.setLayoutX(50);
        lbUsuario.setLayoutY(70);

        tfUsuario = new TextField();
        tfUsuario.setLayoutX(50);
        tfUsuario.setLayoutY(90);

        lbPsw = new Label("Contraseña: ");
        lbPsw.setLayoutX(50);
        lbPsw.setLayoutY(150);

        tfPsw = new TextField();
        tfPsw.setLayoutX(50);
        tfPsw.setLayoutY(170);

        panelLogin.getChildren().addAll(lbUsuario, lbPsw, tfUsuario, tfPsw, btnAcceder);
        bPane.setCenter(panelLogin);

        btnAcceder.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                if (tfUsuario.getText().equals("Patata")) {

                    if (tfPsw.getText().equals( "Tomate")) {

                        StackPane root1 = new StackPane();
                        Scene scene = new Scene(root1, 600, 400);
                        primaryStage.setTitle("MI CUENTA");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    } else {
                        StackPane root2 = new StackPane();
                        root2.getChildren().addAll(errorPsw);
                        Scene scene = new Scene(root2, 300, 300);
                        primaryStage.setTitle("FALLO");
                        primaryStage.setScene(scene);
                        primaryStage.show();
                    }
                } else {
                    StackPane root3 = new StackPane();
                    root3.getChildren().addAll(errorUsuario);
                    Scene scene = new Scene(root3, 300, 300);
                    primaryStage.setTitle("FALLO");
                    primaryStage.setScene(scene);
                    primaryStage.show();
                }

            }
        });

        logo = new Image(getClass().getResourceAsStream("/resources/logo.jpg"));
        vistaLogo = new ImageView(logo);
        bPane.setTop(vistaLogo);

        relleno = new Image(getClass().getResourceAsStream("/resources/relleno.png"));
        vistaRelleno = new ImageView(relleno);
        bPane.setLeft(vistaRelleno);

        Scene scene = new Scene(bPane, 600, 400);

        primaryStage.setTitle("BANCO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
