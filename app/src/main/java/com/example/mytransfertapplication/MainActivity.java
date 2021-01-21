package com.example.mytransfertapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nomEmetteurs,prenomEmetteurs;
    Button btnAjouter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomEmetteurs = findViewById(R.id.nomEmetteur);
        prenomEmetteurs = findViewById(R.id.prenomEmetteur);

        btnAjouter = findViewById(R.id.btnAjouter);
        btnAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///Toast.makeText("Operation reussit");
                System.out.println("Operation reussit");
            }
        });

    }
}