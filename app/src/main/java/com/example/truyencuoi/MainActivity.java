package com.example.truyencuoi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rc_list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<person>();
        people.add(new person(R.drawable.ic_congai, "con gai"));
        people.add(new person(R.drawable.nhahang, "gia dinh"));
        people.add(new person(R.drawable.congso, "gia dinh"));
        people.add(new person(R.drawable.connit, "gia dinh"));
        people.add(new person(R.drawable.contrai, "gia dinh"));
        people.add(new person(R.drawable.cuchai, "gia dinh"));
        people.add(new person(R.drawable.cuoi18, "gia dinh"));
        people.add(new person(R.drawable.dangian, "gia dinh"));
        people.add(new person(R.drawable.giadinh, "gia dinh"));
        people.add(new person(R.drawable.giaothong, "gia dinh"));
        people.add(new person(R.drawable.hoc, "gia dinh"));
        people.add(new person(R.drawable.hoctrocuoi, "gia dinh"));
        people.add(new person(R.drawable.khoahoc, "gia dinh"));
        people.add(new person(R.drawable.nghenghiep, "gia dinh"));
        people.add(new person(R.drawable.nguoilon, "gia dinh"));
        people.add(new person(R.drawable.sayxin, "gia dinh"));
        people.add(new person(R.drawable.tamquoc, "gia dinh"));
        people.add(new person(R.drawable.tayduki, "gia dinh"));
        people.add(new person(R.drawable.thegioi, "gia dinh"));
        people.add(new person(R.drawable.thocacuoi, "gia dinh"));
        people.add(new person(R.drawable.thovui, "gia dinh"));
        people.add(new person(R.drawable.tieulam, "gia dinh"));
        people.add(new person(R.drawable.tinhyeu, "gia dinh"));
        people.add(new person(R.drawable.tongiao, "gia dinh"));
        people.add(new person(R.drawable.trangquynh, "gia dinh"));
        people.add(new person(R.drawable.truyenbua, "gia dinh"));
        people.add(new person(R.drawable.vova, "gia dinh"));
        people.add(new person(R.drawable.yte, "gia dinh"));

        myAdapter = new PersonAdapter(this, people);
        recyclerView.setAdapter(myAdapter);
    }
}
