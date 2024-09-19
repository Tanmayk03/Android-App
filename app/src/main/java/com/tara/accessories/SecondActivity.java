package com.tara.accessories;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    Button bow;
    Button bracelet;
    Button necklace;
    Button hamper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);


        bow = findViewById(R.id.butbow);
        bracelet = findViewById(R.id.butbracelet);
        necklace = findViewById(R.id.butnecklace);
        hamper = findViewById(R.id.buthamper);

        bow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/p/C-nabIovIiy/?igsh=MTkxb3R3bjJpZnZ3dA== ");
            }

        });
        bracelet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/p/C-ndhKKv4K6/?igsh=MTVjdjNkcDI3ZjY0aw== ");
            }

        });
        necklace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/p/C8zRbg6P8J7/?igsh=MTRjMDExMG0wa2hqYw== ");
            }

        });
        hamper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoUrl("https://www.instagram.com/p/C-F5F1uSupj/?igsh=MWZiazV2a24ybm95dg== ");
            }

        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}
