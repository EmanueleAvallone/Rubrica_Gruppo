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
     * @brief Cerca un contatto nella rubrica.
     * 
     * Cerca un contatto all'interno della rubrica.
     * 
     * @param[in] c contatto da cercare.
     * 
     * @return Il contatto trovato, oppure null se non esiste.
     * 
     */
    public Contatto cercaContatto(Contatto c);

    /**
     * @brief Ottiene la lista completa dei contatti nella rubrica.
     * 
     * Restituisce una lista contenente tutti i contatti  presenti nella rubrica.
     * 
     * @return Lista dei contatti.
     */
    public List<Contatto> getLista();
}
