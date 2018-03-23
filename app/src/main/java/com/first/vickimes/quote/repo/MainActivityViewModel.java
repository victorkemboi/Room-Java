package com.first.vickimes.quote.repo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.first.vickimes.quote.MainActivity;
import com.first.vickimes.quote.Models.Quote;

import java.util.List;

/**
 * Created by vicki mes on 3/24/2018.
 */

public class MainActivityViewModel extends ViewModel {
   public QuotesRepo quotesRepo;
    public  MainActivityViewModel(QuotesRepo quotesRepom){
        this.quotesRepo = quotesRepom;
    }
   public  LiveData<List<Quote>>  getQuotes(){
        return quotesRepo.findAll();
     }
}
