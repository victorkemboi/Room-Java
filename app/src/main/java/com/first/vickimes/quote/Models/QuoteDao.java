package com.first.vickimes.quote.Models;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by vicki mes on 3/24/2018.
 */

@Dao
public interface QuoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertQuote(Quote quote);

    @Query("SELECT * FROM quotes ")
    LiveData<List<Quote>> getQuotes();
}
