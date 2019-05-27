/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import estructuraspresentacion1.InputArray;
import estructuraspresentacion1.Orden;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class PruebaCollatz {
    
   @Test
    public void CollatzTest() {
        
        ArrayList<Integer> esperado = new  ArrayList<Integer>();
        esperado.add(937);
        esperado.add(174);
        ArrayList<Integer> obtenido = InputArray.ejecutaArray(Orden.ingresoNum(900, 1000));
        assertEquals(esperado, obtenido);
        System.out.println(obtenido + " // " + esperado);
    }
   
}
