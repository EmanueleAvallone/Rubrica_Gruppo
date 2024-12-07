package it.unisa.diem.gruppo06.interfacciagrafica;

import it.unisa.diem.gruppo06.main.Main;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @brief Classe che gestisce l'interfaccia principale visualizzata dall'utente
 * 
 * La classe 'InfoController' gestisce le azioni associate ad i tasti
 * che può premere l'utente nella scena secondaria. 
 * Questa scena consente di visualizzare i dettagli di un contatto 
 * selezionato dalla rubrica, offrendo la possibilità di modificare
 * i dati esistenti o, in alternativa, compilare i campi vuoti qualora
 * l'utente abbia precedentemente scelto di aggiungere un nuovo contatto,
 * 
 */
public class InfoController {

    @FXML
    private Button annulla;
    @FXML
    private TextField nomeField;
    @FXML
    private TextField cognomeField;
    @FXML
    private TextField numeroField1;
    @FXML
    private TextField numeroField2;
    @FXML
    private TextField numeroField3;
    @FXML
    private TextField emailField1;
    @FXML
    private TextField emailField2;
    @FXML
    private TextField emailField3;
    @FXML
    private Button salva;

   

    @FXML
    private void annullaBtn(ActionEvent event) {
    }

    @FXML
    private void salvaInfoBtn(ActionEvent event) {
    }
}