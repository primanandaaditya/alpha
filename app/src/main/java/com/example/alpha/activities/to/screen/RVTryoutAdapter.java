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

    //variabel untuk menampung opsi A,B,C,D dst
    String [] opsi;

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

                //looping semua model, lalu set aktiv= false semuanya
                for (TryoutModel tryoutModel: tryoutModels){
                    tryoutModel.setAktiv(false);
                }

                //nyalakan nomor dengan orange, untuk indeks yang diklik
                tryoutModels.get(position).setAktiv(true);

                //tampung variabel id dalam 'id'
                id = tryoutModels.get(position).getId();

                //tampung soal
                soal = getSoal(id);

                //tampung opsi jawaban
                opsi=new String[4];
                opsi[0] = getOpsi(id,"a");
                opsi[1] = getOpsi(id,"b");
                opsi[2] = getOpsi(id,"c");
                opsi[3] = getOpsi(id, "d");

                iTryout.getSoal(soal);
                iTryout.getOpsiA("A. " + opsi[0]);
                iTryout.getOpsiB("B. " + opsi[1]);
                iTryout.getOpsiC("C. " + opsi[2]);
                iTryout.getOpsiD("D. " + opsi[3]);

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
                hasil = tryoutModel.getSoal();
            }
        }
        return hasil;
    }

    private String getOpsi(Integer id, String ke){
        String hasil = "";
        for (TryoutModel tryoutModel: tryoutModels){
            if (tryoutModel.getId()==id){
                switch (ke.toLowerCase()){
                    case "a":
                        hasil = tryoutModel.getPilihanA();
                        break;
                    case "b":
                        hasil = tryoutModel.getPilihanB();
                        break;
                    case "c":
                        hasil = tryoutModel.getPilihanC();
                        break;
                    case "d":
                        hasil = tryoutModel.getPilihanD();
                        break;
                        default:
                            hasil = tryoutModel.getPilihanA();

                }

            }
        }
        return hasil;
    }

}

