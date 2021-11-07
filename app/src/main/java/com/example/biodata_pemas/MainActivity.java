package com.example.biodata_pemas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnbukabiodata = (Button) findViewById(R.id.btnbukabiodata);
        btnbukabiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(inte);
            }
        });

        Button btnabbip = (Button) findViewById(R.id.btnabbip);
        btnabbip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent inte = new Intent(MainActivity.this, AboutBipem.class);
                startActivity(inte);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.appinfo) {
            startActivity(new Intent(this, AppInfo.class));
        } else if (item.getItemId()==R.id.author) {
            startActivity(new Intent(this, Author.class));
        } else if (item.getItemId()==R.id.gethelp) {
            startActivity(new Intent(this, GetHelp.class));
        }
        return true;
    }
}