package it.unisa.diem.gruppo06.gestionecontatti;

import java.util.ArrayList;
import java.util.List;

/**
 * @brief Classe che gestisce una Rubrica di contatti
 * 
 * La classe 'Rubrica' permette di memorizzare e gestire una lista di contatti
 *
 * @invariant Ogni contatto della classe Rubrica deve essere
 * un'istanza valida della classe Contatto
 */

public class Rubrica implements InterfacciaRubrica {

    /**
    * @brief Lista dei contatti presenti in Rubrica
    * 
    * Ogni contatto è un'istanza della classe 'Contatto'
    */
    
    private List<Contatto> contatti;
    
    /**
    * @brief Crea una Rubrica
    */
    
    public void creaRubrica() {
        
    }
    
    /**
    * @brief Aggiunge un nuovo contatto in rubrica
    * 
    * @param[in] c Contatto da aggiungere
    */
    
    @Override
    public void creaContatto(Contatto c) {
        
    }
    
    /**
    * @brief Modifica un contatto esistente in rubrica
    * 
    * @param[in] c Contatto da modificare
    */
    
    @Override
    public void modificaContatto(Contatto c) {
    }
    
     /**
    * @brief Elimina un contatto esistente in rubrica
    * 
    * @param[in] c Contatto da eliminare
    */
    
    @Override
    public void eliminaContatto(Contatto c) {
        
    }

     /**
    * @brief Cerca un contatto in rubrica
    * 
    * @param[in] c Contatto da cercare
    * @return Il contatto trovato o "null" se non lo trova
    */
    
    @Override
    public Contatto cercaContatto(Contatto c) {
       
        return null;
       
    }
    
     /**
    * @brief Restituisce la lista dei contatti
    * 
    * @return Una lista di contatti
    */
    @Override
     public List<Contatto> getLista() {
     return null;
    }
}
