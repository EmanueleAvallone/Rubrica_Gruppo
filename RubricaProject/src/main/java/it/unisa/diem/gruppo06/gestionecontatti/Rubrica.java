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
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::creaContatto(Contatto c) "InterfacciaRubrica.creaContatto".
    */
    
    @Override
    public void creaContatto(Contatto c) {
        
    }
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::modificaContatto(Contatto c) "InterfacciaRubrica.modificaContatto".
    */
    
    @Override
    public void modificaContatto(Contatto c) {
    }
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::eliminaContatto(Contatto c) "InterfacciaRubrica.eliminaContatto".
    */
    
    @Override
    public void eliminaContatto(Contatto c) {
        
    }

    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::cercaContatto(Contatto c) "InterfacciaRubrica.cercaContatto".
    */
    
    @Override
    public Contatto cercaContatto(Contatto c) {
       
        return null;
       
    }
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::getLista() "InterfacciaRubrica.getLista".
    */
    
    @Override
     public List<Contatto> getLista() {
     return null;
    }
}
