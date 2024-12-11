
package it.unisa.diem.gruppo06.gestionecontatti;

import java.util.Comparator;


/**
 * @brief Classe che implementa un comparatore per i contatti
 * 
 * La classe 'ComparatoreContatti' implementa l'interfaccia 'Comparator'
 * al fine di comparare due contatti fra di loro, garantendo 
 * un ordinamento per cognome o, a parità di questo, per nome
 * 
 *
 */
public class ComparatoreContatti implements Comparator<Contatto>{

    
    /**
    * @brief Compara due contatti per cognome o per nome
    * 
    * @param[in] o1 Primo dei due contatti da comparare
    * @param[in] o2 Secondo dei due contatti da comparare
    * 
    * @return L'intero rappresentante il risultato della comparazione
    */
    @Override
    public int compare(Contatto o1, Contatto o2) {
        if(o1.getCognome().equals(o2.getCognome()))
            return o1.getNome().compareTo(o2.getNome());
        
        return o1.getCognome().compareTo(o2.getCognome());
    }
    
}
