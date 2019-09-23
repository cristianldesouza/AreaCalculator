package com.example.areacalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class squareResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square_result_screen);
        double resultado = getIntent().getDoubleExtra("resultado", -1);

        TextView tvRes = findViewById(R.id.txtResult);
        tvRes.setText( String.valueOf(resultado) );
    }

    public void btnClicked(View v){
        finish();
    }
}

