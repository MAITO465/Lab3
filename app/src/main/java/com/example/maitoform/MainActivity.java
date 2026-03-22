package com.example.maitoform;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;   // AJOUTÉ
import android.widget.EditText; // AJOUTÉ
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText fieldName, fieldEmail, fieldPhone, fieldAddress;
    private Button actionBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        actionBtn.setOnClickListener(view -> {
            processTransmission();
        });
    }

    private void initViews() {
        fieldName = findViewById(R.id.ed_full_name);
        fieldEmail = findViewById(R.id.ed_user_email);
        fieldPhone = findViewById(R.id.ed_user_phone);
        fieldAddress = findViewById(R.id.ed_user_address);
        actionBtn = findViewById(R.id.btn_submit_data);
    }

    private void processTransmission() {
        String n = fieldName.getText().toString().trim();
        String e = fieldEmail.getText().toString().trim();

        if (n.isEmpty() || e.isEmpty()) {
            Toast.makeText(this, "Veuillez remplir les champs critiques", Toast.LENGTH_LONG).show();
        } else {
            Bundle dataPacket = new Bundle();
            dataPacket.putString("key_name", n);
            dataPacket.putString("key_email", e);
            dataPacket.putString("key_phone", fieldPhone.getText().toString());
            dataPacket.putString("key_address", fieldAddress.getText().toString());

            Intent nextScreen = new Intent(this, ResultActivity.class);
            nextScreen.putExtras(dataPacket);
            startActivity(nextScreen);
        }
    }
}