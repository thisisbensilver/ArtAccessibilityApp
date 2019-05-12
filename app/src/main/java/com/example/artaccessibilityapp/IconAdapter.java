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
    private int index;

    public IconAdapter(List<Painting> i, Context c) {
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
        holder.getIDView().setText("" + icon.getPID());
        // holder.getIconView().setImageResource(icon.getPhoto());
        //icon.setIvh(holder);
        index = position;

    }

    @Override
    public int getItemCount() {
        return icons.size();
    }

    @Override
    public String toString() {
        return "Test # " + index + Keys.paintings.get(index).getPaintingName();
    }

    public String getMyCustomString() {
        return "Test # " + index + Keys.paintings.get(index).getPaintingName();
    }
}
