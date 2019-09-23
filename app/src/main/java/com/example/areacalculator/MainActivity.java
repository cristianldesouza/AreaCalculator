package com.example.areacalculator;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ALCM", "Método onCreate chamado");

    }

    public void btnClicked(View v){

        RadioGroup figure = findViewById(R.id.radioGroup);

        if (figure.getCheckedRadioButtonId() == R.id.square){
            Intent openSquare = new Intent(this, squareActivity.class);

            startActivity(openSquare);
        }else if(figure.getCheckedRadioButtonId() == R.id.triangle){
            Intent openTriangle = new Intent(this, triangleActivity.class);

            startActivity(openTriangle);
        }else if(figure.getCheckedRadioButtonId() == R.id.circle){
            Intent openCircle = new Intent(this, circleActivity.class);

            startActivity(openCircle);
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALCM", "Método onStart chamado");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALCM", "Método onResume chamado");

    }
}
