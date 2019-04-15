package com.example.artaccessibilityapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class IconViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private ImageView iconView;
    private Context context;


    public IconViewHolder(View itemView, final Context context) {
        super(itemView);
        cardView = itemView.findViewById(R.id.card_view_icon);
        iconView = itemView.findViewById(R.id.icon_img);

        this.context = context;
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "You clicked on " + this.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public ImageView getIconView() {
        return iconView;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


}
