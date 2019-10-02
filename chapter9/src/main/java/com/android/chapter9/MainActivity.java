package com.android.chapter9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;


    protected void onCreate(Bundle savedInstanceState) {

        tvOut =  findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {

            public void onClick(View v) {

                tvOut.setText("Нажата кнопка ОК");

            }
        };

        btnOk.setOnClickListener(oclBtnOk);


    }
}
