package com.example.horriosdesalasedvii.ViewPagerAdapter;

import androidx.recyclerview.widget.RecyclerView;

public class ViewPagerItem {

    private final RecyclerView.Adapter<? extends RecyclerView.ViewHolder> recyclerViewAdapter;

    public ViewPagerItem(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> recyclerViewAdapter) {
        this.recyclerViewAdapter = recyclerViewAdapter;
    }

    public RecyclerView.Adapter<? extends RecyclerView.ViewHolder> getRecyclerViewAdapter() {
        return recyclerViewAdapter;
    }
}
