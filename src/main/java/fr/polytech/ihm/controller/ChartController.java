package fr.polytech.ihm.controller;

/**
 * Created by Campo on 12/03/2017.
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class ChartController implements Initializable{
    final static String first = "9 - 11";
    final static String second = "11 - 13";
    final static String third = "13 - 15";
    final static String fourth = "15 - 17";
    final static String fifth = "17 - 19";

    @FXML private BarChart<?,?> chart ;
    @FXML private CategoryAxis x;
    @FXML private NumberAxis y;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chart.setTitle("Heures d'affluence");
        x.setLabel("Heures");
        y.setLabel("Affluence");

        XYChart.Series lundi = new XYChart.Series<>();
        lundi.setName("Lundi");
        lundi.getData().add(new XYChart.Data(first, 25));
        lundi.getData().add(new XYChart.Data(second, 20));
        lundi.getData().add(new XYChart.Data(third, 10));
        lundi.getData().add(new XYChart.Data(fourth, 35));
        lundi.getData().add(new XYChart.Data(fifth, 12));

        XYChart.Series mardi = new XYChart.Series<>();
        mardi.setName("Mardi");
        mardi.getData().add(new XYChart.Data(first, 24));
        mardi.getData().add(new XYChart.Data(second, 30));
        mardi.getData().add(new XYChart.Data(third, 30));
        mardi.getData().add(new XYChart.Data(fourth, 37));
        mardi.getData().add(new XYChart.Data(fifth, 15));

        XYChart.Series mercredi = new XYChart.Series<>();
        mercredi.setName("Mercredi");
        mercredi.getData().add(new XYChart.Data(first, 25));
        mercredi.getData().add(new XYChart.Data(second, 20));
        mercredi.getData().add(new XYChart.Data(third, 10));
        mercredi.getData().add(new XYChart.Data(fourth, 35));
        mercredi.getData().add(new XYChart.Data(fifth, 12));

        XYChart.Series jeudi = new XYChart.Series<>();
        jeudi.setName("Jeudi");
        jeudi.getData().add(new XYChart.Data(first, 25));
        jeudi.getData().add(new XYChart.Data(second, 20));
        jeudi.getData().add(new XYChart.Data(third, 10));
        jeudi.getData().add(new XYChart.Data(fourth, 35));
        jeudi.getData().add(new XYChart.Data(fifth, 12));

        XYChart.Series vendredi = new XYChart.Series<>();
        vendredi.setName("Vendredi");
        vendredi.getData().add(new XYChart.Data(first, 15));
        vendredi.getData().add(new XYChart.Data(second, 10));
        vendredi.getData().add(new XYChart.Data(third, 15));
        vendredi.getData().add(new XYChart.Data(fourth, 35));
        vendredi.getData().add(new XYChart.Data(fifth, 27));

        XYChart.Series samedi = new XYChart.Series<>();
        samedi.setName("Samedi");
        samedi.getData().add(new XYChart.Data(first, 15));
        samedi.getData().add(new XYChart.Data(second, 25));
        samedi.getData().add(new XYChart.Data(third, 0));
        samedi.getData().add(new XYChart.Data(fourth, 0));
        samedi.getData().add(new XYChart.Data(fifth, 0));

        chart.getData().addAll(lundi, mardi, mercredi, jeudi, vendredi, samedi);

    }
}
