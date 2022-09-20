package com.example.bt5_listview2;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class moanadapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<monAn> monAnList;

    public moanadapter(Context context, int layout, List<monAn> monAnList) {
        this.context = context;
        this.layout = layout;
        this.monAnList = monAnList;
    }

    @Override
    public int getCount() {

        return monAnList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        //ánh xạ view
        TextView txtten = (TextView) view.findViewById(R.id.tenmonan);
        TextView txtmota = (TextView) view.findViewById(R.id.tenmota);
        ImageView imgmonan = (ImageView) view.findViewById(R.id.anhmonan);

        //gán giá trị
        monAn monan = monAnList.get(i);

        txtten.setText(monan.getTen());
        txtmota.setText(monan.getMota());
        imgmonan.setImageResource(monan.getAnh());

        return view;
    }
}

