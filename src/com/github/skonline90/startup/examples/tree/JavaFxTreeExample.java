package com.github.skonline90.startup.examples.tree;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Tutorial https://docs.oracle.com/javafx/2/ui_controls/tree-view.htm
 *
 * @author skonline90
 * @version 17.10.2019
 */
public class JavaFxTreeExample extends Application
{
    private TreeItem<String> rootItem = new TreeItem<String>("Kraftübungen");
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Tree Example");
        Button btnNext = new Button("=>");
        Button btnPrevious = new Button("<=");
        Button btnAdd = new Button(" + ");

        VBox root = new VBox();
        HBox box1 = new HBox();
        box1.setSpacing(10);
        box1.getChildren()
            .addAll(btnPrevious, btnNext, btnAdd);
        // Tree 1
        rootItem = new TreeItem<String>("Kraftübungen");
        rootItem.setExpanded(true);
        for (int i = 1; i < 6; i++)
        {
            TreeItem<String> item = new TreeItem<String>("Übung " + i);
            rootItem.getChildren()
                .add(item);
        }
        TreeView<String> tree = new TreeView<String>(rootItem);
        btnAdd.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent event)
            {
                int treeSize = rootItem.getChildren().size();
                System.out.println(treeSize);
                String lastElementText = rootItem.getChildren()
                    .get(treeSize - 1).getValue();
                int lastNumber = Integer.parseInt(lastElementText.split(" ")[1]);
                TreeItem<String> item = new TreeItem<String>("Übung " + (lastNumber + 1));
                rootItem.getChildren().add(item);
            }
        });

        // Tree 2
        root.getChildren()
            .addAll(tree, box1);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
