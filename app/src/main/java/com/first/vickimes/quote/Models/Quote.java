package com.first.vickimes.quote.Models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by vicki mes on 3/24/2018.
 */
@Entity(tableName = "quotes")
public class Quote {
    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "quote")
    private String quote;
    public  Quote() {}
    public Quote(String quotem) {
            this.quote = quotem;
        }

    public int getUid() {
        return uid;
    }
    public void setUid(int id ) {
        this.uid = id;
    }

    public String getQuote() {
        return quote;
    }
    public void setQuote(String quotem ) {
        this.quote = quotem;
    }



    }
