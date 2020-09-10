package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    int images[];
    String names[];
    String release[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerview=findViewById(R.id.recycler1);
        setData();
        MyAdapter adapter=new MyAdapter(this,images,names,release);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(adapter);

    }

    private void setData() {
        images=new int[]{R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,
                         R.drawable.f,R.drawable.g, R.drawable.h, R.drawable.i,R.drawable.j};
        names=new String[]{"Alpha-1.0","Beta-1.1","Cupcake-1.5","Donut-1.6","Eclair-2.0/2.1",
                           "Froyo-2.2","Gingerbread-2.3", "HoneyComb-3.0/3.1/3.2","IcecreamSandwich-4.0","Jellybean-4.1"};
        release=new String[]{"sept-2008","Feb-2009","April-2009","sept-2009","Nov-2009",
                           "may-2010", "2010","may-2011","may-2011","June-2012"};
    }
}
