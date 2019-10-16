package com.github.skonline90.startup.examples;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Beispiel Klasse fuer Java FX. Es wird ein simples
 * Fenster mit einem Knopf erzeugt. Drueckt man auf
 * den Knopf, so wird 'Hello World!' auf der Konsole
 * ausgegeben.
 *
 * @author skonline90
 * @version 12.10.2019
 */
public class JavaFxExample extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>()
        {

            @Override
            public void handle(ActionEvent event)
            {
                System.out.println("Hello World!");
            }
        });

        StackPane root = new StackPane();
        root.getChildren()
            .add(btn);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}