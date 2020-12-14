package com.example.panaderia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityCount extends AppCompatActivity {

    Button btnEditCount;
    private Button btnDeleteCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);


        btnEditCount = findViewById(R.id.btnEditCount);
        btnEditCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ActivityCount.this, ActivityEditCount.class);
                startActivity(intent);
            }
        });

        btnDeleteCount = (Button) findViewById(R.id.btnDeleteCount);
        btnDeleteCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(ActivityCount.this, R.style.DialogBasic);
                alert.setMessage("¿Deseas eliminar esta cuenta?")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog title = alert.create();
                title.setTitle("Eliminar cuenta");
                title.show();
            }
        });
    }
}
