package com.example.desarrollo4.herramientasprueba;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Menu extends Fragment {

    /** Se crea una Array para almacenar por variables int la solicitud **/
    protected final int[] BOTONMENU = {R.id.linterna, R.id.musica, R.id.nivel};

    public Menu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_menu, container, false);
        ImageButton imageButton;
        for (int i = 0; i<BOTONMENU.length;i++) {
            final int queBonton = i;
            imageButton = (ImageButton) mimenu.findViewById(BOTONMENU[i]);
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Activity estaActividad = getActivity();
                    /** Dato enviado al metodo declarado en "ComunicaMenu **/
                    ((ComunicaMenu)estaActividad).menu(queBonton);
                }
            });
        }
        return mimenu;
    }

}
