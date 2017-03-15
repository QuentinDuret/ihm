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
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ChartController implements Initializable{
    private String first = "9 - 11";
    private String second = "11 - 13";
    private String third = "13 - 15";
    private String fourth = "15 - 17";
    private String fifth = "17 - 19";

    @FXML private BarChart<?,?> chart ;
    @FXML private CategoryAxis x;
    @FXML private NumberAxis y;

    @FXML private Button lundiButton;
    @FXML private Button mardiButton;
    @FXML private Button mercrediButton;
    @FXML private Button jeudiButton;
    @FXML private Button vendrediButton;
    @FXML private Button samediButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        createChar("lundi");
    }

    public void lundi(){
        createChar("lundi");
    }

    public void mardi(){
        createChar("mardi");
    }

    public void mercredi(){
        createChar("mercredi");
    }

    public void jeudi(){
        createChar("jeudi");
    }

    public void vendredi(){
        createChar("vendredi");
    }

    public void samedi(){
        createChar("samedi");
    }

    public void createChar(String day){
        chart.setTitle("Heures d'affluence");
        x.setLabel("Heures");
        y.setLabel("Affluence");

        switch (day){
            case "lundi" :
                XYChart.Series lundi = new XYChart.Series<>();
                chart(lundi,day, 20, 35, 25, 15, 2);
                break;
            case "mardi" :
                XYChart.Series mardi = new XYChart.Series<>();
                chart(mardi,day,12,15,23,5,6);
                break;
            case "mercredi" :
                XYChart.Series mercredi = new XYChart.Series<>();
                chart(mercredi,day,5,23,15,20,2);
                break;

            case "jeudi" :
                XYChart.Series jeudi = new XYChart.Series<>();
                chart(jeudi,day,26,4,15,26,23);
                break;

            case "vendredi" :
                XYChart.Series vendredi = new XYChart.Series<>();
                chart(vendredi,day,20,12,15,25,3);
                break;

            case "samedi" :
                XYChart.Series samedi = new XYChart.Series<>();
                chart(samedi,day,15,30,0,0,0);
                break;
        }
    }

    public void chart(XYChart.Series name, String day, int m, int n, int o, int p, int q){
        name.setName(day);
        name.getData().add(new XYChart.Data(first, m));
        name.getData().add(new XYChart.Data(second, n));
        name.getData().add(new XYChart.Data(third, o));
        name.getData().add(new XYChart.Data(fourth, p));
        name.getData().add(new XYChart.Data(fifth, q));
        chart.getData().clear();
        chart.getData().addAll(name);
    }
}
