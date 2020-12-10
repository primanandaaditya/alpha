package com.example.alpha.activities.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alpha.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeAdapter extends BaseAdapter {

    Context context;
    List<HomeModel> homeModels;

    public HomeAdapter(Context context, List<HomeModel> homeModels) {
        this.context = context;
        this.homeModels = homeModels;
    }

    @Override
    public int getCount() {
        return homeModels.size();
    }

    @Override
    public Object getItem(int position) {
        return homeModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final HomeModel homeModel = homeModels.get(position);

        if (convertView == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.menu_home, null);
        }

        ImageView iv = convertView.findViewById(R.id.iv);
        TextView tv = convertView.findViewById(R.id.tv);

        Picasso
                .get()
                .load(homeModel.getGambar())
                .error(homeModel.getGambar())
                .into(iv);


        tv.setText(homeModel.getKeterangan());
        return convertView;
    }
}
