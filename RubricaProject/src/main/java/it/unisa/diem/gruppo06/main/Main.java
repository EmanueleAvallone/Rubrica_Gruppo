package it.unisa.diem.gruppo06.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * @brief Classe principale per l'applicazione JavaFX
 *
 * Questa classe avvia l'applicazione JavaFX, gestisce la scena principale 
 * e implementa il ridimensionamento per mantenere le proporzioni 
 * dell'interfaccia utente al variare delle dimensioni della finestra
 */

public class Main extends Application {

    /* @brief Scena principale dell'applicazione */
    private static Scene scene;

    /**
     * @brief Metodo di avvio dell'applicazione JavaFX
     *
     * Inizializza la scena principale, applica il layout di base e aggiunge una trasformazione
     * di scala e gestisce il ridimensionamento proporzionale
     *
     * @param[in] stage Lo stage principale dell'applicazione.
     * @throws IOException Se il file FXML specificato non può essere caricato.
     */
    
    @Override
    public void start(Stage stage) throws IOException {
       
    }

     /**
     * @brief Cambia la root della scena principale
     *
     * Consente di cambiare la vista caricando un file FXML
     *
     * @param[in] fxml Nome del file FXML da caricare
     * @throws IOException Se si verifica un errore durante il caricamento del file FXML
     *
     * @post La root della scena principale sarà sostituita dal contenuto del nuovo file FXML
     */
    public static void setRoot(String fxml) throws IOException {
        
    }

     /**
     * @brief Metodo principale per avviare l'applicazione
     *
     * @param[in] args Argomenti della linea di comando
     * @post L'applicazione sarà avviata e verrà visualizzata la scena principale
     */

    public static void main(String[] args) {
        
    }

}