package com.example.reseau_social_ecole.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reseau_social_ecole.R;

public class MessageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button iconFriends = findViewById(R.id.b_ic_friends);
        final Button iconMessage = findViewById(R.id.b_ic_message);

        final Button rep1 = findViewById(R.id.b_repondre1);
        final Button rep2 = findViewById(R.id.b_repondre2);
        final Button rep3 = findViewById(R.id.b_repondre3);
        rep1.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        rep2.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        rep3.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ChatActivity.class);
            startActivity(intent);
        });

        iconSearch.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, InterestActivity.class);
            startActivity(intent);
        });

        iconMessage.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });

        iconFriends.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, FriendsActivity.class);
            startActivity(intent);
        });


    }

}
