package com.simplepay.irfan.simplepay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button leggTilVare;
    private Button mineVarer;


    public void clickFunction (View view){
        Log.i("HEi", "Trykket på knappen");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mineVarer = findViewById(R.id.mineVarer);
        mineVarer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenmineVarer();
            }
        });

        leggTilVare = findViewById(R.id.leggTilVare);
        leggTilVare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                OpenvareScanner();
            }
        });
    }

    public void OpenmineVarer(){
        Intent intent1 = new Intent(this, mineVarer.class);
        startActivity(intent1);
    }

    public void OpenvareScanner(){
        Intent intent = new Intent(this, vareScanner.class);
        startActivity(intent);
    }


}
