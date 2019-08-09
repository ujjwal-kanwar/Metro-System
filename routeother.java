package com.example.route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class routeother extends AppCompatActivity {
    Button bb1,bb2,bb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routeother);

        bb1=(Button)findViewById(R.id.button5);
        bb2=(Button)findViewById(R.id.button6);
        bb3=(Button)findViewById(R.id.button7);

        bb1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent jjm = new Intent(routeother.this,routeabout.class);
                        startActivity(jjm);

                    }
                }
        );
        bb2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent jnj = new Intent(routeother.this,routeparking.class);
                        startActivity(jnj);
                    }
                }
        );
        bb3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent jnk = new Intent(routeother.this,routefare.class);
                        startActivity(jnk);

                    }
                }
        );
    }
}
