package com.example.route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class route4 extends AppCompatActivity {

    ListView l2;
    static String k;
    String name2[]={"Dilshad Garden","Jhilmil","Mansarover Park","Shahdara","Seelam Pur","Shastri Park","Kashmere Gate","Pratap Nagar","Inder Lok"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route4);
       l2=(ListView)findViewById(R.id.lvv);
        ArrayAdapter<String>abc;
        abc= new ArrayAdapter<String>(route4.this,R.layout.support_simple_spinner_dropdown_item,name2);
        l2.setAdapter(abc);

        l2.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        k=(String)l2.getItemAtPosition(position);
                        Intent nac = new Intent(route4.this,route2.class);
                        startActivity(nac);

                    }
                }
        );
    }
}
