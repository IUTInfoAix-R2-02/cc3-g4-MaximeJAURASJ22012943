package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    //private XYChart.Series<String, Number> dataSeries1 = new XYChart.Series<>();
    @FXML
    private Pane toile;

    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private GridPane gridPane;
    @FXML
    private VBox vbox;

    @FXML
    private Button Tracer;
    @FXML
    private Button Vider;

    @FXML
    private TextField Entree1;
    @FXML
    private TextField Entree2;
    @FXML
    private TextField Entree3;
    @FXML
    private TextField Entree4;
    @FXML
    private TextField Entree5;
    @FXML
    private TextField Entree6;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vbox.getChildren().addAll(label1,label2);
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
    @FXML
    private void ajouter() {
        if (Entree1.getLength() != 0){
            if (Integer.parseInt(Entree1.getText()) > noteMaximale ){
                label1.setText("Erreur de saisie");
                label2.setText("Les valeurs doivent être compris entre 0 et 20");
            }
        }
        if (Entree2.getLength() != 0){
            if (Integer.parseInt(Entree2.getText()) > noteMaximale ){
                label1.setText("Erreur de saisie");
                label2.setText("Les valeurs doivent être compris entre 0 et 20");
            }
        }
        if (Entree3.getLength() != 0){
            if (Integer.parseInt(Entree3.getText()) > noteMaximale ){
                label1.setText("Erreur de saisie");
                label2.setText("Les valeurs doivent être compris entre 0 et 20");
            }
        }
        if (Entree4.getLength() != 0){
            if (Integer.parseInt(Entree4.getText()) > noteMaximale ){
                label1.setText("Erreur de saisie");
                label2.setText("Les valeurs doivent être compris entre 0 et 20");
            }
        }
        if (Entree5.getLength() != 0){
            if (Integer.parseInt(Entree5.getText()) > noteMaximale ){
                label1.setText("Erreur de saisie");
                label2.setText("Les valeurs doivent être compris entre 0 et 20");
            }
        }
        if (Entree6.getLength() != 0){
            if (Integer.parseInt(Entree6.getText()) > noteMaximale ){
                label1.setText("Erreur de saisie");
                label2.setText("Les valeurs doivent être compris entre 0 et 20");
            }
        }
    }

    @FXML
    private void vider(){
        label1.setText("");
        label2.setText("");
    }
}
