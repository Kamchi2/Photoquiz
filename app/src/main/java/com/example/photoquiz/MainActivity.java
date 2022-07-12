package com.example.photoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StartFragment startFragment = new StartFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.main_container, startFragment, "findThisFragment")
                .commit();
    }
}