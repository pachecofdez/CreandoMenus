package com.opacheco.creandomenus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.op1:
                Toast.makeText(this, "Menu de Casa", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.op5:
                Toast.makeText(this, "Menu de Habitación", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.op6:
                Toast.makeText(this, "Menu de Comedor", Toast.LENGTH_SHORT).show();
                return true;



            case R.id.op2:
                Toast.makeText(this, "Opción de Salón", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.op3:
                Toast.makeText(this, "Menu de Donaciones", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.op4:
                Toast.makeText(this, "Menu de Acerca De", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }
}

