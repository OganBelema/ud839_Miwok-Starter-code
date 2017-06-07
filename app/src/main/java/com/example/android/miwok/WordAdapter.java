package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ogan on 5/31/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {

        super(context, 0, words);
        this.mColorResourceId = color;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word currentWord = getItem(position);

        //linking to our listview we created to collect our data
        //it is different from number activity
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //find the color that resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //get the id of container of TextViews and set the background
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.container);
        linearLayout.setBackgroundColor(color);

        //reference to the second textview in our list_item layout
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text);
        miwokTextView.setText(currentWord.getMiwok());

        //reference to the english textView in our list_item layout
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text);
        englishTextView.setText(currentWord.getEnglish());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        /** method that checks if an image is passed and sets the image view is invisible for those that don't*/
        if ((currentWord.hasImage())) {
            imageView.setImageResource(currentWord.getImage());

            //make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        /**trying to create the pronounce text*/

       /** final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getSpeech());
        ImageView player = (ImageView) listItemView.findViewById(R.id.speech);
        player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        }); */


        return listItemView;
    }

}
