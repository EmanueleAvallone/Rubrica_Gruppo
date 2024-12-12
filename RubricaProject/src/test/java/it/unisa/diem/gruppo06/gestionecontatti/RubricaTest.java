package it.unisa.diem.gruppo06.gestionecontatti;


import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RubricaTest {
    
    private Rubrica rubrica;
    
    public RubricaTest() {
    }
    
    
    @BeforeEach
    public void setUp() {
        rubrica = new Rubrica();

    }
    

    /**
     * Test of Rubrica method, of class Rubrica.
     */
    @Test
    public void testRubrica(){
        System.out.println("Rubrica");
        assertNotNull(rubrica);
        assertNotNull(rubrica.getLista());
    }

    /**
     * Test of creaContatto method, of class Rubrica.
     */
    @Test
    public void testCreaContatto() {
        System.out.println("creaContatto");
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c);
        // TODO review the generated test code and remove the default call to fail.
        assertFalse(rubrica.getLista().isEmpty());
        assertTrue(rubrica.getLista().contains(c));
    }

    /**
     * Test of modificaContatto method, of class Rubrica.
     *
     */
    @Test
    public void testModificaContatto1() {
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c);
        Contatto c2 = new Contatto("Emanuele","Barbato",numeri,email);
        rubrica.modificaContatto(c, c2);
        assertEquals("Emanuele",c2.getNome());
        assertEquals("Barbato",c2.getCognome());     
    }
    
    @Test
    public void testModificaContatto2(){
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        String[] numeri2 = {"3381456789","3281247655","3991245678"};
        Contatto c = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c);
        Contatto c3 = new Contatto("Emanuele","Barbato",numeri2,email);
        rubrica.modificaContatto(c, c3);
        assertArrayEquals(numeri2,c.getNumeriTelefono());
    }
    
    @Test
    public void testModificaContatto3(){
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        String[] email2 = {"b2@gmail.com","e6@libero.it", "f3@gmail.com"};
        Contatto c = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c);
        Contatto c4 = new Contatto("Emanuele","Barbato",numeri,email2);
        rubrica.modificaContatto(c, c4);
        assertArrayEquals(email2,c4.getEmails());
    }
    
    /**
     * Test of eliminaContatto method, of class Rubrica.
     */
    @Test
    public void testEliminaContatto() {
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c);
        rubrica.eliminaContatto(c);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(rubrica.getLista().isEmpty());
    }

    /**
     * Test of cercaContatto method, of class Rubrica.
     *
     */
    @Test
    public void testCercaContatto1() {
        System.out.println("cercaContatto");
        String substring="Greg";
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c1 = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c1);
        List<Contatto> risultati = rubrica.cercaContatto(substring);
        assertFalse(risultati.isEmpty());
        assertEquals("Gregorio", risultati.get(0).getNome());
        
    }
    
    @Test
    public void testCercaContatto2() {
        System.out.println("cercaContatto");
        String substring="barber";
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c1 = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c1);
        List<Contatto> risultati = rubrica.cercaContatto(substring);
        assertFalse(risultati.isEmpty());
        assertEquals("Barberio", risultati.get(0).getCognome());       
    }
    
    @Test
    public void testCercaContatto3() {
        System.out.println("cercaContatto");
        String substring="";
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c1 = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c1);
        List<Contatto> risultati = rubrica.cercaContatto(substring);
        assertFalse(risultati.isEmpty());
        assertEquals(rubrica.getLista(), risultati);       
    }
    
    @Test
    public void testCercaContatto4() {
        System.out.println("cercaContatto");
        String substring="nonpresente";
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c1 = new Contatto("Gregorio","Barberio",numeri,email);
        rubrica.creaContatto(c1);
        List<Contatto> risultati = rubrica.cercaContatto(substring);
        assertTrue(risultati.isEmpty());
    }
    
    

    /**
     * Test of getLista method, of class Rubrica.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        Contatto c = new Contatto("Gregorio","Barberio",numeri,email);
        List<Contatto> temp = List.of(c);
        rubrica.creaContatto(c);
        assertEquals(temp,rubrica.getLista());
    }
    
}
