package com.example.aluno.reservaambientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_Login extends AppCompatActivity {

    private String nomeAdm = "admin";
    private String senhaAdm = "admin";
    private String nomeUsu = "login";
    private String senhaUsu = "senha";

    public MainActivity_Login() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__login);
    }

    public void login(View v){
        EditText editNome = findViewById(R.id.editNome);
        EditText editSenha = findViewById(R.id.editSenha);

        if(editNome.getText().toString().equals(nomeAdm) && editSenha.getText().toString().equals(senhaAdm)){
            startActivity(new Intent(MainActivity_Login.this, MainActivity_Adm.class));
        } else if(editNome.getText().toString().equals(nomeUsu) && editSenha.getText().toString().equals(senhaUsu)){
            startActivity(new Intent(MainActivity_Login.this, MainActivity_Usuario.class));
        } else{
            TextView erroLogin = findViewById(R.id.erroLogin);
            erroLogin.setText("Usuário ou senha incorretos.");
        }
    }
}
