/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package it.unisa.diem.gruppo06.gestionefile;

import it.unisa.diem.gruppo06.gestionecontatti.InterfacciaRubrica;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ema
 */
public class FileManagerTest {
    
    private File testFile;
    
    public FileManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws IOException {
        testFile = File.createTempFile("TestRubrica", ".txt");
        try(PrintWriter pw = new PrintWriter(new FileWriter(testFile))){
            pw.println("Emanuele;Barbato;3352637284,3443365728;email1@gmail.com,email2@gmail.com");
            pw.println("Emanuele;Avallone;3246731167,3456210900,9123445362;");
            pw.println("Gregorio;Barberio;;email3@outlook.it,email4@virgilio.it");
        }    
    }
    
    @AfterEach
    public void tearDown() {
        testFile.delete();
    }

    /**
     * Test of salvaSuFile method, of class FileManager.
     */
    @Test
    public void testSalvaSuFile() throws Exception {
        System.out.println("salvaSuFile");
        File selectedFile = null;
        FileManager.salvaSuFile(selectedFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caricaDaFile method, of class FileManager.
     */
    @Test
    public void testCaricaDaFile() throws Exception {
        System.out.println("caricaDaFile");
        File selectedFile = null;
        FileManager instance = new FileManager();
        InterfacciaRubrica expResult = null;
        InterfacciaRubrica result = instance.caricaDaFile(selectedFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
