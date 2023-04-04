package com.ctis487.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ctis487.lab6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();

        setContentView(v);
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("name", binding.editTextName.getText().toString());
                intent.putExtra("surname", binding.editTextSurname.getText().toString());
                intent.putExtra("num1", binding.editTextNum1.getText().toString());
                intent.putExtra("num1", binding.editTextNum2.getText().toString());
                intent.putExtra("num2", binding.editTextNum3.getText().toString());


                startActivity(intent);

            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}