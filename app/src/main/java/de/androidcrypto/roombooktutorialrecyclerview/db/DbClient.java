package de.androidcrypto.roombooktutorialrecyclerview.db;

import android.content.Context;

import androidx.room.Room;

import de.androidcrypto.roombooktutorialrecyclerview.db.AppDatabase;

public class DbClient {
    private Context mCtx;
    private static DbClient mInstance;

    private AppDatabase appDatabase;

    private DbClient(Context mCtx) {
        this.mCtx = mCtx;
        appDatabase = Room.databaseBuilder(mCtx, AppDatabase.class, "Captaindroid")
                .allowMainThreadQueries()
                .build();
    }

    public static synchronized DbClient getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new DbClient(mCtx);
        }
        return mInstance;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}
