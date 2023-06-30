package de.androidcrypto.roombooktutorialrecyclerview.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import de.androidcrypto.roombooktutorialrecyclerview.db.tables.Book;

@Dao
public interface BookDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertBook(Book book);

    @Update
    int updateBook(Book book);

    @Query("Select * from Book")
    List<Book> getAllBooks();
}
