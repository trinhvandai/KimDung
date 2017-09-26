package com.example.zzvvmm.kimdung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    DataBaseHelper myDbHelper = new DataBaseHelper();
    myDbHelper = new DataBaseHelper(this);



        myDbHelper.openDataBase();
}
