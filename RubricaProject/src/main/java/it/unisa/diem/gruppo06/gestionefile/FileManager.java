package it.unisa.diem.gruppo06.gestionefile;

import it.unisa.diem.gruppo06.gestionecontatti.Contatto;
import it.unisa.diem.gruppo06.gestionecontatti.InterfacciaRubrica;
import it.unisa.diem.gruppo06.gestionecontatti.Rubrica;
import it.unisa.diem.gruppo06.interfacciagrafica.RubricaController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


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
    * @param[in] selectedFile Il file sul quale si vuole scrivere
    * @pre
    * La rubrica da scrivere sul file è diversa da null
    * @post
    * Il file sul quale è avvenuta la scrittura non è vuoto
    *  
    */
    public void salvaSuFile(File selectedFile) throws IOException {
        InterfacciaRubrica r = RubricaController.getRubrica(); 
        assert(r!=null);
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(selectedFile)))){


            for(Contatto c : r.getLista() ){

                pw.print(c.getNome());
                pw.append(";");

                pw.print(c.getCognome());
                pw.append(";");

                pw.print(c.getNumeriTelefono()[0]);
                pw.append(",");

                pw.print(c.getNumeriTelefono()[1]);
                pw.append(",");

                pw.print(c.getNumeriTelefono()[2]);
                pw.append(";");//l'ultimo separatore è sempre \n

                pw.print(c.getEmails()[0]);
                pw.append(",");

                pw.print(c.getEmails()[1]);
                pw.append(",");

                pw.print(c.getEmails()[2]);
                pw.append("\n");//l'ultimo separatore è sempre \n
            }


        }
        assert(selectedFile.length()>0);
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
    */
    public InterfacciaRubrica caricaDaFile(File selectedFile) throws FileNotFoundException, IOException {
        InterfacciaRubrica r = new Rubrica();
        assert(selectedFile.exists());
        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] dati = line.split(";");
                
                    // Crea un array di numeri di telefono e email
                    String[] numeriTelefono = new String[3];
                    String[] email = new String[3];
                    
                    // Assegna i numeri di telefono, separati dalla virgola
                    String[] telefoni = dati[2].split(",");
                    numeriTelefono[0] = telefoni.length > 0 ? telefoni[0] : "";
                    numeriTelefono[1] = telefoni.length > 1 ? telefoni[1] : "";
                    numeriTelefono[2] = telefoni.length > 2 ? telefoni[2] : "";
                    
                    // Assegna le email, separati dalla virgola
                    String[] emails = dati[3].split(",");
                    email[0] = emails.length > 0 ? emails[0] : "";
                    email[1] = emails.length > 1 ? emails[1] : "";
                    email[2] = emails.length > 2 ? emails[2] : "";
                    
                    // Crea un nuovo contatto e aggiungilo alla rubrica
                    Contatto contatto = new Contatto(dati[0], dati[1], numeriTelefono, email);
                    r.creaContatto(contatto); // Aggiungi il contatto alla rubrica                
                }
            }
        assert(r!=null);
        return r;
    }
    
  }

