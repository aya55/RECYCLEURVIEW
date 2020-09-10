package com.example.recycleurview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter mAdapter;
private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<exampleItem> exampleList=new ArrayList<>();
        exampleList.add(new exampleItem(R.drawable.aaa,"Line 1","Line 2"));
        exampleList.add(new exampleItem(R.drawable.ccc,"Line 3","Line 4"));
        exampleList.add(new exampleItem(R.drawable.fffff,"Line 5","Line 6"));
        exampleList.add(new exampleItem(R.drawable.hggg,"Line 7","Line 8"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 9","Line 10"));
        exampleList.add(new exampleItem(R.drawable.aaa,"Line 11","Line 12"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 13","Line 14"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 15","Line 16"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 17","Line 18"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 19","Line 20"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 21","Line 22"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 23","Line 24"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 25","Line 26"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 27","Line 28"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 29","Line 30"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 31","Line 32"));
        exampleList.add(new exampleItem(R.drawable.unnamed,"Line 33","Line 34"));


 recyclerView=findViewById(R.id.recyclarview);
 recyclerView.setHasFixedSize(true);
 mLayoutManager=new LinearLayoutManager(this);
 mAdapter=new ExampleAdapter(exampleList);
 recyclerView.setLayoutManager(mLayoutManager);
 recyclerView.setAdapter(mAdapter);
    }
}
