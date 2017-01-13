package com.example.ruben.calculadora_ruben;
import java.util.*;
/**
 * Created by ruben on 7/11/16.
 */

public class Operaciones {

    static int suma(String cadena){
        int aux, cont=0;

        String []suma=cadena.split("\\+");

        try {
            for (int i=0;i<suma.length;i++){
                aux = Integer.parseInt(suma[i]);
                cont = cont + aux;
            }

        }catch(NumberFormatException e){}



        return cont;
    }
    static int resta(String cadena){
        int aux, cont=0;

        String []resta=cadena.split("\\-");

        try {
            for (int i=0;i<resta.length;i++){
                aux = Integer.parseInt(resta[i]);
                cont = cont - aux;
            }

        }catch(NumberFormatException e){}



        return cont;
    }

     static float division(String cadena){
         float aux, cont=0;

         String []division=cadena.split("/");

         try {
             for (int i=0;i<division.length;i++){
                 aux = Float.parseFloat(division[i]);
                 cont = cont / aux;
             }

         }catch(NumberFormatException e){}



         return cont;
     }

    static int producto(String cadena){

        int aux, cont=0;

        String []producto=cadena.split("\\+");

        try {
            for (int i=0;i<producto.length;i++){
                aux = Integer.parseInt(producto[i]);
                cont = cont * aux;
            }

        }catch(NumberFormatException e){}



        return cont;
    }

    static String resultado(String oper){

        int num;
        String[] cadena;
        String resul="";


        num=suma(oper);

        resul=String.valueOf(num);

        return resul;
    }
}
