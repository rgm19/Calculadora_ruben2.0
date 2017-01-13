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
        int res=0, cont=0;
        try {

            String []resta=cadena.split("-");


            cont=Integer.parseInt(resta[0]);
            res=Integer.parseInt(resta[1]);

            cont=cont-res;

        }catch(NumberFormatException e){}



        return cont;
    }

     static float division(String cadena){
         float divi=0, cont=0;
         try {

             String []resta=cadena.split("-");


             cont=Float.parseFloat(resta[0]);
             divi=Float.parseFloat(resta[1]);

             cont=cont/divi;

         }catch(NumberFormatException e){}



         return cont;
     }

    static int producto(String cadena){

        int aux, cont=0;

        String []producto=cadena.split("\\*");

        try {
            for (int i=0;i<producto.length;i++){
                aux = Integer.parseInt(producto[i]);
                cont = cont * aux;
            }

        }catch(NumberFormatException e){}



        return cont;
    }

    static String resultado(String oper, int ele){
        float divi=0;
        int num=0;
        String resul="";

        switch (ele){

            case 1:
                num=suma(oper);
                break;

            case 2:
                num=resta(oper);
                break;

            case 3:
                num=producto(oper);
                break;

            case 4:
                divi=division(oper);
                break;

        }


        resul=String.valueOf(num);

        return resul;
    }
}
