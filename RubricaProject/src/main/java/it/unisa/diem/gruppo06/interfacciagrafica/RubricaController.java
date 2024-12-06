package it.unisa.diem.gruppo06.interfacciagrafica;

import it.unisa.diem.gruppo06.gestionecontatti.Contatto;
import it.unisa.diem.gruppo06.main.Main;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RubricaController {

    @FXML
    private TableView<Contatto> table1;
    @FXML
    private TableColumn<Contatto, String> cognomiClm;
    @FXML
    private TableColumn<Contatto, String> nomiClm;
    @FXML
    private TableColumn<Contatto, String> telefoniClm;
    @FXML
    private TableColumn<Contatto, String> emailClm;
    @FXML
    private TextField ricercaField;
    @FXML
    private MenuItem salvaBtn;
    @FXML
    private MenuItem caricaBtn;
    @FXML
    private Button cercaBtn;
    @FXML
    private Button creaBtn;
    @FXML
    private Button infoBtn;
    @FXML
    private Button eliminaBtn;
    @FXML
    private Button modificaBtn;

   

    @FXML
    private void salvaRubricaBtn(ActionEvent event) {
    }

    @FXML
    private void caricaRubricaBtn(ActionEvent event) {
    }

    @FXML
    private void cercaContattoBtn(ActionEvent event) {
    }

    @FXML
    private void creaContattoBtn(ActionEvent event) {
    }

    @FXML
    private void visualizzaInfoBtn(ActionEvent event) {
    }

    @FXML
    private void eliminaContattoBtn(ActionEvent event) {
    }

    @FXML
    private void modificaContattoBtn(ActionEvent event) {
    }
}
