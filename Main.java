package sample;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        for (int i = 0; i < 3; i++) {

            for (int w = 0; w < 3; w++) {
                pane.add(new Button(Integer.toString(numberss())), i, w);

             
            }

        }
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowGridPane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public int numberss() {
        int x = (int) (Math.random() * 9 + 1);

        return x;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
