package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Setting extends AppCompatActivity {
    TextView asu10,asu11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        asu10=findViewById(R.id.TVG);
        asu11=findViewById(R.id.TVasu);

        asu10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah7 = new Intent(Setting.this, ProfilePicActivity.class);
                startActivity(pindah7);
            }
        });

        asu11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah8 = new Intent(Setting.this, UbahPass.class);
                startActivity(pindah8);
            }
        });

    }
}