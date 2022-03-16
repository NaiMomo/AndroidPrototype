package com.example.reseau_social_ecole.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reseau_social_ecole.R;

public class ChatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        final Button iconSearch = findViewById(R.id.b_ic_search2);
        final Button iconFriends = findViewById(R.id.b_ic_friends2);
        final Button iconMessage = findViewById(R.id.b_ic_message2);

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
