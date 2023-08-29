package com.example.actividad13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {
    private RadioGroup radioGroup;
    private View radioButtonOption1;
    private View radioButtonOption2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        // Inicializar vistas
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonOption1 = findViewById(R.id.radioButton5);
        radioButtonOption2 = findViewById(R.id.radioButton6);

        // Configurar un listener para el RadioGroup
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Identificar el RadioButton seleccionado
                if (checkedId == R.id.radioButton5) {
                    Toast.makeText(RadioButton.this, "Radio Button 1 seleccionado", Toast.LENGTH_SHORT).show();
                } else if (checkedId == R.id.radioButton6) {
                    Toast.makeText(RadioButton.this, "Radio Button 2 seleccionado", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}