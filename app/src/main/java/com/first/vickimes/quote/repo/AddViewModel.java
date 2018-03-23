package com.first.vickimes.quote.repo;

import android.arch.lifecycle.ViewModel;
import android.support.annotation.NonNull;

import com.first.vickimes.quote.Models.Quote;

import java.util.concurrent.Executor;

/**
 * Created by vicki mes on 3/24/2018.
 */

public class AddViewModel extends ViewModel {
    public QuotesRepo quotesRepo;
    public  AddViewModel(QuotesRepo quotesRepom){
        this.quotesRepo = quotesRepom;
    }
    public void addQuote(Quote quote){
        Executor executor = new Executor() {
            @Override
            public void execute(@NonNull Runnable runnable) {

                new Thread(runnable).start();
            }
        };
        executor.execute(() -> quotesRepo.insert(quote));
    }

}
