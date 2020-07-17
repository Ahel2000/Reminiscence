package com.ahel.reminiscence;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class publicity extends Activity {

    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicity);

//        ImageButton back=(ImageButton) findViewById(R.id.back);
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent browserIntent=new Intent(team.this,OpeningActivity.class);
//                startActivity(browserIntent);
//            }
//        });

        ImageButton call=(ImageButton)findViewById(R.id.button1);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                initiateCall();
            }
        });

        ImageButton call1=(ImageButton)findViewById(R.id.button2);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=1;
                initiateCall();
            }
        });

        ImageButton call2=(ImageButton)findViewById(R.id.button3);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=2;
                initiateCall();
            }
        });

        ImageButton call3=(ImageButton)findViewById(R.id.button4);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=3;
                initiateCall();
            }
        });

        ImageButton call4=(ImageButton)findViewById(R.id.button5);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=4;
                initiateCall();
            }
        });

        ImageButton call5=(ImageButton)findViewById(R.id.button6);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=5;
                initiateCall();
            }
        });

        ImageButton call6=(ImageButton)findViewById(R.id.button7);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=6;
                initiateCall();
            }
        });

        ImageButton call7=(ImageButton)findViewById(R.id.button8);
        call1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=7;
                initiateCall();
            }
        });
    }

    public void initiateCall(){
        if(checkifalready()){
            makethecall();
        }else{
            requestCallPermission();
        }
    }

    private boolean checkifalready(){
        int result= ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        if(result== PackageManager.PERMISSION_GRANTED){
            return true;
        }
        else{
            return false;
        }
    }

    private void requestCallPermission(){
        ActivityCompat.requestPermissions(team.this,new String[]{Manifest.permission.CALL_PHONE},1);
    }

    private void onRequestCallPermission(int requestCode,String permissions[],int grantResults[]){
        switch (requestCode){
            case 1:if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                makethecall();
            }
        }
    }

    private void makethecall(){
        Intent intent=new Intent(Intent.ACTION_CALL);
        if(i==0){
            intent.setData(Uri.parse("tel:8777030028"));
        }
        else if(1==1){
            intent.setData(Uri.parse("tel:9836165722"));
        }
        else if(i==2){
            intent.setData(Uri.parse("tel:7384949491"));
        }
        else if(i==3){
            intent.setData(Uri.parse("tel:9438674961"));
        }
        else if(i==4){
            intent.setData(Uri.parse("tel:7980971985"));
        }
        else if(i==5){
            intent.setData(Uri.parse("tel:8637351167"));
        }
        else if(i==6){
            intent.setData(Uri.parse("tel:9679177079"));
        }
        else if(i==7){
            intent.setData(Uri.parse("tel:8002708270"));
        }
        
        startActivity(intent);
    }
}