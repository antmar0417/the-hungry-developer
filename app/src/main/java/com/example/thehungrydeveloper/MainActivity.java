package com.example.thehungrydeveloper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starterCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);

        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });
    }
}