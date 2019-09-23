package com.example.areacalculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class circleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle_screen);

    }
    public void btnClicked(View v){
        EditText radiusTyped = findViewById(R.id.idRadius);

        try {
            double radius = Double.parseDouble(radiusTyped.getText().toString());
            double resultado = (radius * radius) * Math.PI;


            Intent squareResult = new Intent(this, circleResultActivity.class);
            squareResult.putExtra("resultado", resultado );
            startActivity(squareResult);

            finish();

        } catch (Exception e) {
            Toast.makeText(this, "Erro ao realizar o cálculo", Toast.LENGTH_LONG).show();
        }
    }
}

