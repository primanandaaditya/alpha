package com.example.alpha.activities.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.alpha.R;
import com.example.alpha.activities.NavigasiActivity;
import com.example.alpha.interfaces.IHome;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    GridView gridView;
    IHome iHome;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        gridView = (GridView)root.findViewById(R.id.gridview);
        buildMenu();
        return root;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    void buildMenu(){
        List<HomeModel> homeModels= new ArrayList<>();
        HomeModel homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_belajar);
        homeModel.setKeterangan(getResources().getString(R.string.menu_belajar));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_tryout);
        homeModel.setKeterangan(getResources().getString(R.string.menu_tryout));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_askgram);
        homeModel.setKeterangan(getResources().getString(R.string.menu_askgram));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_video);
        homeModel.setKeterangan(getResources().getString(R.string.menu_video_trial_soal));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_weekly_chalenge);
        homeModel.setKeterangan(getResources().getString(R.string.menu_weekly_challenge));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_leaderboard);
        homeModel.setKeterangan(getResources().getString(R.string.menu_leaderboard));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_konsultasi);
        homeModel.setKeterangan(getResources().getString(R.string.menu_konsultasi));
        homeModels.add(homeModel);

        homeModel = new HomeModel();
        homeModel.setGambar(R.drawable.ic_akun);
        homeModel.setKeterangan(getResources().getString(R.string.menu_akun));
        homeModels.add(homeModel);

        HomeAdapter homeAdapter=new HomeAdapter(getActivity(), homeModels);
        gridView.setAdapter(homeAdapter);

        final NavigasiActivity navigasiActivity = (NavigasiActivity) getActivity();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        navigasiActivity.callBelajar();
                        break;

                    case 1:
                        navigasiActivity.callTryout();
                        break;

                    case 2:
                        navigasiActivity.callAskgram();
                        break;

                    case 3:
                        navigasiActivity.callVideoTrialSoal();
                        break;

                    case 5:
                        navigasiActivity.callLeaderboard();
                        break;

                    case 6:
                        navigasiActivity.callWeeklyChalenge();
                        break;

                    case 7:
                        navigasiActivity.callAkun();
                        break;

                        default:
                            navigasiActivity.callHome();

                }
            }
        });
    }
}