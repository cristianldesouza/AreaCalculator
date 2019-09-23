package com.example.areacalculator;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.Toast;


        import androidx.appcompat.app.AppCompatActivity;

public class squareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square_screen);

    }

    public void btnClicked(View v){
        EditText baseTyped = findViewById(R.id.idBase);
        EditText heightTyped = findViewById(R.id.idHeight);

        try {
            double base = Double.parseDouble(baseTyped.getText().toString());
            double height = Double.parseDouble(heightTyped.getText().toString());

            double resultado = base * height;

            Intent squareResult = new Intent(this, squareResultActivity.class);
            squareResult.putExtra("resultado", resultado);
            startActivity(squareResult);

            finish();

        } catch (Exception e) {
            Toast.makeText(this, "Erro ao realizar o cálculo", Toast.LENGTH_LONG).show();
        }
    }
}

