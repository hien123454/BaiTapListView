package com.example.firstmyapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {

    Context ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
       view = LayoutInflater.from(ctx).
               inflate(layoutItem,parent,false);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvGiaTien = view.findViewById(R.id.tvTien);
        ImageView imgGoods= view.findViewById(R.id.tvAo);
        tvName.setText(arrayList.get(i).getName());
        tvGiaTien.setText(arrayList.get(i).getTien());
        imgGoods.setImageResource(arrayList.get(i).getImageGoods());
        return view;
    }

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }
}
