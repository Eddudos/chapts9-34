package com.android.chapter10;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.android.chapter10.R.*;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        // найдем View-элементы
        tvOut = (TextView) findViewById(id.tvOut);
        btnOk = (Button) findViewById(id.btnOk);
        btnCancel = (Button) findViewById(id.btnCancel);
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        // по id определеяем кнопку, вызвавшую этот обработчик

        }

    public void onClickStart(View v) {
        if (v.getId() == id.LuL) {
            tvOut.setText("omegalul");
        }
        else {
            tvOut.setText("НАЕБАЛ");
        }


        }
    }


