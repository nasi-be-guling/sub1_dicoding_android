package com.putuwidiarsa.kilaspilem;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private PilemAdapter adapter;
    private String[] pilemJudul;
    private String[] pilemTahun;
    private String[] pilemSinopsis;
    private TypedArray pilemPoster;
    private ArrayList<Pilem> pilems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lv_list);
        adapter = new PilemAdapter(this);
        listView.setAdapter(adapter);

        prepare();
        addItem();
    }

    private void prepare(){
        pilemJudul = getResources().getStringArray(R.array.pilem_judul);
        pilemTahun = getResources().getStringArray(R.array.pilem_tahun);
        pilemSinopsis = getResources().getStringArray(R.array.pilem_sinopsis);
        pilemPoster = getResources().obtainTypedArray(R.array.pilem_poster);
    }

    private void addItem(){
        pilems = new ArrayList<>();

        for (int i = 0; i < pilemJudul.length; i++){
            Pilem pilem = new Pilem();
            pilem.setPoster(pilemPoster.getResourceId(i, -1));
            pilem.setJudul(pilemJudul[i]);
            pilem.setTahun(pilemTahun[i]);
            pilem.setSinopsis(pilemSinopsis[i]);
            pilems.add(pilem);
        }
        adapter.setPilems(pilems);
    }
}
