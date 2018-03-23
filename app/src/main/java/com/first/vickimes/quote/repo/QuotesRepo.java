package com.first.vickimes.quote.repo;

import android.arch.lifecycle.LiveData;

import com.first.vickimes.quote.Models.Quote;

import java.util.List;

/**
 * Created by vicki mes on 3/24/2018.
 */

public interface QuotesRepo {
    LiveData<List<Quote>> findAll();

    long insert(Quote quote);

}
