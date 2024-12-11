/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package it.unisa.diem.gruppo06.gestionecontatti;

import java.util.Arrays;
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
public class ContattoTest {
    private Contatto contatto;
    
    @BeforeEach
    public void setUp() {
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", ""};
        contatto =new Contatto("Emanuele","Barbato",numeri, email);
    }
    
    public ContattoTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class Contatto.
     */
    @Test
    public void testGetNome() {
        setUp();
        System.out.println("getNome");
        String expResult = "Emanuele";
        String result = contatto.getNome();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getCognome method, of class Contatto.
     */
    @Test
    public void testGetCognome() {
        setUp();
        System.out.println("getCognsome");
        String expResult = "Barbato";
        String result = contatto.getCognome();
        assertEquals(expResult, result);        
    }

    /**
     * Test of getNumeroTelefono method, of class Contatto.
     */
    @Test
    public void testGetNumeroTelefono() {
        setUp();
        System.out.println("getNumeroTelefono");
        String[] expResult = {"3352637284","3443365728",null};
        assertArrayEquals(expResult, contatto.getNumeriTelefono());        
    }
    
    /**
     * Test of getNumeroTelefono1 method, of class Contatto.
     */
    @Test
    public void testGetNumeroTelefono1() {
        setUp();
        System.out.println("getNumeroTelefono1");
        String expResult = "3352637284";
        assertEquals(expResult, contatto.getNumeroTelefono1());        
    }
    
    /**
     * Test of getEmail method, of class Contatto.
     */
    @Test
    public void testGetEmails() {
        setUp();
        System.out.println("getEmail");
        String[] expResult = {"e1@gmail.com","e2@gmail.com", ""};
        assertArrayEquals(expResult,contatto.getEmails());
    }
    
    /**
     * Test of getEmail1 method, of class Contatto.
     */
    @Test
    public void testGetEmail1() {
        setUp();
        System.out.println("getEmail");
        String expResult = "e1@gmail.com";
        assertEquals(expResult,contatto.getEmail1());
    }
    
    /**
     * Test of setNome method, of class Contatto.
     */
    @Test
    public void testSetNome() {
        setUp();
        System.out.println("setNome");
        String nome = "Gregorio";
        contatto.setNome(nome);
        String expResult = "Gregorio";
        assertEquals(expResult, contatto.getNome());
    }

    /**
     * Test of setCognome method, of class Contatto.
     */
    @Test
    public void testSetCognome() {
        setUp();
        System.out.println("setCogome");
        String nome = "Barberio";
        contatto.setCognome(nome);
        String expResult = "Barberio";
        assertEquals(expResult, contatto.getCognome());
    }

    /**
     * Test of setNumeriTelefono method, of class Contatto.
     */
    @Test
    public void testSetNumeriTelefono() {
        setUp();
        String[] numeri = {"3987129003",null, null};        
        System.out.println("setNumeriTelefono");
        contatto.setNumeriTelefono(numeri);
        String[] expResult = numeri;
        assertArrayEquals(expResult, contatto.getNumeriTelefono());
    }

    /**
     * Test of setEmail method, of class Contatto.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        setUp();
        String[] email = {"g@gmail.com","greg@outlook.com", null};        
        System.out.println("setNumeriTelefono");
        contatto.setEmails(email);
        String[] expResult = email;
        assertArrayEquals(expResult, contatto.getEmails());
    }
}
