package com.example.alpha.activities.to.screen;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.alpha.R;

import java.util.List;
import java.util.stream.Collectors;

public class RVTryoutAdapter extends RecyclerView.Adapter<RVTryoutAdapter.RVTryoutViewHolder> {

    private List<TryoutModel> tryoutModels;
    private Context context;
    private ITryout iTryout;
    int id;
    String soal;

    public static class RVTryoutViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nomor;
        public RVTryoutViewHolder(View v) {
            super(v);
            tv_nomor=(TextView)v.findViewById(R.id.tv_nomor);
        }
    }


    public RVTryoutAdapter(List<TryoutModel> tryoutModels, Context context, ITryout iTryout) {
        this.tryoutModels=tryoutModels;
        this.context = context;
        this.iTryout = iTryout;
    }


    @Override
    public RVTryoutAdapter.RVTryoutViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nomor_to, parent, false);
        return new RVTryoutViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final RVTryoutViewHolder holder, final int position) {

        holder.setIsRecyclable(false);
        holder.tv_nomor.setText(String.valueOf(tryoutModels.get(position).getNomor()));



        holder.tv_nomor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (TryoutModel tryoutModel: tryoutModels){
                    tryoutModel.setAktiv(false);
                }

                tryoutModels.get(position).setAktiv(true);

                id = tryoutModels.get(position).getId();

                soal = getSoal(id);
                iTryout.getSoal(soal);

                notifyDataSetChanged();
            }
        });

        if (tryoutModels.get(position).getAktiv()==true){
            holder.tv_nomor.setBackgroundResource(R.drawable.circle_textview_orange);
        }
    }



    @Override
    public int getItemCount() {
        return tryoutModels.size();
    }

    private String getSoal(Integer id){
        String hasil = "";
        for (TryoutModel tryoutModel: tryoutModels){
            if (tryoutModel.getId()==id){
                Log.d("nilai id", String.valueOf(id));
                hasil = tryoutModel.getSoal();
            }
        }

        return hasil;
    }

}

