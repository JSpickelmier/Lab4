/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jacks
 */
public class InsuranceLabTest {
    
    public InsuranceLabTest() {
    }

   

    /**
     * Test of TotCost method, of class InsuranceLab.
     */
    @Test
    public void testTotCost() {
        System.out.println("TotCost");
        int agenumb = 33;
        int expResult = 465;
        int result = InsuranceLab.TotCost(agenumb);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

   
    
}
