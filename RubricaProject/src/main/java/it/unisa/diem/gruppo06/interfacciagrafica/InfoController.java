package it.unisa.diem.gruppo06.interfacciagrafica;

import it.unisa.diem.gruppo06.gestionecontatti.Contatto;
import it.unisa.diem.gruppo06.gestionecontatti.InterfacciaRubrica;
import it.unisa.diem.gruppo06.main.Main;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

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
    private VBox textContainer;
    @FXML
    private Label numero1;
    @FXML
    private Label numero2;
    @FXML
    private Label numero3;
    @FXML
    private Label email3;
    @FXML
    private Label email1;
    @FXML
    private Label email2;
    
    private Contatto contattoDaModificare = null;
   

    
     /**
    * @brief Inizializza il controller
    * 
    * Il metodo inizializza i bindigns tra i pulsanti e i TextField.
    * 
    * @param[in] url Percorso del file FXML associato al controller
    * @param[in] rb Collezione di risorse localizzate per l'applicazione
    * 
    */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       initBindings();
    }
    
    @FXML
    private void annullaBtn(ActionEvent event) throws IOException {  
        if(contattoDaModificare!=null){
           Alert alert = createAlert(AlertType.CONFIRMATION, 
                   "Annullamento operazione", null, 
                   "Sei sicuro di voler annullare l'operazione? Le modifiche fatte andranno perse.");
           Optional<ButtonType> result = alert.showAndWait();
           if(result.get()==ButtonType.OK)
                Main.setRoot("FirstViewDownBW"); 
        }else{
            Main.setRoot("FirstViewDownBW");
        }
    }
    
    @FXML
    private void salvaInfoBtn(ActionEvent event) throws IOException {
        InterfacciaRubrica r;
        r=RubricaController.getRubrica();
        
        String[] numeri = new String[3];     
        numeri[0]=numeroField1.getText();
        numeri[1]=numeroField2.getText();
        numeri[2]=numeroField3.getText();
        
        if(controlloNumeri(numeri))
            return;
    
    
        String[] emails = new String[3];
        emails[0]=emailField1.getText();
        emails[1]=emailField2.getText();
        emails[2]=emailField3.getText();
        if(controlloEmails(emails)) 
            return;
        
         if (contattoDaModificare == null) {
            // Creazione di un nuovo contatto
            Contatto nuovoContatto = new Contatto(nomeField.getText(), cognomeField.getText(), numeri, emails);
            r.creaContatto(nuovoContatto); // Metodo per aggiungere il contatto
        } else {
            // Modifica del contatto esistente
           Contatto contattoModificato = new Contatto(nomeField.getText(), cognomeField.getText(), numeri, emails);
           r.modificaContatto(contattoDaModificare, contattoModificato);
        }
             
        Main.setRoot("FirstViewDownBW");
    }
    
    
    protected void setField(Contatto c1,boolean editable){
        assert c1 != null : "La variabile c non deve essere null!";
        
        if(!editable){//caso di visualizzazione info
            disableAllTextFields(textContainer);
            salva.disableProperty().unbind();
            salva.setDisable(true);
            setFieldContent(c1);
        }else{//caso in cui voglio modificare
            contattoDaModificare=c1;
            setFieldContent(c1);
        }
    }
    
    
    private void disableAllTextFields(Parent parent) {
        for (Node node : parent.getChildrenUnmodifiable()) {
            if (node instanceof TextField) {
                ((TextField)node).setEditable(false);
            } else if (node instanceof Parent) {
                // Chiamata ricorsiva per gestire layout annidati
                disableAllTextFields((Parent) node);
            }
        }
    }
    
    
    private void setFieldContent(Contatto c){      
        nomeField.setText(c.getNome());
        cognomeField.setText(c.getCognome());
        
        numeroField1.setText(c.getNumeriTelefono()[0]);  
        numeroField2.setText(c.getNumeriTelefono()[1]);
        numeroField3.setText(c.getNumeriTelefono()[2]);
        
        emailField1.setText(c.getEmails()[0]); 
        emailField2.setText(c.getEmails()[1]);     
        emailField3.setText(c.getEmails()[2]);    
    }
    
    
    private void initBindings(){
        salva.disableProperty().bind(Bindings.and(nomeField.textProperty().isEmpty(), cognomeField.textProperty().isEmpty()));
        numeroField2.visibleProperty().bind((Bindings.isNotEmpty(numeroField1.textProperty())));
        numero2.visibleProperty().bind(Bindings.and(numeroField2.textProperty().isNotEmpty(), numeroField1.textProperty().isNotEmpty()));
        
        numeroField3.visibleProperty().bind(Bindings.and(numeroField2.textProperty().isNotEmpty(), numeroField1.textProperty().isNotEmpty()));
        numero3.visibleProperty().bind((Bindings.and(numero2.visibleProperty(), numeroField3.textProperty().isNotEmpty())));
        
        emailField2.visibleProperty().bind((Bindings.isNotEmpty(emailField1.textProperty())));
        email2.visibleProperty().bind(Bindings.and(emailField2.textProperty().isNotEmpty(), emailField1.textProperty().isNotEmpty()));
        
        emailField3.visibleProperty().bind(Bindings.and(emailField2.textProperty().isNotEmpty(), emailField1.textProperty().isNotEmpty()));
        email3.visibleProperty().bind((Bindings.and(email2.visibleProperty(), emailField3.textProperty().isNotEmpty())));
    }
    
    private boolean controlloNumeri(String[] numeri){
        for(String numero : numeri) {
            for(int i=0;i<numero.length();i++){// Controlla che siano solo numeri
                if(Character.isLetter(numero.charAt(i))){
                    Alert alert = createAlert(AlertType.ERROR, "Errore", 
                            "Input non valido", 
                            "I campi del numero devono contenere solo cifre.");
                    alert.showAndWait();
                    return true; // Interrompe l'esecuzione se c'è un errore
                }
            }
        }
    return false;
    }
    

    private boolean controlloEmails(String[] emails){
        for(String email : emails){
            if((!email.isEmpty() && (!(email.contains("@")) || !(email.contains("."))))){
                Alert alert = createAlert(AlertType.ERROR, 
                        "Errore", "Input non valido", 
                        "I campi devono contenere delle email in formato valido.");
                alert.showAndWait();
                return true;
            }
        }
    return false;
    }

    @FXML
    private void numero1KeyReleased(KeyEvent event) {
        if (numeroField1.getText().equals("")) {
                numeroField1.setText(numeroField2.getText());
                numeroField2.setText("");
            }
        numero2KeyReleased(event);
    }

    @FXML
    private void numero2KeyReleased(KeyEvent event) {
        if (numeroField2.getText().equals("")) {
                numeroField2.setText(numeroField3.getText());
                numeroField3.setText("");
            }
    }

    @FXML
    private void email1KeyReleased(KeyEvent event) {
        if (emailField1.getText().equals("")) {
                emailField1.setText(emailField2.getText());
                emailField2.setText("");
            }
        email2KeyReleased(event);
    }

    @FXML
    private void email2KeyReleased(KeyEvent event) {
        if (emailField2.getText().equals("")) {
                emailField2.setText(emailField3.getText());
                emailField3.setText("");
            }
    }
    
    private Alert createAlert(AlertType type,String title, String headerText, String contentText){
        Alert a = new Alert(type);
        a.setTitle(title);
        a.setHeaderText(headerText);
        a.setContentText(contentText);
        return a;
    }
}
