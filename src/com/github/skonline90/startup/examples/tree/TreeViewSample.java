package com.github.skonline90.startup.examples.tree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TreeViewSample extends Application
{
    List<Employee> employees = Arrays.<Employee> asList(
            new Employee("Ethan Williams", "Sales Department"),
            new Employee("Emma Jones", "Sales Department"),
            new Employee("Michael Brown", "Sales Department"),
            new Employee("Anna Black", "Sales Department"),
            new Employee("Rodger York", "Sales Department"),
            new Employee("Susan Collins", "Sales Department"),
            new Employee("Mike Graham", "IT Support"),
            new Employee("Judy Mayer", "IT Support"),
            new Employee("Gregory Smith", "IT Support"),
            new Employee("Jacob Smith", "Accounts Department"),
            new Employee("Isabella Johnson", "Accounts Department"));
    ImageIcon img = new ImageIcon(System.getProperty("user.dir")
            + "/resources/images/icons/icon_strength_50x50.png");
    String s = File.separator;
    TreeItem<String> rootNode = new TreeItem<String>(
            "MyCompany Human Resources");

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        rootNode.setExpanded(true);
        Image image;
        try
        {
            String s = File.separator;
            String userDir = System.getProperty("user.dir");
            // Absoluter Path
            //            image = new Image(new FileInputStream(
            //                    "C:\\Users\\student\\eclipse-workspace\\TrainingPartnerTool\\"
            //                    + "resources\\images\\icons\\icon_strength_50x50.png"));

            // Relativer Path
            image = new Image(new FileInputStream(userDir + s + "resources" + s
                    + "images" + s + "icons" + s + "icon_strength_50x50.png"));
            ImageView iv = new ImageView(image);
            iv.setFitHeight(16);
            iv.setFitWidth(16);
            rootNode.setGraphic(iv);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        for (Employee employee : employees)
        {
            TreeItem<String> empLeaf = new TreeItem<String>(employee.getName());
            boolean found = false;
            for (TreeItem<String> depNode : rootNode.getChildren())
            {
                if (depNode.getValue()
                    .contentEquals(employee.getDepartment()))
                {
                    depNode.getChildren()
                        .add(empLeaf);
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                TreeItem<String> depNode = new TreeItem<String>(
                        employee.getDepartment());
                rootNode.getChildren()
                    .add(depNode);
                depNode.getChildren()
                    .add(empLeaf);
            }
        }

        stage.setTitle("Tree View Sample");
        VBox box = new VBox();
        final Scene scene = new Scene(box, 400, 300);
        scene.setFill(Color.LIGHTGRAY);

        TreeView<String> treeView = new TreeView<String>(rootNode);

        box.getChildren()
            .add(treeView);
        stage.setScene(scene);
        stage.show();
    }

    public static class Employee
    {

        private final SimpleStringProperty name;
        private final SimpleStringProperty department;

        private Employee(String name, String department)
        {
            this.name = new SimpleStringProperty(name);
            this.department = new SimpleStringProperty(department);
        }

        public String getName()
        {
            return name.get();
        }

        public void setName(String fName)
        {
            name.set(fName);
        }

        public String getDepartment()
        {
            return department.get();
        }

        public void setDepartment(String fName)
        {
            department.set(fName);
        }
    }
}
