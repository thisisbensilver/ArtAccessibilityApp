package com.example.artaccessibilityapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PaintingAdapter extends RecyclerView.Adapter<PaintingViewHolder> {

    private List<Painting> paintings;
    private Context context;

    public PaintingAdapter(List<Painting> paintings, Context context) {
        this.paintings = paintings;
        this.context = context;
    }

    @Override
    public PaintingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_painting,
                parent, false);
        return new PaintingViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(PaintingViewHolder holder, int position) {

        Painting painting = paintings.get(position);
        holder.getPaintingNameView().setText(painting.getPaintingName());
        holder.getPaintingAboutView().setText(painting.getAboutPainting());
        holder.getPaintingPhotoView().setImageResource(painting.getPhoto());
        holder.getPaintingLocationView().setText(painting.getPaintingLocation());
        holder.getPaintingDateView().setText(String.valueOf(painting.getPaintingDate()));
        holder.getPaintingArtistView().setText(painting.getPaintingArtist());
        holder.getPaintingEraView().setText(painting.getPaintingEra());
        holder.getPaintingID().setText(painting.getPIDasString());
    }

    @Override
    public int getItemCount() {
        return paintings.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
