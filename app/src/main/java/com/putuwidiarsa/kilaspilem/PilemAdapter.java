package com.putuwidiarsa.kilaspilem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PilemAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Pilem> pilems = new ArrayList<>();

    public void setPilems(ArrayList<Pilem> pilems) {
        this.pilems = pilems;
    }

    public PilemAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return pilems.size();
    }

    @Override
    public Object getItem(int i) {
        return pilems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = view;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_pilem, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(itemView);
        Pilem pilem = (Pilem) getItem(i);
        viewHolder.bind(pilem);

        return itemView;
    }

    private class ViewHolder {
        private TextView txtJudul;
        private TextView txtTahun;
        private TextView txtSinopsis;
        private ImageView imgPoster;

        ViewHolder(View view) {
            txtJudul = view.findViewById(R.id.txt_judul);
            txtTahun = view.findViewById(R.id.txt_tahun);
            txtSinopsis = view.findViewById(R.id.txt_sinopsis);
            imgPoster = view.findViewById(R.id.img_poster);
        }
        void bind(Pilem pilem) {
            txtJudul.setText(pilem.getJudul());
            txtTahun.setText(pilem.getTahun());
            txtSinopsis.setText(pilem.getSinopsis());
            imgPoster.setImageResource(pilem.getPoster());
        }
    }
}
