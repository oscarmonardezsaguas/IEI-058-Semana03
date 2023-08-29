package com.example.actividad13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProgressBar extends AppCompatActivity {
    private View progressBar;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        // Inicializar vistas
        progressBar = findViewById(R.id.progressBar);
        startButton = findViewById(R.id.button);

        // Configurar un listener para el botón de inicio
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Simular una tarea en segundo plano
                simulateBackgroundTask();
            }
        });
    }
    private void simulateBackgroundTask() {
        // Mostrar el ProgressBar
        progressBar.setVisibility(View.VISIBLE);

        // Simular una tarea en segundo plano
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Simular un proceso largo
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // Ocultar el ProgressBar después de completar la tarea
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.setVisibility(View.GONE);
                    }
                });
            }
        }).start();
    }
}