package com.appfire.petter.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.calculateSum(12,12);
    }

    private int calculateSum(int numeberA, int numberB) {
        return numeberA + numberB;
    }
}
