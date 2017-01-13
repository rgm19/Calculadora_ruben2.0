package com.example.ruben.calculadora_ruben;
import java.util.*;
/**
 * Created by ruben on 7/11/16.
 */

public class Operaciones {

    static int suma(String[]cadena){
        int aux, cont=0;
        String sub="";

        for (int i=0;i<cadena.length;i++){

            aux=sub.indexOf(cadena[i]);
            
            cont=cont+aux;
        }


        return cont;
    }
    //int resta(){}
    //int division(){}
    //int producto(){}

    static String resultado(String oper){

        int num;
        String[] cadena;
        String aux="";
        cadena="+".split(oper);

        num=suma(cadena);

        aux=String.valueOf(num);

        return aux;
    }
}
