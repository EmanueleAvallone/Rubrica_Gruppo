package it.unisa.diem.gruppo06.gestionecontatti;

import java.util.List;



/**
 * @brief Interfaccia per la gestione di una rubrica di contatti.
 * 
 * Questa interfaccia definisce i metodi principali per creare, modificare, eliminare,
 * cercare contatti e ottenere la lista completa dei contatti presenti nella rubrica.
 * Le classi che implementano questa interfaccia devono specificare come eseguire
 * queste operazioni.
 */


public interface InterfacciaRubrica {

     /**
     * @brief Crea un nuovo contatto nella rubrica.
     * 
     * Aggiunge un nuovo contatto specificato alla rubrica.
     * 
     * @param[in] c contatto da aggiungere.
     */
    public void creaContatto(Contatto c);

    
     /**
     * @brief Modifica un contatto nella rubrica.
     * 
     * Modifica i campi del contatto c, utilizzando i valori dei 
     * campi di c1.
     * 
     * @param[in] c contatto da modificare.
     * @param[in] c1 contatto con i campi modificati.
     */
    public void modificaContatto(Contatto c,Contatto c1);
    
    
    
     /**
     * @brief Elimina un contatto nella rubrica.
     * 
     * Elimina un contatto specificato all'interno della rubrica.
     * 
     * @param[in] c contatto da eliminare.
     */
    public void eliminaContatto(Contatto c);
 
    
    /**
     * @brief Ricerca di un contatto nella rubrica.
     * 
     * Cerca uno o più contatti all'interno della lista basandosi su
     * una sottostringa del cognome o del nome.
     * 
     * @param[in] searchText Sottostringa del cognome o del nome del contatto da cercare.
     * 
     * @return Una lista dei contatti che contengono nel loro nome o cognome la sottostringa
     * passata come parametro.
     * 
     */
    public List<Contatto> cercaContatto(String searchText);

    
    /**
     * @brief Getter per la lista che colleziona i contatti presenti in rubrica.
     * 
     * Metodo che restituisce la lista contenente tutti i contatti presenti nella rubrica.
     * 
     * @return Lista dei contatti.
     */
    public List<Contatto> getLista();
}
