package com.example.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText pass;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button okButton = findViewById(R.id.button);
        okButton.setOnClickListener(okListner);
        Button clearButton = findViewById(R.id.button2);
        clearButton.setOnClickListener(clearListner);
    }



    private final View.OnClickListener okListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            email = findViewById(R.id.editText);
            pass = findViewById(R.id.editText2);
            textView = findViewById(R.id.textView5);
            textView.setText("Подписка на рассылку успешно " +
                    "оформлена для пользователя "+email.getText().toString()+" пароль "+ pass.getText().toString());
        }
    };

    private final View.OnClickListener clearListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView = findViewById(R.id.textView5);
            textView.setText("");
        }
    };
}
