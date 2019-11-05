/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class NewCuentaJUnitTest {
    Cuenta cuenta;
    public NewCuentaJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        cuenta=new Cuenta("0001.0002.12.1234567890","Un Muchacho");
    }
    
    @After
    public void tearDown() {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIngresar_double() throws Exception{
        System.out.println("ingresar");
        double x=1000.0;
        cuenta.ingresar(x);
        assertTrue(cuenta.getSaldo()==1000.0);
        
    }
    
    @Test
    public void testRetirar_double() throws Exception{
        System.out.println("Retirar");
        double x=1000.0;
        cuenta.retirar(x);
        assertTrue(cuenta.getSaldo()==-1000.0);
        
    }
}
