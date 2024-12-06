package it.unisa.diem.gruppo06.gestionefile;

import it.unisa.diem.gruppo06.gestionecontatti.Rubrica;


/**
 * @brief Classe che gestisce le operazioni di lettura/scrittura da file
 * 
 * La classe 'FileManager' fornisce i metodi per leggere o scrivere 
 * da un file l'intera rubrica
 * 
 *
 */
public class FileManager {
    
    /**
    * @brief Scrive su un file la lista di contatti
    * 
    * @param[in] filename Il nome del file sul quale si vuole scrivere
    * @pre
    * Il file passato come input esiste
    * @pre
    * La rubrica da scrivere sul file è diversa da null
    * @post
    * La rubrica è stata scritta correttamente sul fie scelto
    * 
    * 
    */
    public static void salvaSuFile(String filename) {
    }

    /**
    * @brief Legge da un file la lista dei contatti e la restituisce al chiamante
    * 
    * @param[in] filename Il nome del file dal quale si vuole leggere
    * @return Un oggetto di tipo Rubrica contenente la lista dei contatti letta dal file
    * 
    * @pre
    * Il file passato come input esiste
    * @post
    * La rubrica restituita è diversa da null
    * 
    * 
    */
    public Rubrica caricaDaFile(String filename) {
        return  null;
    }
}
