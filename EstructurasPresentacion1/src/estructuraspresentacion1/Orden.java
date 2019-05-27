/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraspresentacion1;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Orden {

    static ArrayList<Integer> listaDeNumeros;

    public static ArrayList<Integer> ingresoNum(int a, int b) {
        listaDeNumeros = new ArrayList<Integer>();
        System.out.println(a);
        if (a > b) {
            System.out.print(b + " ");
            System.out.print(a + " ");
            int cont = a;
            for (int i = 0; i < a-b; i++) {

                listaDeNumeros.add(cont);
                cont--;

            }
            listaDeNumeros.add(a);
            return listaDeNumeros;
        } else {
            System.out.print(a + " ");
            System.out.print(b + " ");
            int cont = a;
            for (int i = 0; i < b-a ; i++) {

                listaDeNumeros.add(cont);
                cont++;
                
            }
            listaDeNumeros.add(b);

            return listaDeNumeros;
        }

    }
}
