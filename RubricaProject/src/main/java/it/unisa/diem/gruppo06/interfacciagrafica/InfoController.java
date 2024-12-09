package it.unisa.diem.gruppo06.interfacciagrafica;

import it.unisa.diem.gruppo06.main.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * @brief Classe che gestisce l'interfaccia secondaria visualizzata dall'utente
 * 
 * La classe 'InfoController' gestisce le azioni associate ad i tasti
 * presenti nella scena secondaria. 
 * Questa scena consente di visualizzare i dettagli di un contatto 
 * selezionato dalla rubrica, offrendo la possibilità di modificare
 * i dati esistenti o, in alternativa, compilare i campi vuoti per
 * aggiungere un nuovo contatto,
 * 
 */
public class InfoController implements Initializable{

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
    
    /**
    * @brief Inizializza il controller
    * 
    * Il metodo inizializza tutti gli attributi del controller
    * 
    * @param[in] url Percorso del file FXML associato al controller
    * @param[in] rb Collezione di risorse localizzate per l'applicazione
    * 
    */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}