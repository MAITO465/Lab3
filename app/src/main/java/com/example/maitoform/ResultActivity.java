package com.example.maitoform;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView display = findViewById(R.id.recap);

        // Récupération du Bundle
        Bundle receivedData = getIntent().getExtras();

        if (receivedData != null) {
            String summary = "RÉSUMÉ DU COMPTE\n\n" +
                    "Utilisateur : " + receivedData.getString("key_name") + "\n" +
                    "Contact : " + receivedData.getString("key_email") + "\n" +
                    "Tél : " + receivedData.getString("key_phone") + "\n" +
                    "Demeure : " + receivedData.getString("key_address");

            display.setText(summary);
        }
        findViewById(R.id.btn_back).setOnClickListener(v -> finish());
    }
}