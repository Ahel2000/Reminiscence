package com.ahel.reminiscence;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import com.ahel.reminiscence.R;

public class OpeningActivity extends Activity{

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        ImageView about=(ImageView) findViewById(R.id.aboutus);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningActivity.this,sixth.class);
                startActivity(intent);
            }
        });
        ImageView events=(ImageView) findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningActivity.this,first.class);
                startActivity(intent);
            }
        });
        CardView schedule=(CardView)findViewById(R.id.schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningActivity.this,second.class);
                startActivity(intent);
            }
        });
        CardView contact=(CardView)findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningActivity.this,fifth.class);
                startActivity(intent);
            }
        });
        CardView sponsors=(CardView)findViewById(R.id.sponsors);
        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OpeningActivity.this,third.class);
                startActivity(intent);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.popup_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                intent=new Intent(OpeningActivity.this,OpeningActivity.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                intent=new Intent(OpeningActivity.this,first.class);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent=new Intent(OpeningActivity.this,second.class);
                startActivity(intent);
                return true;
            case R.id.item4:
                intent=new Intent(OpeningActivity.this,third.class);
                startActivity(intent);
                return true;
            case R.id.item5:
                Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reminiscencemet80.com/speakers"));
                startActivity(browserIntent);
                return true;
            case R.id.item6:
                intent=new Intent(OpeningActivity.this,fifth.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}
