package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.reseau_social_ecole.R;

public class OtherProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_profile);

        final Button add = findViewById(R.id.b_add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });
    }

    public void showPopUp() {
        PopUp popUp = new PopUp("Demande d'ami(e)", "Demande envoyée");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}
