package com.first.vickimes.quote.repo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.first.vickimes.quote.Models.Quote;
import com.first.vickimes.quote.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vicki mes on 3/24/2018.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewHolder> {

    private List<Quote> quoteList;
    public ListAdapter(List<Quote> quoteListm){
        this.quoteList = quoteListm;
    }
    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.tvQuote.setText(quoteList.get(position).getQuote());
    }

    @Override
    public CustomViewHolder  onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quote, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return quoteList.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tvQuote;
        CustomViewHolder(View view) {
            super(view);
            tvQuote = (TextView) view.findViewById(R.id.tvQuote);
        }

    }
}
