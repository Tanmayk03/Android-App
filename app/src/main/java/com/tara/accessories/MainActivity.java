package com.tara.accessories;

import android.content.Intent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button2);
        Button insta = (Button) MainActivity.this.findViewById(R.id.instagram);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent((Context) MainActivity.this, (Class<?>) SecondActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                gotoUrl("https://www.instagram.com/tara.accessories_galore?igsh=dXg4N3o0OTBvOXR2");
            }

        });
    }
        public void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

}
