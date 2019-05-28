package com.example.aluno.reservaambientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.ArrayAdapter;



public class MainActivity_Usuario extends AppCompatActivity {

    private Button bFiltro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__usuario);

        Button bFiltro = findViewById(R.id.buttonFiltro);

        bFiltro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity_Usuario.this, MainActivity_Filtro.class);
                startActivity(it);
            }
        });

        final ArrayList<String> lista = new ArrayList<>();
        lista.add("Salão");
        lista.add("Sala");
        lista.add("Salinha");
        lista.add("Salete");

        final ListView listaView = findViewById(R.id.listSalas1);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, lista);

        listaView.setAdapter(arrayAdapter);

        listaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int intPosition = position;
                String value = (String) listaView.getItemAtPosition(position);

                switch (value){
                    case "Sala":
                        Intent it = new Intent(MainActivity_Usuario.this, MainActivity_Sala.class);
                        startActivity(it);


                }
            }
        });

    }
}
