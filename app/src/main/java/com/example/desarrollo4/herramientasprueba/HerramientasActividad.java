package com.example.desarrollo4.herramientasprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class HerramientasActividad extends AppCompatActivity implements ComunicaMenu{

    Fragment [] misFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas_actividad);

        misFragmentos = new Fragment[3];
        misFragmentos[0] = new Linterna();
        misFragmentos[1] = new Musica();
        misFragmentos[2] = new Nivel();

        /** Recuperar dato enviado desde el Intent de MainActivity.java **/
        Bundle extra = getIntent().getExtras();
        menu(extra.getInt("BOTONPULSADO"));
    }

    @Override
    public void menu(int queboton) {
        FragmentManager miManejador = getFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        miTransaccion.replace(R.id.herramientas, misFragmentos[queboton]);
        miTransaccion.commit();
    }
}
