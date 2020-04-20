package com.rickyelfather.utsricky;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Button btnHub = findViewById(R.id.btn_telep);
        btnHub.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_telep:
                String nomorHP="628117070054";
                Intent dialHP= new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+nomorHP));
                startActivity(dialHP);
                break;
        }
    }
}