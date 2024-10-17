package com.example.moduleb;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.modulea.AClass1;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String text = AClass1.getHello();
            textView.setText(text);
        });
    }
}