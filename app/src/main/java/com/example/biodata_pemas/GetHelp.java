package com.example.biodata_pemas;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_help);

        Button btnb3 = (Button) findViewById(R.id.btnb3);
        btnb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(GetHelp.this, MainActivity.class);
                startActivity(inte);
                finish();
            }
        });

        Button btntele = (Button) findViewById(R.id.btntele);
        btntele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent();
                inte.setAction(Intent.ACTION_VIEW);
                inte.addCategory(Intent.CATEGORY_BROWSABLE);
                inte.setData(Uri.parse("https://t.me/Bayuprats"));
                startActivity(inte);
                finish();
            }
        });
    }
}