package com.first.vickimes.quote.Models;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by vicki mes on 3/24/2018.
 */
@Database(entities = {Quote.class}, version = 1 , exportSchema = false)
public abstract class QuoteDatabase extends RoomDatabase{

    public abstract QuoteDao quoteDao();
}
