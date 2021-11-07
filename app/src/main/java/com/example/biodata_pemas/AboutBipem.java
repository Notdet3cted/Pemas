package com.example.biodata_pemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutBipem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_bipem);

        Button btnb5 = (Button) findViewById(R.id.btnb5);
        btnb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(AboutBipem.this, MainActivity.class);
                startActivity(inte);
                finish();
            }
        });
    }
}