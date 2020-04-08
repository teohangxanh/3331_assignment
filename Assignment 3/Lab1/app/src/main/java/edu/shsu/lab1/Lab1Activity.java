package edu.shsu.lab1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Lab1Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle myInput = this.getIntent().getExtras();
    }
}
