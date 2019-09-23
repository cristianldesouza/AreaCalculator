package com.example.areacalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class circleResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_result_screen);
        double resultado = getIntent().getDoubleExtra("resultado", -1);

        TextView tvRes = findViewById(R.id.txtResult);
        tvRes.setText( String.valueOf(resultado) );
    }

    public void btnClicked(View v){
        finish();
    }
}

