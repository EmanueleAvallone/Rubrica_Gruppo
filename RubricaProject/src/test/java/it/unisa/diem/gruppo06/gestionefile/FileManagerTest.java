package it.unisa.diem.gruppo06.gestionefile;

import it.unisa.diem.gruppo06.gestionecontatti.Contatto;
import it.unisa.diem.gruppo06.gestionecontatti.InterfacciaRubrica;
import it.unisa.diem.gruppo06.gestionecontatti.Rubrica;
import it.unisa.diem.gruppo06.interfacciagrafica.RubricaController;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Classe di test per FileManager.
 */
public class FileManagerTest {

    private File tempFile;
    
    @BeforeEach
    public void setUp() throws IOException {
        // Creazione di un file temporaneo con dati di esempio
        tempFile = File.createTempFile("rubricaTest", ".txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Emanuele;Barbato;3352637284,3443365728;emanuele@gmail.com,email2@gmail.com\n");
            writer.write("Gregorio;Barberio;3425375609;email3@gmail.com\n");
        }
    }

    @AfterEach
    public void tearDown() {
        // Cancellazione del file temporaneo
        if (tempFile.exists()) {
            tempFile.delete();
        }
    }

    /**
     * Test del metodo caricaDaFile.
     */
    @Test
    public void testCaricaDaFile() throws IOException {
        System.out.println("caricaDaFile");
        FileManager fileManager = new FileManager();

        InterfacciaRubrica rubrica;
        rubrica = fileManager.caricaDaFile(tempFile);

        // Verifica che la rubrica non sia ""
        assertNotNull(rubrica);

        // Verifica che la rubrica contenga i contatti previsti
        Contatto primoContatto = rubrica.getLista().get(0);
        assertEquals("Emanuele", primoContatto.getNome());
        assertEquals("Barbato", primoContatto.getCognome());
        assertArrayEquals(new String[]{"3352637284", "3443365728", ""}, primoContatto.getNumeriTelefono());
        assertArrayEquals(new String[]{"emanuele@gmail.com", "email2@gmail.com", ""}, primoContatto.getEmails());

        Contatto secondoContatto = rubrica.getLista().get(1);
        assertEquals("Gregorio", secondoContatto.getNome());
        assertEquals("Barberio", secondoContatto.getCognome());
        assertArrayEquals(new String[]{"3425375609", "", ""}, secondoContatto.getNumeriTelefono());
        assertArrayEquals(new String[]{"email3@gmail.com", "", ""}, secondoContatto.getEmails());
    }

    /**
     * Test del metodo salvaSuFile (da implementare in futuro).
     */
    @Test
    public void testSalvaSuFile() throws IOException {
        System.out.println("salvaSuFile");

        // Creazione di una rubrica di esempio
        InterfacciaRubrica rubrica = new Rubrica();
        rubrica.creaContatto(new Contatto("Emanuele", "Barbato", new String[]{"3352637284", "", ""}, new String[]{"emanuele@gmail.com", "", ""}));
        rubrica.creaContatto(new Contatto("Gregorio", "Barberio", new String[]{"3425375609", "", ""}, new String[]{"gregorio@gmail.com", "", ""}));

        // Creazione di un file temporaneo per il salvataggio
        File outputFile = File.createTempFile("rubricaOutput", ".txt");

        
        for(int i=0; i<rubrica.getLista().size(); i++){
            RubricaController.getRubrica().creaContatto(rubrica.getLista().get(0)); 
        //Passo tutti i contatti della rubrica creata a RubricaController
        }
        // Salvataggio della rubrica nel file
        FileManager.salvaSuFile(outputFile);

        // Verifica che il file sia stato scritto correttamente
        assertTrue(outputFile.exists());
        
        System.out.println(outputFile);
        
        FileManager fileManager = new FileManager();
        InterfacciaRubrica prova = new Rubrica();
        prova = fileManager.caricaDaFile(outputFile);
        
        //Contatto primoContattoProva = prova.getLista().get(0);
        Contatto primoContattoRubrica = rubrica.getLista().get(0);
        
        assertEquals("Emanuele", RubricaController.getRubrica().getLista().get(0).getNome());
        assertEquals("Barbato", RubricaController.getRubrica().getLista().get(0).getCognome());
        assertArrayEquals(new String[]{"3352637284", "", ""}, RubricaController.getRubrica().getLista().get(0).getNumeriTelefono());
        assertArrayEquals(new String[]{"emanuele@gmail.com", "", ""}, RubricaController.getRubrica().getLista().get(0).getEmails());

        // Verifica che il file sia stato scritto correttamente
        assertTrue(outputFile.exists());
        System.out.println(outputFile.length());
        //assertTrue(prova.getLista().isEmpty());
        assertTrue(outputFile.length()> 0);

        // Pulizia del file temporaneo
        outputFile.delete();
    }
}
