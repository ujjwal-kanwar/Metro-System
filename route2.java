package com.example.route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.route.route3.r;
import static com.example.route.route4.k;

public class route2 extends AppCompatActivity {
    EditText t1,t2;
    Button b1,b2,b3,b4;
    static String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route2);
        t1=(EditText)findViewById(R.id.editText2);
        t2=(EditText)findViewById(R.id.editText3);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button);
        b4=(Button)findViewById(R.id.button4);
        t1.setText(r);
        t2.setText(k);
        s1=t1.getText().toString();
        s2=t2.getText().toString();

        b1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent hh = new Intent(route2.this,route3.class);
                        startActivity(hh);

                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent hh = new Intent(route2.this,route4.class);
                        startActivity(hh);

                    }
                }
        );
        b3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent xyz = new Intent(route2.this,routeb3.class);
                        startActivity(xyz);
                    }
                }
        );
       b4.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent ot = new Intent(route2.this,routeother.class);
                       startActivity(ot);
                   }
               }
       );


    }
}
