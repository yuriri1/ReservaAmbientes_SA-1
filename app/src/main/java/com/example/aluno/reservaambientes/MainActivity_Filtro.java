package com.example.aluno.reservaambientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_Filtro extends AppCompatActivity {

    private Button bAplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__filtro);

        bAplicar = findViewById(R.id.buttonAplicar);

        bAplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity_Filtro.this, MainActivity_Usuario.class);
                startActivity(it);
            }
        });

    }
}
