package com.example.artaccessibilityapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v7.widget.CardView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PaintingViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private TextView paintingNameView;
    private TextView paintingAboutView;
    private ImageView paintingPhotoView;
    private TextView paintingLocationView;
    private TextView paintingDateView;
    private TextView paintingArtist;
    private TextView paintingEra;
    private Context context;


    public PaintingViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        paintingNameView = (TextView) itemView.findViewById(R.id.painting_name);
        paintingAboutView = (TextView) itemView.findViewById(R.id.painting_about);
        paintingLocationView = (TextView) itemView.findViewById(R.id.painting_location);
        paintingPhotoView = (ImageView) itemView.findViewById(R.id.painting_photo);
        paintingDateView = (TextView) itemView.findViewById(R.id.painting_date) ;
        paintingArtist = (TextView) itemView.findViewById(R.id.painting_artist);
        paintingEra = (TextView) itemView.findViewById(R.id.painting_era);
        this.context = context;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, paintingNameView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public TextView getPaintingNameView() {
        return paintingNameView;
    }

    public TextView getPaintingAboutView(){
        return paintingAboutView;
    }

    public ImageView getPaintingPhotoView(){
        return paintingPhotoView;
    }

    public TextView getPaintingLocationView() {return paintingLocationView;}

    public TextView getPaintingDateView() {return paintingDateView;}

    public TextView getPaintingArtistView() {return paintingArtist;}

    public TextView getPaintingEraView(){return paintingEra;}

}
