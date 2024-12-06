package it.unisa.diem.gruppo06.interfacciagrafica;

import it.unisa.diem.gruppo06.gestionecontatti.Contatto;
import it.unisa.diem.gruppo06.gestionecontatti.InterfacciaRubrica;
import it.unisa.diem.gruppo06.gestionecontatti.Rubrica;
import it.unisa.diem.gruppo06.gestionefile.FileManager;
import it.unisa.diem.gruppo06.main.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * @brief Classe che gestisce l'interfaccia principale visualizzata dall'utente
 * 
 * La classe 'RubricaController' gestisce le azioni associate ad i tasti
 * che può premere l'utente nella scena principale, che mostra la lista 
 * di contatti presenti in rubrica e consente di effettuare le operazioni previste 
 * su quest'ultima
 * 
 * 
 * 
 *
 */
public class RubricaController implements Initializable{

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

    private FileManager fileManager;
    
    private ObservableList<Contatto> contatti;
    
    private static InterfacciaRubrica rubrica = new Rubrica();
   

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
    
   /**
    * @brief Restituisce l'attributo statico 'rubrica'
    * 
    * @return Oggetto di tipo InterfacciaRubrica contenente la lista dei contatti
    * 
    * 
    */
    public static InterfacciaRubrica getRubrica(){
        return null;
    }

    /**
    * @brief Inizializza il controller
    * 
    * Il metodo inizializza tutti gli attributi (non statici) del controller
    * istanziando una ObservableArrayList ed un FileManager, inoltre
    * costruisce la TableView che conterrà le informazioni di ogni contatto
    * 
    * @param[in] url Percorso del file FXML associato al controller
    * @param[in] rb Collezione di risorse localizzate per l'applicazione
    * 
    * @post
    * La TableView è stata costruita correttamente
    * @post
    * Gli attributi non statici sono stati correttamente inizializzati
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
