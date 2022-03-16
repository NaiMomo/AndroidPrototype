package com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.reseau_social_ecole.R;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        final Button add1 = findViewById(R.id.b_add1);
        final Button add2 = findViewById(R.id.b_add2);
        final Button add3 = findViewById(R.id.b_add3);
        final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button prof1 = findViewById(R.id.b_profile1);
        final Button prof2 = findViewById(R.id.b_profile2);
        final Button prof3 = findViewById(R.id.b_profile3);
        final Button iconMessage = findViewById(R.id.b_ic_message);
        final Button msg1 = findViewById(R.id.b_message1);
        final Button msg2 = findViewById(R.id.b_message2);
        final Button msg3 = findViewById(R.id.b_message3);

        msg1.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        msg2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        msg3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });


        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });

        prof1.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, OtherProfileActivity.class);
            startActivity(intent);
        });

        prof2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, OtherProfileActivity.class);
            startActivity(intent);
        });

        prof3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, OtherProfileActivity.class);
            startActivity(intent);
        });

        iconSearch.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, InterestActivity.class);
            startActivity(intent);
        });

        final Button iconFriends = findViewById(R.id.b_ic_friends);
        iconFriends.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, FriendsActivity.class);
            startActivity(intent);
        });

        final ImageButton iconAcc = findViewById(R.id.b_account);
        iconAcc.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });

        iconMessage.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });

    }

    public void showPopUp() {
        PopUp popUp = new PopUp("Demande d'ami(e)","Demande envoyée!");
        popUp.show(getSupportFragmentManager(), "popUp");
    }
}