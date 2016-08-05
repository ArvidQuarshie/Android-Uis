package com.example.user.cellulant;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import it.gmariotti.cardslib.library.internal.Card;
import it.gmariotti.cardslib.library.internal.CardHeader;
import it.gmariotti.cardslib.library.internal.CardThumbnail;
import it.gmariotti.cardslib.library.view.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create a Card
        Card card = new Card(this, R.layout.row_card);

// Create a CardHeader
        CardHeader header = new CardHeader(this);
        header.setTitle("Hello world");

        card.setTitle("Simple card demo");
        CardThumbnail thumb = new CardThumbnail(this);
        thumb.setDrawableResource(R.drawable.placeholder);

        card.addCardThumbnail(thumb);

// Add Header to card
        card.addCardHeader(header);

// Set card in the cardView
        CardView cardView = (CardView) findViewById(R.id.carddemo);
        cardView.setCard(card);
    }
}
