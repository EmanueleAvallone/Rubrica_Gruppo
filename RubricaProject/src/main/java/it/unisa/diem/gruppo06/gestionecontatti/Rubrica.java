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
    * @brief Costruttore
    */
    public Rubrica() {
        this.contatti=new ArrayList<>();
    }
    
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::creaContatto(Contatto c) "InterfacciaRubrica.creaContatto".
    */ 
    @Override
    public void creaContatto(Contatto c) {
        contatti.add(c);
    }
    
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::modificaContatto(Contatto c) "InterfacciaRubrica.modificaContatto".
    */  
    @Override
    public void modificaContatto(Contatto c,Contatto c1) {
        int index;
        if(contatti.contains(c)){
            index = contatti.indexOf(c);
            contatti.get(index).setNome(c1.getNome());
            contatti.get(index).setCognome(c1.getCognome());
            contatti.get(index).setNumeriTelefono(c1.getNumeriTelefono());
            contatti.get(index).setEmails(c1.getEmails()); 
        }
    }
    
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::eliminaContatto(Contatto c) "InterfacciaRubrica.eliminaContatto".
    */
    @Override
    public void eliminaContatto(Contatto c) {
        contatti.remove(c);
    }
    

    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::cercaContatto(Contatto c) "InterfacciaRubrica.cercaContatto".
    */
    
    @Override
    public List<Contatto> cercaContatto(String searchText) {
       List<Contatto> filteredContacts = new ArrayList<>();
        for (Contatto contact : this.getLista()) {
        if (contact.getNome().toLowerCase().contains(searchText) || 
            contact.getCognome().toLowerCase().contains(searchText)) {
            filteredContacts.add(contact); // Aggiungi i contatti che corrispondono alla ricerca, ovvero se nome o cognome contengono la stringa
        }
    }
        return filteredContacts;
       
    }
    
    
    /**
    * Per ulteriori dettagli, vedere il corrispondente metodo in 
    * \ref InterfacciaRubrica::getLista() "InterfacciaRubrica.getLista".
    */
    
    @Override
     public List<Contatto> getLista() {
        return this.contatti;
    }
}
