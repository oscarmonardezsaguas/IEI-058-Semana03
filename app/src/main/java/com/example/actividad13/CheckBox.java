package com.example.actividad13;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Toast;

import android.os.Bundle;

public class CheckBox extends AppCompatActivity {
    private android.widget.CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(CheckBox.this, "Opción 1 seleccionada", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBox.this, "Opción 1 deseleccionada", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
 }
