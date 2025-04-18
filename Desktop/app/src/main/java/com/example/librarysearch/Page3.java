package com.example.librarysearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.*;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import com.google.android.material.textfield.TextInputLayout;


public class Page3 extends AppCompatActivity {
    String searchkey;
    String result; // 儲存資料用的字串
    String intext;
    private TextInputLayout textInputbox;
    private Spinner spinnerbox;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        textView = findViewById(R.id.textView3);
        textView.bringToFront();


        Button bt = (Button) findViewById(R.id.returnbt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Page3.this, MainActivity.class);
                startActivity(intent);
            }
        });

        spinnerbox = (Spinner) findViewById(R.id.spinner);
        spinnerbox.bringToFront();
        spinnerbox.setSelection(0, false);
        spinnerbox.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                searchkey = spinnerbox.getItemAtPosition(position).toString();
                //Toast.makeText(Page3.this, searchkey, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button btsearch = (Button) findViewById(R.id.button4);
        btsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textInputbox = (TextInputLayout) findViewById((R.id.textInputword));
                intext = textInputbox.getEditText().getText().toString();

                Thread thread = new Thread(mutiThread);
                thread.start(); // 開始執行
                try {
                    thread.sleep(1000);
                }catch (InterruptedException e){

                }

                Intent intent = new Intent();
                intent.setClass(Page3.this, Page4.class);
                Bundle bundle = new Bundle();
                bundle.putString("inputtext", result);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


    private Runnable mutiThread = new Runnable(){
        public void run()
        {
            OkHttpClient client = new OkHttpClient().newBuilder()
                    .build();
            MediaType mediaType = MediaType.parse("text/plain");
            if(searchkey.equals("書名"))
            {
                RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                        .addFormDataPart("name",intext)
                        .addFormDataPart("isbn","")
                        .addFormDataPart("author","")
                        .build();
                Request request = new Request.Builder()
                        .url("http://140.136.151.130/GetData.php")
                        .method("POST", body)
                        .build();
                Call call = client.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {
                        /**如果傳送過程有發生錯誤*/
                        result = e.getMessage();
                    }

                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        /**取得回傳*/
                        result =  response.body().string();
                    }
                });
            }
            else if(searchkey.equals("ISBN碼"))
            {
                RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                        .addFormDataPart("name","")
                        .addFormDataPart("isbn",intext)
                        .addFormDataPart("author","")
                        .build();
                Request request = new Request.Builder()
                        .url("http://140.136.151.130/GetData.php")
                        .method("POST", body)
                        .build();
                Call call = client.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {
                        /**如果傳送過程有發生錯誤*/
                        result = e.getMessage();
                    }

                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        /**取得回傳*/
                        result = response.body().string();
                    }
                });
            }
            else
            {
                RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                        .addFormDataPart("name","")
                        .addFormDataPart("isbn","")
                        .addFormDataPart("author",intext)
                        .build();
                Request request = new Request.Builder()
                        .url("http://140.136.151.130/GetData.php")
                        .method("POST", body)
                        .build();
                Call call = client.newCall(request);
                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {
                        /**如果傳送過程有發生錯誤*/
                        result = e.getMessage();
                    }

                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        /**取得回傳*/
                        result =  response.body().string();
                    }
                });
            }

        }
    };
}