package  com.example.reseau_social_ecole.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.DrawableCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.example.reseau_social_ecole.R;

public class InterestActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    final String[][] options = { {"Établissement scolaire", "UdeM", "McGill", "UQAM", "Autre"},
            { "Programme", "Informatique", "Sociologie ", "Arts ", "Musique "},
            { "Associations étudiantes", " AEEEEUM ", "BIOUUU ", "ACASFR ", " UIOLKM"},
            { "Cours", "IFT2035", "IFT3911 ", "IFT2015 ", "IFT1065 "},
            { "Clubs", "Lecture ", "Cinema ", "Anime ", " Jeux-videos"}
    };
    final int[] id = {R.id.sp_es,R.id.sp_prog,R.id.sp_ae,R.id.sp_cours,R.id.sp_club};
    Spinner[] sp = new Spinner[5];
    ArrayAdapter[] aa = new ArrayAdapter[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);
        final Button iconSearch = findViewById(R.id.b_ic_search);
        final Button iconFriends = findViewById(R.id.b_ic_friends);
        final Button search = findViewById(R.id.b_search);
        final ImageButton iconAcc = findViewById(R.id.b_account);
        final Button iconMessage = findViewById(R.id.b_ic_message);


        for(int i = 0; i < 5; i++){
            sp[i] = findViewById(id[i]);
            sp[i].setOnItemSelectedListener(this);

            for (int j = 0; j < 5 ; j++) {
                aa[i] = new ArrayAdapter(this, android.R.layout.simple_spinner_item, options[i]);
                aa[i].setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                sp[i].setAdapter(aa[i]);
            }



        }

        iconAcc.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, ProfileActivity.class);
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

        iconMessage.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, MessageActivity.class);
            startActivity(intent);
        });

        search.setOnClickListener((View v) -> {
            Intent intent = new Intent(this, SearchResultActivity.class);
            startActivity(intent);
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
    }
}