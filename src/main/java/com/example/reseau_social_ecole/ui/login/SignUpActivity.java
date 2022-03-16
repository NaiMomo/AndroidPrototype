package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reseau_social_ecole.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button signUpButton = findViewById(R.id.b_return);

        final Button inscript = findViewById(R.id.b_signup);

        signUpButton.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        inscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }

        });

    }
    public void showPopUp(){
        PopUp popUp = new PopUp("Vérifié votre courriel", "Un link de confirmation vous a été envoyée");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}