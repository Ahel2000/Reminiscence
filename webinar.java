package com.ahel.reminiscence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.app.Activity;

public class webinar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webinar);

        ImageButton back=(ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(webinar.this,OpeningActivity.class);
                startActivity(browserIntent);
            }
        });

        Button button=(Button) findViewById(R.id.register);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSc3OUUH3kjEriKvJNk6Ep7NwejqhKhZ_G3hgNomea4F6-qnDA/viewform"));
                startActivity(browserIntent);
            }
        });
    }


}