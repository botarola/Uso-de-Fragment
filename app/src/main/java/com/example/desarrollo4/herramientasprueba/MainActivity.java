package com.example.desarrollo4.herramientasprueba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/** Se implementa la Interfaz de ComunicaMenu para obtener el dato almacenado **/
public class MainActivity extends AppCompatActivity implements ComunicaMenu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /** Metodo derivado de Comunicamenu **/
    @Override
    public void menu(int queboton) {
        Intent in = new Intent(this, HerramientasActividad.class);
        in.putExtra("BOTONPULSADO",queboton);
        startActivity(in);
    }
}
