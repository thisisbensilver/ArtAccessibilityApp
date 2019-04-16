package com.example.artaccessibilityapp;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class IconViewHolder extends RecyclerView.ViewHolder {

    private CardView cardView;
    private ImageView iconView;
    private Context context;
    private TextView idView;


    public IconViewHolder(final View itemView, final Context context) {
        super(itemView);
        cardView = itemView.findViewById(R.id.card_view_icon);
        iconView = itemView.findViewById(R.id.icon_img);
        idView = itemView.findViewById(R.id.icon_ID);

        this.context = context;
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openItemView(v);
/*
                int tSize1 = Keys.paintings.size();
                ArrayList<Painting> temp = Keys.paintings;
                temp.remove(4);
                int tSize = Keys.paintings.size();


                Object x = this;
                for (int i = Keys.paintings.size() - 1; i>=0 ; i--)
                {
                    boolean b = this.equals(Keys.paintings.get(i).getPID());
                    Log.i("ok","loc-"+i+" "+b);
                }
*/

/*
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
                }*/


//String a = this.toString();
//String b = "";

//String k = iconView.getResources().getResourceName(iconView.getId()).;
//mainHolder.imageview.getResources().getResourceName(mainHolder.imageview.getId()))
                //  Toast.makeText(context, "You clicked on " + this.toString(), Toast.LENGTH_SHORT).show();

//String u = "";
//                 Resources a = iconView.getResources();
                //String b = "";

                //Toast.makeText(context, cardView., Toast.LENGTH_SHORT).show();


            }
        });

    }

    public ImageView getIconView() {
        return iconView;
    }

    public TextView getIDView() {
        return idView;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }


    public void openItemView(View v) {

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
    }
}
