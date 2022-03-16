package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.reseau_social_ecole.R;

public class FriendReqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_req);

        final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button iconFriends = findViewById(R.id.b_ic_friends);
        final ImageButton iconAcc = findViewById(R.id.b_account);

        final Button m1 = findViewById(R.id.b_message1);
        final Button m2 = findViewById(R.id.b_message2);
        final Button m3 = findViewById(R.id.b_message3);

        final Button a1 = findViewById(R.id.b_profile1);
        final Button a2 = findViewById(R.id.b_profile2);
        final Button a3 = findViewById(R.id.b_profile3);

        m1.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });
        m2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });
        m3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        iconSearch.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, InterestActivity.class);
            startActivity(intent);
        });

        iconFriends.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, FriendsActivity.class);
            startActivity(intent);
        });

        iconAcc.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });
        a3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });




    }
    public void showPopUp() {

        PopUp popUp = new PopUp("Demande acceptée", "Youpi vouz avez un nouveau ami");
        popUp.show(getSupportFragmentManager(), "popUp2");
    }


}