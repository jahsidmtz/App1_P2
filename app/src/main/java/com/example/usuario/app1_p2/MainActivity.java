package com.example.usuario.app1_p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView)findViewById(R.id.lis_principal);
        origendatos datos = new origendatos();
        AdaptadorListaDatos adaptador = new AdaptadorListaDatos();

        adaptador.arreglo = datos.showAll();
        adaptador.context = this;
        lista.setAdapter(adaptador);
    }
    ListView lista;

}
