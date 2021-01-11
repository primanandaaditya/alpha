package com.example.alpha.activities.to.screen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.alpha.R;

import java.util.List;

public class RVTryoutAdapter extends RecyclerView.Adapter<RVTryoutAdapter.RVTryoutViewHolder> {

    private List<TryoutModel> tryoutModels;
    private Context context;

    public static class RVTryoutViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nomor;
        public RVTryoutViewHolder(View v) {
            super(v);
            tv_nomor=(TextView)v.findViewById(R.id.tv_nomor);
        }
    }


    public RVTryoutAdapter(List<TryoutModel> tryoutModels, Context context) {
        this.tryoutModels=tryoutModels;
        this.context = context;
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





}

