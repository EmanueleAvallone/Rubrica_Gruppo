package it.unisa.diem.gruppo06.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * @brief Classe principale per l'applicazione JavaFX
 *
 * Questa classe avvia l'applicazione JavaFx fornendo i metodi
 * necessari all'avvio della scena
 * 
 */

public class Main extends Application {

    /* @brief Scena principale dell'applicazione */
    private static Scene scene;

    
    /**
     * @brief Metodo di avvio dell'applicazione JavaFX
     *
     * Imposta la scena principale e la mostra
     *
     * @param[in] stage Lo stage principale dell'applicazione.
     * @throws IOException Se il file FXML specificato non può essere caricato.
     */  
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(new FXMLLoader(Main.class.getResource("FirstViewDownBW.fxml")).load(), 598, 482);
        stage.setTitle("Rubrica");
        stage.setScene(scene);
        stage.show();
    }

   
     /**
     * @brief Cambia la scena principale
     *
     * Consente di cambiare la scena caricando un file FXML
     *
     * @param[in] fxml Nome del file FXML da caricare
     * @throws IOException Se si verifica un errore durante il caricamento del file FXML
     *
     */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(new FXMLLoader(Main.class.getResource(fxml + ".fxml")).load());
    }

     

    
     /** 
     * @brief Cambia la scena principale e restituisce l'FXML loader utilizzato
     *
     * Consente di cambiare la scena caricando un file FXML, inoltre restituisce
     * un FXMLLoader necessario per caricare il file fxml associato alla scena
     *
     * @param[in] fxml Nome del file FXML da caricare 
     * @return 
     * FXMLLoader usato per caricare il file fxml
     * @throws IOException Se si verifica un errore durante il caricamento del file FXML
     */
    public static FXMLLoader setRootAndGetLoader(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        scene.setRoot(loader.load());
        return loader; // Ritorna il loader per ottenere il controller
    }
    
    /**
     * @brief Metodo principale per avviare l'applicazione
     *
     * @param[in] args Argomenti della linea di comando
     */
    public static void main(String[] args) {
         launch();
    }

}