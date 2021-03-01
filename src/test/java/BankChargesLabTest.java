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
public class BankChargesLabTest {
    
    public BankChargesLabTest() {
    }

   
    
    @Test
    public void testCheckFee() {
        System.out.println("CheckFee");
        int checknumb = 19;
        double expResult = 0.1;
        double result = BankChargesLab.CheckFee(checknumb);
        assertEquals(expResult, result, 0.0);
     
    }

 @Test
    public void testCheckFee1() {
        System.out.println("CheckFee");
        int checknumb = 21;
        double expResult = 0.08;
        double result = BankChargesLab.CheckFee(checknumb);
        assertEquals(expResult, result, 0.0);
    
}
@Test
    public void testCheckFee2() {
        System.out.println("CheckFee");
        int checknumb = 41;
        double expResult = 0.06;
        double result = BankChargesLab.CheckFee(checknumb);
        assertEquals(expResult, result, 0.0);
    }  
@Test
    public void testCheckFee3() {
        System.out.println("CheckFee");
        int checknumb = 61;
        double expResult = 0.04;
        double result = BankChargesLab.CheckFee(checknumb);
        assertEquals(expResult, result, 0.0);
    }
}