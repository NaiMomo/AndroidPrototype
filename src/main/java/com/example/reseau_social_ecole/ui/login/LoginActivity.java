package  com.example.reseau_social_ecole.ui.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.reseau_social_ecole.R;

public class LoginActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final Button loginButton = findViewById(R.id.b_login);
        final Button createButton = findViewById(R.id.b_createAcc);
        final Button forgetButton = findViewById(R.id.b_forgetPass);

        loginButton.setOnClickListener((View v) -> {
                Intent intent = new Intent(this, InterestActivity.class);
                startActivity(intent);
        });

        createButton.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });

        forgetButton.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, PassForgotActivity.class);
            startActivity(intent);
        });

    }
}