package com.example.vacationtrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count =0;
    private TextView NameTextView;
    private TextView AboutTextView;
    private Button ClickMeButton, ClickMeAgainButton;
    private TextView TextViewUnderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NameTextView = (TextView) findViewById(R.id.nameTextView);
        AboutTextView = (TextView) findViewById(R.id.aboutTextView);
        ClickMeButton = (Button )findViewById(R.id.clickMeButton);
        ClickMeAgainButton = (Button) findViewById(R.id.clickMeAgainButton);
        TextViewUnderButton = (TextView) findViewById(R.id.textViewIdUnderButton);

        ClickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count ++;
                TextViewUnderButton.setText("Thanks for clicking "+count +"times!");

            }
        });
        ClickMeAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextViewUnderButton.setText("Thanks for clicking again !");
            }
        });
    }

}
