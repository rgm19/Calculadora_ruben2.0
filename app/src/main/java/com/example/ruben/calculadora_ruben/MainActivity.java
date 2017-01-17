package com.example.ruben.calculadora_ruben;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_resta, btn_suma, btn_producto, btn_division, btn_operacion;
    Button btn_ce, btn_men;
    TextView pantalla;
    static int ele;
    Context cnt;
    static String oper="", aux="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //

        btn_0=(Button)findViewById(R.id.btn_cero);
        btn_1=(Button)findViewById(R.id.btn_uno);
        btn_2=(Button)findViewById(R.id.btn_dos);
        btn_3=(Button)findViewById(R.id.btn_tres);
        btn_4=(Button)findViewById(R.id.btn_cuatro);
        btn_5=(Button)findViewById(R.id.btn_cinco);
        btn_6=(Button)findViewById(R.id.btn_seis);
        btn_7=(Button)findViewById(R.id.btn_siete);
        btn_8=(Button)findViewById(R.id.btn_ocho);
        btn_9=(Button)findViewById(R.id.btn_nueve);

        pantalla=(TextView)findViewById(R.id.tv_pantalla);
        btn_suma=(Button)findViewById(R.id.btn_suma);
        btn_resta=(Button)findViewById(R.id.btn_resta);
        btn_producto=(Button)findViewById(R.id.btn_multiplicacion);
        btn_division=(Button)findViewById(R.id.btn_division);
        btn_ce=(Button)findViewById(R.id.btn_limpiar);
        btn_operacion=(Button)findViewById(R.id.btn_operacion);



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="0";
                pantalla.setText(oper);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="1";
                pantalla.setText(oper);
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="2";
                pantalla.setText(oper);
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="3";
                pantalla.setText(oper);
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="4";
                pantalla.setText(oper);
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="5";
                pantalla.setText(oper);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="6";
                pantalla.setText(oper);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="7";
                pantalla.setText(oper);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="8";
                pantalla.setText(oper);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="9";
                pantalla.setText(oper);
            }
        });
//---------------------------------------------------------------------------------------------------

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="+";
                bloqueo();
                pantalla.setText(oper);
                ele=1;
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="-";
                bloqueo();
                pantalla.setText(oper);
                ele=2;
            }
        });

        btn_producto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="*";
                bloqueo();
                pantalla.setText(oper);
                ele=3;
            }
        });

        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oper+="/";
                bloqueo();
                pantalla.setText(oper);
                ele=4;
            }
        });

        btn_operacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                aux=Operaciones.resultado(pantalla.getText().toString(), ele);
                pantalla.setText(aux);
                activar();
                oper="";
                aux="";


            }
        });

        btn_ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ce();
            }
        });






//--------------------------------------------------------------------------------------------------


    }

    void bloqueo(){
            btn_division.setEnabled(false);
            btn_suma.setEnabled(false);
            btn_resta.setEnabled(false);
            btn_producto.setEnabled(false);
    }

    void activar(){

        if(String.valueOf(Operaciones.getAux())=="" || String.valueOf(Operaciones.getCont())==""){
           // pantalla.setText("Hay campos vacios en la operacion");
            Toast mensaje= Toast.makeText(cnt, "Hay campos que no estan rellenados",Toast.LENGTH_LONG);
            mensaje.show();
        }else{
            btn_division.setEnabled(true);
            btn_suma.setEnabled(true);
            btn_resta.setEnabled(true);
            btn_producto.setEnabled(true);

        }
    }


    void Ce(){
        oper="";
        pantalla.setText("");
    }



}
