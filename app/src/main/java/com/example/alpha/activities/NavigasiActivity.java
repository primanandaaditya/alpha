package com.example.alpha.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.alpha.R;
import com.example.alpha.activities.leaderboard.home.LeaderboardHomeActivity;
import com.example.alpha.activities.to.grafik.GrafikToActivity;
import com.example.alpha.activities.ui.home.HomeFragment;
import com.example.alpha.fragments.belajar.BelajarFragment;
import com.example.alpha.interfaces.IHome;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class NavigasiActivity extends AppCompatActivity implements IHome {

    NavController navController;
    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigasi);

        navView = findViewById(R.id.nav_view);

        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_belajar,
                R.id.navigation_tryout,
                R.id.navigation_home,
                R.id.navigation_askgram,
                R.id.navigation_akun)
                .build();

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void callBelajar() {
       navView.setSelectedItemId(R.id.navigation_belajar);
    }

    @Override
    public void callTryout() {
        navView.setSelectedItemId(R.id.navigation_tryout);
    }

    @Override
    public void callAskgram() {
        navView.setSelectedItemId(R.id.navigation_askgram);
    }

    @Override
    public void callVideoTrialSoal() {

    }

    @Override
    public void callWeeklyChalenge() {
        Intent intent=new Intent(NavigasiActivity.this, GrafikToActivity.class);
        startActivity(intent);
    }

    @Override
    public void callLeaderboard() {
        Intent intent = new Intent(NavigasiActivity.this, LeaderboardHomeActivity.class);
        startActivity(intent);
    }

    @Override
    public void callKonsultasi() {

    }

    @Override
    public void callAkun() {
        navView.setSelectedItemId(R.id.navigation_akun);
    }

    @Override
    public void callHome() {

    }
}
