/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraspresentacion1;

import static java.lang.Math.abs;

/**
 *
 * @author sebas
 */
public class CollatzConjeture {

    static int valorAbs;

    static int verificacionPrimo;

    public static int ejecucionMatematica(int input) {

        valorAbs = abs(input);

        

        int cont = 0;

        while (valorAbs > 1) {

            if (valorAbs % 2 == 0) {

                valorAbs = valorAbs / 2;
                

            } else  {

                valorAbs = (3 * valorAbs + 1);

                

            }
            cont++;
        }
        //System.out.println(cont+1);
        return cont+1;

    }

}
