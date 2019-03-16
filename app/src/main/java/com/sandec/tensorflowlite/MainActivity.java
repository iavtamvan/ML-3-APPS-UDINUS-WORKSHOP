package com.sandec.tensorflowlite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final int RC_CAMERA_AND_LOCATION = 100;
    Button btFace, btML, btTensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btFace = findViewById(R.id.btnFace);
        btML = findViewById(R.id.btnML);
        btTensor = findViewById(R.id.btnTensor);


        btFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this, FaceMRActivity.class);
                startActivity(inten);
            }
        });
        btML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this, MLKitActivity.class);
                startActivity(inten);
            }
        });
        btTensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(MainActivity.this, TensorflowActivity.class);
                startActivity(inten);
            }
        });

    }
}
