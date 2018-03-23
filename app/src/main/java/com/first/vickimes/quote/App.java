package com.first.vickimes.quote;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.first.vickimes.quote.Models.QuoteDatabase;

/**
 * Created by vicki mes on 3/24/2018.
 */

public class App extends Application {
    public static App INSTANCE;
    public final QuoteDatabase quoteDatabase = Room.databaseBuilder(this, QuoteDatabase.class, "quotesdb").build();
    public static App get() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
