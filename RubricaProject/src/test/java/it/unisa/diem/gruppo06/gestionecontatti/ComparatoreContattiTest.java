
package it.unisa.diem.gruppo06.gestionecontatti;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emanueleavallone
 */
public class ComparatoreContattiTest {
    private Contatto o1;
    private Contatto o2;
    private ComparatoreContatti instance;
    public ComparatoreContattiTest() {
    }
       
    @BeforeEach
    public void setUp() {
        
      
        instance = new ComparatoreContatti();
    }
    /**
     * Test of compare method, of class ComparatoreContatti.
     */
    @Test
    public void testCompare1() { 
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        
        o1 = new Contatto("Emanuele","Avallone",numeri,email);
        o2 = new Contatto("Emanuele","Avallone",numeri,email); 
        int expResult = 0;
        instance = new ComparatoreContatti();
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);      
    }
    @Test
    public void testCompare2() {
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        
        o1 = new Contatto("Emanuele","Avallone",numeri,email);
        o2 = new Contatto("Emanuele","Barberio",numeri,email); 
        int expResult = -1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCompare3() { 
        String[] numeri = { "3352637284","3443365728", null};
        String[] email = {"e1@gmail.com","e2@gmail.com", null};
        
        o1 = new Contatto("Emanuele","Barberio",numeri,email);
        o2 = new Contatto("Emanuele","Avallone",numeri,email); 
        int expResult = 1;
        int result = instance.compare(o1, o2);
        assertEquals(expResult, result);
        
    }
    
}
