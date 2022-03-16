package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.reseau_social_ecole.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final Button deconnect = findViewById(R.id.b_deconnection);
        final Button firendsReq = findViewById(R.id.b_friendsRequest);
        final ImageButton shareFB = findViewById(R.id.b_shareFB);

        deconnect.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        firendsReq.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, FriendReqActivity.class);
            startActivity(intent);
        });

        shareFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUpFB();
            }
        });
    }
    public void showPopUpFB() {
        PopUp popUp = new PopUp("Partage en Facebook","Partage réussi!");
        popUp.show(getSupportFragmentManager(), "popUpFB");
    }
}