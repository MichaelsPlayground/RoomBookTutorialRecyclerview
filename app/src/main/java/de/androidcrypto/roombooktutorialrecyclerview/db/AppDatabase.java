package de.androidcrypto.roombooktutorialrecyclerview.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import de.androidcrypto.roombooktutorialrecyclerview.db.dao.BookDao;
import de.androidcrypto.roombooktutorialrecyclerview.db.tables.Book;

@Database(entities = {Book.class}, exportSchema = true, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BookDao getBookDao();
}