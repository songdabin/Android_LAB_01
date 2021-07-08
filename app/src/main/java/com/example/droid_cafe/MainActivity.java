package com.example.droid_cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void showDonutOrder(View view) {
        displayToast("You ordered a donut.");
    }

    public void showIceCreamOrder(View view) {
        displayToast("You ordered an ice cream sandwich.");
    }

    public void showFroyoOrder(View view) {
        displayToast("You ordered a froyo.");
    }
}