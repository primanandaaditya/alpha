package com.example.alpha.activities.to.analisa.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.alpha.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailAnalisaAdapter extends BaseExpandableListAdapter {

    private Context _context;
    private ArrayList<String> headers;
    private HashMap<String, DetailAnalisaToModel> childs;

    public DetailAnalisaAdapter(Context _context, ArrayList<String> headers, HashMap<String, DetailAnalisaToModel> childs) {
        this._context = _context;
        this.headers = headers;
        this.childs = childs;
    }

    @Override
    public Object getChild(int groupPosition, int childPosititon) {
        return this.childs.get(this.headers.get(groupPosition));
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final DetailAnalisaToModel model = (DetailAnalisaToModel) getChild(groupPosition, childPosition);

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.list_rincian_analisa_to, null);
        }

//        convertView.setPadding(0,-10,0,0);

        TextView tv_jumlah_benar = (TextView) convertView.findViewById(R.id.tv_jumlah_benar);
        TextView tv_nilai_anda = (TextView) convertView.findViewById(R.id.tv_nilai_anda);
        TextView tv_nilai_purata = (TextView) convertView.findViewById(R.id.tv_nilai_purata);
        ProgressBar pb_nilai_anda = (ProgressBar) convertView.findViewById(R.id.pb_nilai_anda);
        ProgressBar pb_nilai_purata = (ProgressBar) convertView.findViewById(R.id.pb_nilai_purata);


        tv_jumlah_benar.setText( "Jumlah benar : "  + String.valueOf( model.getJumlahBenar()) + "/" + String.valueOf(model.getJumlahSoal()) + " soal");
        tv_nilai_purata.setText(String.valueOf(model.getNilaiPurata()));
        tv_nilai_anda.setText(String.valueOf(model.getNilaiAnda()));
        pb_nilai_anda.setProgress(model.getNilaiAnda());
        pb_nilai_purata.setProgress(model.getNilaiPurata());

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.headers.get(groupPosition);
    }

    @Override
    public int getGroupCount() {
        return this.headers.size();
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this._context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.group_rincian_analisa_to, null);
        }

        TextView tv_grup = (TextView) convertView
                .findViewById(R.id.tv_grup);
        tv_grup.setText(headerTitle);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }


}