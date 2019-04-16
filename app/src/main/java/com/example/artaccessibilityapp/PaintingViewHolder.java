package com.example.artaccessibilityapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
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
        cardView = itemView.findViewById(R.id.card_view);
        paintingNameView = itemView.findViewById(R.id.painting_name);
        paintingAboutView = itemView.findViewById(R.id.painting_about);
        paintingLocationView = itemView.findViewById(R.id.painting_location);
        paintingPhotoView = itemView.findViewById(R.id.painting_photo);
        paintingDateView = itemView.findViewById(R.id.painting_date);
        paintingArtist = itemView.findViewById(R.id.painting_artist);
        paintingEra = itemView.findViewById(R.id.painting_era);
        this.context = context;

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, paintingNameView.getText().toString(), Toast.LENGTH_SHORT).show();
//openItemView(v);

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
/*

    public void openItemView(View v)
    {

        int where = -1; //impossible!
        for (int i = Keys.paintings.size() - 1; i >= 0; i--) {
            if (idView.getText().equals(("" + Keys.paintings.get(i).getPIDasString()))) {
                where = i;
                break;
            }
        }
        if (where != -1) {


            Toast.makeText(context, "I am " + Keys.paintings.get(where).getPaintingName(), Toast.LENGTH_LONG).show();

            Keys.paintings.get(where).openItem(v);
        }
    }*/

}
