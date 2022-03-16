package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reseau_social_ecole.R;

public class PassForgotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_forgot);
        final Button confirmer = findViewById(R.id.b_confirm);

        final Button confirmButton = findViewById(R.id.b_return1);

        confirmButton.setOnClickListener((View v) -> {

            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);

        });

        confirmer.setOnClickListener((View v) -> {

            showPopUp();

        });
    }

    public void showPopUp() {

        PopUp popUp = new PopUp("Verifiez votre courriel", "Un mot de passe temporaire vous a été envoyée");
        popUp.show(getSupportFragmentManager(), "popUp");

    }
}