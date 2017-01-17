package com.example.ruben.calculadora_ruben;

/**
 * Created by ruben on 7/11/16.
 */

public class Operaciones {

        private static float aux;
        private static float cont;

    static float suma(String cadena){


        String []suma=cadena.split("\\+");

        try {

            cont=Float.parseFloat(suma[0]);
            aux=Float.parseFloat(suma[1]);

            cont=cont+aux;

        }catch(Exception e){}



        return getCont();
    }
    static float resta(String cadena){

        try {

            String []resta=cadena.split("-");


            cont=Float.parseFloat(resta[0]);
            aux=Float.parseFloat(resta[1]);

            cont= getCont() - getAux();
        }catch(Exception e){}



        return getCont();
    }

     static float division(String cadena){

         try {

             String []resta=cadena.split("-");


             cont=Float.parseFloat(resta[0]);
             aux=Float.parseFloat(resta[1]);

             cont= getCont() / getAux();

         }catch(Exception e){}



         return getCont();
     }

    static float producto(String cadena){



        String []producto=cadena.split("\\*");

        try {
            cont=Float.parseFloat(producto[0]);
            aux=Float.parseFloat(producto[1]);
        }catch(Exception e){}



        return getCont();
    }

    static String resultado(String oper, int ele){
        float divi=0, num=0;
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

    public static float getAux() {
        return aux;
    }

    public static float getCont() {
        return cont;
    }
}
