package com.example.route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class routeparking extends AppCompatActivity {

    ListView l4;
    String h []={"Dilshad Garden","Jhilmil","Mansarover Park","Shahdara","Seelam Pur","Shastri Park","Kashmere Gate","Pratap Nagar","Inder Lok"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routeparking);
        l4=(ListView)findViewById(R.id.lv4);
        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<String>(routeparking.this,R.layout.support_simple_spinner_dropdown_item,h);
        l4.setAdapter(obj);

        l4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position%2==0) {
                    Toast.makeText(routeparking.this, "parking: available", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(routeparking.this, "parking: Not available", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
