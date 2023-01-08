package com.example.team_androind_application;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;

public class Kids extends AppCompatActivity {

    private ImageButton profilebutton;
    private ImageButton listbutton;
    private ImageButton basketbutton;
    private ImageButton mainbutton;
    private ImageButton allbutton;
    private ImageButton topsbutton;
    private ImageButton bottombutton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids);

        profilebutton = (ImageButton) findViewById(R.id.ProfileButton);
        listbutton = (ImageButton) findViewById(R.id.ListButton);
        basketbutton = (ImageButton) findViewById(R.id.BasketButton);
        mainbutton = (ImageButton) findViewById(R.id.HomeButton);
        allbutton = (ImageButton) findViewById(R.id.allButton);
        topsbutton = (ImageButton) findViewById(R.id.topsButton);
        bottombutton = (ImageButton) findViewById(R.id.bottomsButton);

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, ProfileActivity.class);
                startActivity(intent);

            }
        });

        listbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, ListActivity.class);
                startActivity(intent);

            }
        });


        basketbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, BasketActivity.class);
                startActivity(intent);

            }
        });

        mainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, MainActivity.class);
                startActivity(intent);

            }
        });
        allbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, KidsAll.class);
                startActivity(intent);

            }
        });
        topsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, KidsTops.class);
                startActivity(intent);

            }
        });
        bottombutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kids.this, KidsBottoms.class);
                startActivity(intent);

            }
        });


    }

}



