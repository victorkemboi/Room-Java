package com.first.vickimes.quote.repo;

import android.arch.lifecycle.LiveData;

import com.first.vickimes.quote.Models.Quote;
import com.first.vickimes.quote.Models.QuoteDao;

import java.util.List;

/**
 * Created by vicki mes on 3/24/2018.
 */

public class QuoteDataSource implements QuotesRepo {
    private QuoteDao quoteDao;

    public QuoteDataSource(QuoteDao quoteDaom) {
        this.quoteDao = quoteDaom;
    }

    @Override
    public LiveData<List<Quote>> findAll() {
        return quoteDao.getQuotes();
    }

    @Override
    public long insert(Quote quote) {
        return quoteDao.insertQuote(quote);
    }
}
