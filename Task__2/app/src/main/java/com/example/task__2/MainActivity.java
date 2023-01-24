package com.example.task__2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    EditText name;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.mainLayout);
        name = findViewById(R.id.personName);
        textView = findViewById(R.id.answerText);
    }

    public void chinese(View view) {
        Button button = findViewById(R.id.button1);
        layout.setBackground(button.getBackground());

        textView.setText("你好, " + name.getText().toString());

    }

    public void spanish(View view) {
        Button button = findViewById(R.id.button2);
        layout.setBackground(button.getBackground());

        textView.setText("Hola, " + name.getText().toString());
    }

    public void english(View view) {
        Button button = findViewById(R.id.button3);
        layout.setBackground(button.getBackground());

        textView.setText("Hello, " + name.getText().toString());
    }

    public void hindi(View view) {
        Button button = findViewById(R.id.button4);
        layout.setBackground(button.getBackground());

        textView.setText("नमस्ते, " + name.getText().toString());
    }

    public void arab(View view) {
        Button button = findViewById(R.id.button5);
        layout.setBackground(button.getBackground());

        textView.setText("مرحبًا, " + name.getText().toString());
    }

    public void bengal(View view) {
        Button button = findViewById(R.id.button6);
        layout.setBackground(button.getBackground());

        textView.setText("হ্যালো, " + name.getText().toString());
    }

    public void portuguese(View view) {
        Button button = findViewById(R.id.button7);
        layout.setBackground(button.getBackground());

        textView.setText("Olá, " + name.getText().toString());
    }

    public void russian(View view) {
        Button button = findViewById(R.id.button8);
        layout.setBackground(button.getBackground());

        textView.setText("Здравствуй, " + name.getText().toString());
    }

    public void japanese(View view) {
        Button button = findViewById(R.id.button9);
        layout.setBackground(button.getBackground());

        textView.setText("こんにちは, " + name.getText().toString());
    }

    public void javanese(View view) {
        Button button = findViewById(R.id.button10);
        layout.setBackground(button.getBackground());

        textView.setText("Halo, " + name.getText().toString());
    }
}