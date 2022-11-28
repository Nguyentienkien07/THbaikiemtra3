package com.example.thbaikiemtra3_04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhepTinhAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<PhepTinh> phepTinhList;

    public PhepTinhAdapter(Context context, int layout, List<PhepTinh> phepTinhList) {
        this.context = context;
        this.layout = layout;
        this.phepTinhList = phepTinhList;
    }

    @Override
    public int getCount() {
        return phepTinhList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        // ánh xạ
        TextView textTen = (TextView) view.findViewById(R.id.tvpheptinh);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        // gán giá trị
        PhepTinh phepTinh = phepTinhList.get(i);
        textTen.setText(phepTinh.getPheptinh());
        imgHinh.setImageResource(phepTinh.getHinh());




        return view;
    }
}
