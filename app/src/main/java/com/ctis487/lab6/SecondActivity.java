package com.ctis487.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ctis487.lab6.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    double average;
    ActivitySecondBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        View v = binding.getRoot();


        setContentView(v);

        Intent recivedIntent = getIntent();

        String name = recivedIntent.getStringExtra("name");
        String surname = recivedIntent.getStringExtra("surname");
        int num1 = Integer.parseInt(recivedIntent.getStringExtra("num1"));
        int num2 =Integer.parseInt(recivedIntent.getStringExtra("num2"));
        int num3 = Integer.parseInt(recivedIntent.getStringExtra("num3"));
        average = (num1+num2+num3)/3;

        binding.resultText.setText(name+" "+surname+"\n "+average);

        binding.closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("averageResult", average);
                setResult(RESULT_OK, intent);
                finish();

            }
        });


    }
}