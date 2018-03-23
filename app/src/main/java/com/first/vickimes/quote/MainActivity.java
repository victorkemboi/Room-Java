package com.first.vickimes.quote;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.first.vickimes.quote.repo.ListAdapter;
import com.first.vickimes.quote.repo.MainActivityViewModel;
import com.first.vickimes.quote.repo.QuoteDataSource;
import com.first.vickimes.quote.repo.QuotesRepo;

public class MainActivity extends AppCompatActivity {
   private RecyclerView rvQuotes;
   private FloatingActionButton btnAdd;
   private final QuotesRepo quoteRepo =new QuoteDataSource (App.INSTANCE.quoteDatabase.quoteDao() );
   private final MainActivityViewModel viewModel = new MainActivityViewModel(quoteRepo);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvQuotes = (RecyclerView)findViewById(R.id.rvQuotes);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        rvQuotes.setLayoutManager(linearLayoutManager);
       viewModel.getQuotes().observe(this,quotes-> {

                   if (quotes != null) {
                       ListAdapter adapter = new ListAdapter(quotes);
                       rvQuotes.setAdapter(adapter);
                   }
               }
        );


        btnAdd = (FloatingActionButton)findViewById(R.id.add_quote);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Add.class);
                startActivity(intent);
            }
        });
    }
}
