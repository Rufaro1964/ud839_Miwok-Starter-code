package com.example.android.miwok;

/*
*{@link word} represents a vocabulary word that user wants to learn.
*it contains a default translation adn a Miwok translation for that word.
 */
public class Word {

//Default translation of the work
    private String mDefaultTranslation;

    //Miwok translation for the word
    private String mMiwokTranslation;

    //image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final  int NO_IMAGE_PROVIDED = -1;

    /*
    *Create a new Word object.
    * @param defaultTranslation is the word in a language that the user is already familiar with
    *                           (such as English)
    * @param MiwokTranslation is the word in the Miwok language
     */

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*
     *Create a new Word object.
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param MiwokTranslation is the word in the Miwok language
     * @param imageResourceid is the drawable resource ID for the image assiated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
    }
    /*
    *Get the default translation of the word.
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*
    *Get the Miwok translation of the word.
     */
    public String getMiwokTranslation(){
        return  mMiwokTranslation;
    }

    /*
    *Return the image resource ID of the Word.
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }
    /*
    *returns an image if there is an image
     */
    public  boolean hasImage(){
        return  mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
