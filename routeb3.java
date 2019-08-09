package com.example.route;

import android.content.Intent;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.route.route2.s1;
import static com.example.route.route2.s2;

public class routeb3 extends AppCompatActivity {

    TextView td,tf,tt,vd,vf,vt;
    ListView l3;

    String station[]={"Dilshad Garden","Jhilmil","Mansarover Park","Shahdara","Seelam Pur","Shastri Park","Kashmere Gate","Pratap Nagar","Inder Lok"};
    int dis[]={0,2,4,3,5,7,6,3,5,4};
    int far[]={10,20,30,10,20,15,12,11,16,8};
    int tim[]={5,6,3,9,10,15,13,19,4,20};
    int a=0,b=0,k=0,sumd=0,sumf=0,sumt=0,t=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routeb3);


        vd=(TextView)findViewById(R.id.textView3);
        vf=(TextView)findViewById(R.id.textView5);
        vt=(TextView)findViewById(R.id.textView7);
        l3=(ListView)findViewById(R.id.lvvv);




        for(int i=0;i<station.length;i++)
        {
            if(station[i].equals(s1))
            {
                a=i;
            }
        }
        for(int j=0;j<station.length;j++)
        {
            if(station[j].equals(s2))
            {
                b=j;
            }
        }
        if(a==b)
        {
            vd.setText("" + sumd+"Km");
            vf.setText("" + sumf+"Rs");
            vt.setText("" + sumt+"min");
        }
      else {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    sumd = sumd + dis[i];
                    sumf = sumf + far[i];
                    sumt = sumt + tim[i];

                }
            } else {
                for (int i = a; i >= b; i--) {
                    sumd = sumd + dis[i];
                    sumf = sumf + far[i];
                    sumt = sumt + tim[i];
                }

            }

            vd.setText("" + sumd+"Km");
            vf.setText("" + sumf+"Rs");
            vt.setText("" + sumt+"min");

            int v = Math.abs(b - a) + 1;
            String[] p = new String[v];

            if (a < b) {
                for (int i = a; i <= b; i++) {
                    p[k] = station[i];
                    k++;
                }
            } else {
                for (int i = a; i >= b; i--) {
                    p[t] = station[i];
                    t++;
                }


            }

            ArrayAdapter<String> obj;
            obj = new ArrayAdapter<String>(routeb3.this, R.layout.support_simple_spinner_dropdown_item, p);
            l3.setAdapter(obj);
        }
    }
}
