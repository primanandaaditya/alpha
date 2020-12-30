package com.example.alpha.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.alpha.R;
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
//        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//                switch (menuItem.getItemId()) {
//                    case R.id.navigation_home:
//                        callHome();
//                    case R.id.navigation_belajar:
//                        callBelajar();
//                }
//
//                return false;
//            }
//        });


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

//        HomeFragment homeFragment=new HomeFragment(this);
//        loadFragment(homeFragment);
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
        BelajarFragment belajarFragment=new BelajarFragment();
        loadFragment(belajarFragment);
        navView.setSelectedItemId(0);
    }

    @Override
    public void callTryout() {

    }

    @Override
    public void callAskgram() {

    }

    @Override
    public void callVideoTrialSoal() {

    }

    @Override
    public void callWeeklyChalenge() {

    }

    @Override
    public void callLeaderboard() {

    }

    @Override
    public void callKonsultasi() {

    }

    @Override
    public void callAkun() {

    }

    @Override
    public void callHome() {

    }
}
