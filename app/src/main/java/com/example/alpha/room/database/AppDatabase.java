package com.example.alpha.room.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.alpha.room.user.User;
import com.example.alpha.room.user.UserDao;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}
