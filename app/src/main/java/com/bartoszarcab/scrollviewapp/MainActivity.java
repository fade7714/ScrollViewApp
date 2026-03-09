package com.bartoszarcab.scrollviewapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i <= 20; i++) {
            int buttonId = getResources().getIdentifier(
                    "button" + i,
                    "id",
                    getPackageName()
            );

            Button button = findViewById(buttonId);
            int finalI = i;

            button.setOnClickListener(v ->
                    Toast.makeText(
                            MainActivity.this,
                            "Button " + finalI + " clicked",
                            Toast.LENGTH_SHORT
                    ).show()
            );
        }
    }

    private void setButtonClickListener(int buttonId, String message) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show());
    }
}