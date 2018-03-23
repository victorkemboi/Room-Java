package com.first.vickimes.quote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.first.vickimes.quote.Models.Quote;
import com.first.vickimes.quote.repo.AddViewModel;
import com.first.vickimes.quote.repo.QuoteDataSource;
import com.first.vickimes.quote.repo.QuotesRepo;

public class Add extends AppCompatActivity {

    EditText eTQuote ;
    Button btnAdd;
    private final QuotesRepo quoteRepo =new QuoteDataSource(App.INSTANCE.quoteDatabase.quoteDao() );
    private final AddViewModel viewModel = new AddViewModel(quoteRepo);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        eTQuote = (EditText)findViewById(R.id.eTQuote);
        btnAdd = (Button)findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.addQuote(new Quote(eTQuote.getText().toString()));
                finish();
            }
        });
    }
}
