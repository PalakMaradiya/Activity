package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MonthAdapter extends BaseAdapter {
    String monthsar[];
    Context context;

    MonthAdapter(String[] monthsar,Context context)
    {
        this.monthsar=monthsar;
        this.context=context;
    }

    @Override
    public int getCount() {
        return monthsar.length;
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
        View v= LayoutInflater.from(context).inflate(R.layout.month_spinner_item_file,null);
        TextView txtMonth = v.findViewById(R.id.txtMonth);
        txtMonth.setText(monthsar[i]);
        return v;
    }
}
