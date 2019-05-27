/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraspresentacion1;

import static estructuraspresentacion1.Orden.listaDeNumeros;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sebas
 */
public class InputArray {

    static ArrayList<Integer> listaDeLargos;
    static ArrayList<Integer> test = new ArrayList<Integer>();
    static int masAlto;

    public static ArrayList<Integer> ejecutaArray(ArrayList<Integer> lista) {
        listaDeLargos = new ArrayList<Integer>();
        for (int i = 0; i < lista.size(); i++) {

            listaDeLargos.add(CollatzConjeture.ejecucionMatematica(lista.get(i)));

        }
        test.add(lista.get(listaDeLargos.indexOf(Collections.max(listaDeLargos))));
        test.add(Collections.max(listaDeLargos));
        System.out.print(lista.get(listaDeLargos.indexOf(Collections.max(listaDeLargos))) + " ");
        System.out.print(Collections.max(listaDeLargos));

        return test;
    }

}
