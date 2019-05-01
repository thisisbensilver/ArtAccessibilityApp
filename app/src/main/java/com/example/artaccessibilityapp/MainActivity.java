package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    IconAdapter iconAdapter;
    RecyclerView iconRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initialData();




        iconRecyclerView = findViewById(R.id.iconRecyclerView);
        iconRecyclerView.setHasFixedSize(true);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        iconRecyclerView.setLayoutManager(staggeredGridLayoutManager);


        iconAdapter = new IconAdapter(Keys.paintings, this);
        iconRecyclerView.setAdapter(iconAdapter);





    }

    public void openList(View view) {


        //setContentView(R.layout.activity_list);

        Intent mIntent = new Intent(this, ListActivity.class);

        startActivity(mIntent);





    }

    private void initialData() {

        //Marilyn Monroe, Opus 217, Self Portrait, Starry Night, Untitled
        Keys.locations.add(new Location("The New York Museum of Modern Art",
                "11 W 53rd St", "New York", "NY", 10019, "USA"));
        //Birth of Venus
        Keys.locations.add(new Location("The Uffizi Gallery",
                "Piazzale degli Uffizi, 6", "Firenze", "FI", 50122, "Italy"));
        //The Last Supper
        Keys.locations.add(new Location("Santa Maria delle Grazie",
                "Piazza di Santa Maria delle Grazie", "Milano", "MI", 20123, "Italy"));
        //The Last Supper Modern
        Keys.locations.add(new Location("The Metropolitan Museum of Art",
                "1000 5th Ave", "New York", "NY", 10028, "USA"));


        Keys.paintings.add(new Painting("The Birth of Venus", "Botticelli", 1485,
                R.drawable.birth_of_venus_renaissance_botticelli, "The Birth of Venus " +
                "(Italian: Nascita di Venere [ˈnaʃʃita di ˈvɛːnere]) is a painting by the Italian " +
                "artist Sandro Botticelli probably made in the mid 1480s. It depicts the goddess " +
                "Venus arriving at the shore after her birth, when she had emerged from the sea fully-grown " +
                "(called Venus Anadyomene and often depicted in art). ",
                "The Uffizi Gallery", "Renaissance", "Mythology"));

        Keys.paintings.add(new Painting("The Last Supper", "Ana Martins", 2013,
                R.drawable.last_supper_modern_ana_martins, "Christ shares his last supper with his " +
                "twelve apostles in Ana Martin's original interpretation of this Bible story. " +
                "Painting with acrylics, she captures the solemnity of the occasion as she evokes" +
                " the timeless beauty of a stained glass window. Her portrayal of Jesus and the apostles " +
                "is moving though they are faceless, proving once more her admirable artistic sensibility.",
                "The Metropolitan Museum of Art", "Modern", "Religious"));

        Keys.paintings.add(new Painting("Marilyn Monroe", "Andy Warhol", 1962,
                R.drawable.marilyn_monroe_modern_warhol, "In 1967, Warhol established a print-publishing business," +
                " Factory Additions, through which he published a series of screenprint portfolios on his signature subjects. " +
                "Marilyn Monroe was the first one. He used the same publicity still of the actress that " +
                "he had previously used for dozens of paintings. ",
                "The New York Museum of Modern Art", "Modern", "Portrait"));

        Keys.paintings.add(new Painting("Opus 217", "Paul Signac", 1890,
                R.drawable.opus_217_neoimpressionist_paul_signac, "Felix Fénéon was an art dealer, " +
                "collector, curator, political activist, critic, and friend of Signac who shared the artist's " +
                "interests in science and Japanese prints. In this painting Signac depicts this unconventional " +
                "and enigmatic personality with his characteristic goatee, holding a top hat and a walking stick " +
                "in one hand and a flower in the other. Combining figuration and abstraction, he sets Fénéon's static " +
                "profile against a swirling background—a kaleidoscopic depiction of optical theorist Charles Henry's " +
                "recently published color wheel. ",
                "The New York Museum of Modern Art", "Neo-Impressionist", "Abstract"));

        Keys.paintings.add(new Painting("Self Portrait", "Andy Warhol", 1962,
                R.drawable.self_portrait_modern_warhol, "Self-Portrait is an " +
                "acrylic paint and screenprint work on canvas by the American artist Andy Warhol. " +
                "It is a large portrait of Warhol and employs an arresting colour " +
                "scheme in which the artist’s vivid red head floats against an empty black background. " +
                "The artist’s neck, shoulders and torso have been excluded from the portrait, " +
                "focussing the attention on his face, expression and hair. ",
                "The New York Museum of Modern Art", "Modern", "Portrait"));

        Keys.paintings.add(new Painting("Starry Night", "Vincent Van Gogh", 1889,
                R.drawable.starry_night_postimpressionist_van_gogh, "The Starry Night is an oil " +
                "on canvas by the Dutch post-impressionist painter Vincent van Gogh. Painted in June 1889, " +
                "it depicts the view from the east-facing window of his asylum room at Saint-Rémy-de-Provence, " +
                "just before sunrise, with the addition of an idealized village. It has been in the permanent " +
                "collection of the Museum of Modern Art in New York City since 1941, acquired through the Lillie P. " +
                "Bliss Bequest. Regarded as among Van Gogh's finest works, The Starry Night is one of the " +
                "most recognized paintings in the history of Western culture.",
                "The New York Museum of Modern Art", "Post-Impressionist", "Landscape"));

        Keys.paintings.add(new Painting("The Last Supper", "Leonardo DaVinci", 1495,
                R.drawable.the_last_supper_renaissance_davinci, "The Last Supper (Italian: " +
                "Il Cenacolo [il tʃeˈnaːkolo] or L'Ultima Cena [ˈlultima ˈtʃeːna]) is a late 15" +
                "th-century mural painting by Italian artist Leonardo da Vinci housed by the refectory of the " +
                "Convent of Santa Maria delle Grazie in Milan, Italy. It is one of the western world's most " +
                "recognizable paintings.",
                "Santa Maria delle Grazie", "Renaissance", "Religious"));

        Keys.paintings.add(new Painting("Untitled", "Jean-Michel Basquiat", 1982,
                R.drawable.untitled_modern_basquiat, "Untitled is one of several " +
                "potent images of giant skulls he made at that time that helped earn him his " +
                "reputation, uniting a very ancient art symbol, the skull of countless memento mori, " +
                "with his knack for creating logo-like repeatable icons that hit your brain all at once, " +
                "earned as a street artist." +
                "\nIt is a headbutt of a painting, thunking you to attention.",
                "The New York Museum of Modern Art", "Modern", "Abstract"));
    }
}
