package com.example.route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class route3 extends AppCompatActivity {

    ListView l;
    static String r;
  String name[]={"Dilshad Garden","Jhilmil","Mansarover Park","Shahdara","Seelam Pur","Shastri Park","Kashmere Gate","Pratap Nagar","Inder Lok"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route3);
        l=(ListView)findViewById(R.id.lv);
        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<String>(route3.this,R.layout.support_simple_spinner_dropdown_item,name);
        l.setAdapter(obj);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                r = (String)l.getItemAtPosition(position);
                Intent obj =new Intent(route3.this,route2.class);
                startActivity(obj);
            }
        });
    }
}
