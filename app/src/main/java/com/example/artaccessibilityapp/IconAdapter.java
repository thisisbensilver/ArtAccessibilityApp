package com.example.artaccessibilityapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class IconAdapter extends RecyclerView.Adapter<IconViewHolder> {

    private List<Painting> icons;
    private Context context;

    public IconAdapter(List<Painting> i, Context c) {
        //this.icons = icons;
        //this.context = context;
        icons = i;
        context = c;
    }

    @Override
    public IconViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_icon,
                parent, false);
        return new IconViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(IconViewHolder holder, int position) {
        Painting icon = icons.get(position);
        //holder.getIconView().setImageResource(icon.getPhoto());
        holder.getIconView().setImageResource(icon.getPhoto());
        // holder.getIconView().setImageResource(icon.getPhoto());

    }

    @Override
    public int getItemCount() {
        return icons.size();
    }
}
