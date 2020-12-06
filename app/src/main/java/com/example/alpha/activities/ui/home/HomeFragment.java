package com.example.alpha.activities.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.alpha.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    GridView gridView;

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
        homeModel.setGambar(R.drawable.ic_akun);
        homeModel.setKeterangan(getResources().getString(R.string.menu_akun));
        homeModels.add(homeModel);

        HomeAdapter homeAdapter=new HomeAdapter(getActivity(), homeModels);
        gridView.setAdapter(homeAdapter);
    }
}