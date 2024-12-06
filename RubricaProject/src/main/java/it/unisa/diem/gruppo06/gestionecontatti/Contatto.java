package it.unisa.diem.gruppo06.gestionecontatti;

/**
 * @brief Classe che rappresenta un contatto della Rubrica
 * 
 * La classe 'Contatto' permette di memorizzare e gestire
 * le informazioni personali del contatto
 * 
 * @invariant Almeno uno tra i campi nome e cognome del contatto
 * deve essere non null
 * @invariant Ci possono essere massimo tre numeri di telefono e tre email
 */

public class Contatto {
    
    /** @brief Nome del contatto. */
    private String nome;
    
    /** @brief Cognome del contatto. */
    private String cognome;
    
    /** @brief Array che memorizza fino a 3 numeri di telefono */
    private String[] numeriTelefono = new String[3];
    
    /** @brief Array che memorizza fino a 3 email */
    private String[] email = new String[3];
    
    /**
     * @brief Costruttore.
     * @param[in] nome Nome del contatto
     * @param[in] cognome Cognome del contatto
     * @param[in] numeriTelofono Numeri di Telefono del contatto
     * @param[in] email Indirizzi  E-mail del contatto
     */
    
    public Contatto(String nome, String cognome, String[] numeriTelefono, String[] email) {
       
        
    }
    
    /**
     * @brief Restituisce il nome del contatto
     * @return Il Nome del contatto
     */
    
    public String getNome() {
        return null;
    }
    
    /**
     * @brief Restituisce il cognome del contatto
     * @return Il Cognome del contatto
     */
    
    public String getCognome() {
        return null;
    }
    
    /**
     * @brief Restituisce il primo numero di telefono del contatto
     * @return Il primo Numero di telefono del contatto
     */
    public String getNumeroTelefono1() {
        return null;
    }
    
    /**
     * @brief Restituisce il secondo numero di telefono del contatto
     * @return Il Secondo Numero di telefono del contatto
     */
    
    public String getNumeroTelefono2() {
        return null;
    }
    
    /**
     * @brief Restituisce il terzo numero di telefono del contatto
     * @return Il terzo Numero di telefono del contatto
     */
    
    public String getNumeroTelefono3() {
        return null;
    }
    
    /**
     * @brief Restituisce la prima email del contatto
     * @return La Prima email del contatto
     */
    
    public String getEmail1() {
        return null;
    }
    
    /**
     * @brief Restituisce la seconda email del contatto
     * @return La Seconda email del contatto
     */
    
    public String getEmail2() {
        return null;
    }
    
    /**
     * @brief Restituisce la terza email del contatto
     * @return La Terza email del contatto
     */
    
    public String getEmail3() {
        return null;
    }
    
    /**
     * @brief Imposta il nome del contatto
     * @param[in] nome Nome da assegnare al contatto 
     * 
     */
    
    public void setNome(String nome) {
        
    }
    
     /**
     * @brief Imposta il cognome del contatto
     * @param[in] cognome Cognome da assegnare al contatto
     * 
     */
    
    public void setCognome(String cognome) {
        
    }
    
     /**
     * @brief Imposta i numeri di telefono del contatto
     * @param[in] numeriTelefono Array di Numeri di telefono da assegnare al contatto
     * 
     */
    
    public void setNumeriTelefono(String[] numeriTelefono) {
        
    }
    
    /**
     * @brief Imposta i numeri di telefono del contatto
     * @param[in] email Array di indirizzi E-mail da assegnare al contatto
     * 
     */
    
    public void setEmail(String[] email) {
        
    }
    
    
    
    
}
