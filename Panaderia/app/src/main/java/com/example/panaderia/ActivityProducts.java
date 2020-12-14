package com.example.panaderia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActivityProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
    }

    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return  true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent();
        int id = item.getItemId();

        if(id == R.id.Itemcarro){
            intent.setClass(ActivityProducts.this, ActivityCar.class);
            startActivity(intent);
            finish(); // finaliza la actividad "Adios"
            Toast.makeText(this,"carrito de compras",Toast.LENGTH_SHORT).show();
        }else if(id == R.id.Itemcuenta){
            intent.setClass(ActivityProducts.this, ActivityCount.class);
            startActivity(intent);
            finish(); // finaliza la actividad "Adios"
            Toast.makeText(this,"cuenta de usuario",Toast.LENGTH_SHORT).show();
        }else if(id == R.id.Itemlogout){
            Toast.makeText(this,"carro de compras",Toast.LENGTH_SHORT).show();
        }

        return  super.onOptionsItemSelected(item);

    }
}
