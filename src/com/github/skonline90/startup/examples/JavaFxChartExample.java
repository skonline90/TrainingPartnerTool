package com.github.skonline90.startup.examples;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Gutes Tutorial:
 * https://www.tutorialspoint.com/javafx/line_chart.htm
 *
 * @author skonline90
 * @version 16.10.2019
 */
public class JavaFxChartExample extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        StackPane root = new StackPane();
        //Defining X axis  
        NumberAxis xAxis = new NumberAxis(1960, 2020, 10);
        xAxis.setLabel("Years");

        //Defining y axis 
        NumberAxis yAxis = new NumberAxis(0, 350, 50);
        yAxis.setLabel("Number of Noobs");

        LineChart<Number, Number> linechart = new LineChart<Number, Number>(
                xAxis, yAxis);
        XYChart.Series<Number, Number> series = new XYChart.Series<Number, Number>();
        series.setName("No of schools in an year");

        series.getData()
            .add(new XYChart.Data<Number, Number>(1970, 15));
        series.getData()
            .add(new XYChart.Data<Number, Number>(1980, 30));
        series.getData()
            .add(new XYChart.Data<Number, Number>(1990, 60));
        series.getData()
            .add(new XYChart.Data<Number, Number>(2000, 120));
        series.getData()
            .add(new XYChart.Data<Number, Number>(2013, 240));
        series.getData()
            .add(new XYChart.Data<Number, Number>(2014, 300));

        linechart.getData()
            .add(series);

        root.getChildren()
            .add(linechart);
        configureAndShow(primaryStage, root);
    }

    private void configureAndShow(Stage primaryStage, StackPane root)
    {
        primaryStage.setTitle("Line Chart Example");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
