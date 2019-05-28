package com.example.aluno.reservaambientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity_Sala extends AppCompatActivity {

    private ImageView imgvoltar;
    private Button bFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__sala);

        imgvoltar = findViewById(R.id.imageVoltar);

        imgvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        bFinal = findViewById(R.id.buttonFinaliza);

        bFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), MainActivity_Usuario.class);
                startActivity(it);
            }
        });


    }
}
