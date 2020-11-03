/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wesle
 */
public class PainelTest {
    
    public PainelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Funcionario method, of class Painel.
     */
    @Test
    public void testFuncionario() throws Exception {
        System.out.println("Funcionario");
        Painel instance = new Painel();
        instance.Funcionario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class Painel.
     */
    @Test
    public void testActionPerformed() throws ParseException {
        System.out.println("actionPerformed");
        ActionEvent ae = null;
        Painel instance = new Painel();
        instance.actionPerformed(ae);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
