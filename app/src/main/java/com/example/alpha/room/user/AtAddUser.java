package com.example.alpha.room.user;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

import com.example.alpha.helper.Constants;
import com.example.alpha.room.database.AppDatabase;

public class AtAddUser extends AsyncTask<Void,Void,Void> {

    Context context;

    public AtAddUser(Context context) {
        this.context = context;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        AppDatabase db = Room.databaseBuilder(context,
                AppDatabase.class, Constants.nama_db).build();

        User user = new User();
        user.setNama("nama");
        user.setPassword("abc");

        db.userDao().insertAll(user);
        Log.d("ha","Insert ok");
        return null;
    }
}
