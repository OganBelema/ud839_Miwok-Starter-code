package com.example.android.miwok;


/**
 * Created by ogan on 5/31/17.
 */

public class Word {
    private String english;
    private String miwok;
    private int speech;


    /** Working with a case when the phrase view isn't showing cos no Image */
    private int image = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    //class constructor
    public Word(String english, String miwok, int speech){
        this.english = english;
        this.miwok = miwok;
        this.speech = speech;

    }

    public Word( String english, String miwok, int image, int speech){
        this.miwok = miwok;
        this.english = english;
        this.image = image;
        this.speech = speech;
    }

    //methods
    public String getMiwok(){
        return miwok;
    }

    public String getEnglish(){
        return english;
    }

    public int getImage(){
        return image;
    }

    public int getSpeech(){
        return speech;
    }

    /**method to check if the default id changed*/
    public boolean hasImage(){
        return image != NO_IMAGE_PROVIDED;
    }
}
