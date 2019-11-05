/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class NewCuentaJUnitTest {
    Cuenta cuenta;
    public NewCuentaJUnitTest() {
    }
    
    protected void setUp() throws Exception{
        cuenta=new Cuenta("0001.0002.12.1234567890","Un Muchacho");
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
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
        try{
            cuenta.ingresar(x);
            assertTrue(cuenta.getSaldo()==1000.0);
        }catch (Exception e){
            System.out.println("Fallo al insertar: "+e.getMessage());
        }
    }
    @Test
    public void testRetirar_double() throws Exception{
        System.out.println("Retirar");
        double x=1000.0;
        try{
            cuenta.retirar(x);
            assertTrue(cuenta.getSaldo()==0);
        }catch (Exception e){
            System.out.println("Fallo al retirar: "+e.getMessage());
        }
        assertEqual(cuenta.getSaldo(),0.0);
    }
}
