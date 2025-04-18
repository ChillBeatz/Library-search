package com.example.librarysearch;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        Button bt = (Button) findViewById(R.id.rtb);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button btr = (Button) findViewById(R.id.taipei);
        btr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt2 = (Button) findViewById(R.id.taoyuan);
        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt3 = (Button) findViewById(R.id.xinbei);
        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt4 = (Button) findViewById(R.id.xinzhu);
        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
       Button bt6 = (Button) findViewById(R.id.taizhong);
        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });Button bt7 = (Button) findViewById(R.id.hualian);
        bt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt8 = (Button) findViewById(R.id.zhanghua);
        bt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt9 = (Button) findViewById(R.id.yunlin);
        bt9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt10 = (Button) findViewById(R.id.nantou);
        bt10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt11 = (Button) findViewById(R.id.jiayi);
        bt11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt12 = (Button) findViewById(R.id.tainan);
        bt12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt13 = (Button) findViewById(R.id.gaoxiong);
        bt13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt14 = (Button) findViewById(R.id.pingtung);
        bt14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });
        Button bt15 = (Button) findViewById(R.id.taidong);
        bt15.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setClass(Page2.this, Page3.class);
                startActivity(intent);
            }
        });


    }
}