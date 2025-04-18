package com.example.librarysearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.*;
import java.lang.*;
import android.view.View;

public class Page4 extends AppCompatActivity {
    private TextView retextText;
    String retextTextStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        String outputtext;
        String[] outputTemp = new String[7];

        retextText = (TextView) findViewById(R.id.textView5);
        retextTextStr = (String)getIntent().getExtras().getString("inputtext") ;
        String[] splitStr = retextTextStr.split("\\*");
        String[][] outputStr = new String[splitStr.length][7];

        for (int i = 0;i < splitStr.length;i++)
        {
            outputTemp = splitStr[i].split("#");
            for(int j = 0;j < outputTemp.length;j++)
            {
                outputStr[i][j] = outputTemp[j];
            }
        }


        outputtext = outputStr[0][0];

        for(int j = 1;j < outputTemp.length;j++)
        {
            outputtext += outputStr[0][j];
        }

        retextText.setText(outputtext);
        retextText.setMovementMethod(ScrollingMovementMethod.getInstance());
    }
}