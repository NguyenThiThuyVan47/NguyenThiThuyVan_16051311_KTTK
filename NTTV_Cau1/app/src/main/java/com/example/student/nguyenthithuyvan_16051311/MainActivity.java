package com.example.student.nguyenthithuyvan_16051311;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Film> films = getListFilm() ;
        final ListView listView = findViewById(R.id.listView);
        listView.setAdapter(new ListAdapter(this,films));

        listView.setOnClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int poisition, long id) {
                Object o = listView.getItemAtPosition(poisition);
                Film film = (Film)o;
                Toast.makeText(MainActivity.this,"Selected: "+" "+film, Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<Film> getListFilm(){
        List<Film> list = new ArrayList<Film>();
        Film Woleverin = new Film("Wolfverin","American",30000);
        Film SwordFish = new Film("SwordFish","American",15000);
        Film DeadPool = new Film("DeadPool","American",29000);
        Film RobinHood = new Film("RobinHood","American",35000);
        Film EndGame = new Film("EndGame","American",100000);
        Film IronMan = new Film("IronMan","American",70000);

        list.add(Woleverin);
        list.add(SwordFish);
        list.add(DeadPool);
        list.add(RobinHood);
        list.add(EndGame);
        list.add(IronMan);

        return list;
    }

}
