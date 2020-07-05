
package com.ahel.reminiscence;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Spinner;


import com.ahel.reminiscence.R;


public class OpeningActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        Spinner page = (Spinner) findViewById(R.id.spinner);
        page.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent;
                switch(position){
                    case 1:intent=new Intent(OpeningActivity.this,first.class);
                           startActivity(intent);
                            break;
                    case 2:intent=new Intent(OpeningActivity.this,second.class);
                           startActivity(intent);
                           break;
                    case 3:intent=new Intent(OpeningActivity.this,third.class);
                           startActivity(intent);
                           break;
                    case 4:intent=new Intent(OpeningActivity.this,fourth.class);
                           startActivity(intent);
                           break;
                    case 5:intent=new Intent(OpeningActivity.this,fifth.class);
                           startActivity(intent);
                           break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
