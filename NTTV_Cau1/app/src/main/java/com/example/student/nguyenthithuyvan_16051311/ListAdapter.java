package com.example.student.nguyenthithuyvan_16051311;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter{

    private List<Film> listFilm;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListAdapter(Context aContext, List<Film> listFilm){
        this.context = aContext;
        this.listFilm = listFilm;
        layoutInflater = LayoutInflater.from(aContext);
    }
    @Override
    public int getCount() {
        return listFilm.size();
    }

    @Override
    public Object getItem(int poisition) {
        return listFilm.get(poisition);
    }

    @Override
    public long getItemId(int poisition) {
        return poisition;
    }

    @Override
    public View getView(int poisition, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            convertView = layoutInflater.inflate(R.layout.list_item,null);
            holder = new ViewHolder();
            holder.filmNameView = convertView.findViewById(R.id.textView_Name);
            holder.filmCountryView = convertView.findViewById(R.id.textView_Country);
            holder.filmPriceView  = convertView.findViewById(R.id.textView_Price);
            convertView.setTag(holder);
        }else{
            holder =   (ViewHolder) convertView.getTag();
        }

        Film film = this.listFilm.get(poisition);
        holder.filmNameView.setText(film.getName());
        holder.filmCountryView.setText(film.getCountry());
        holder.filmPriceView.setText(film.getPrice());
        return convertView;

    }
}
