
package com.example.android.multi;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    private int imageResourceId = HAS_IMAGE;

    private static final int HAS_IMAGE = -1;

    private int mAudioResourceId;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param image              is the drawable resource id for the image asset
     * @param audioResourceId   is the raw resource id for the audio
     */
    public Word(String defaultTranslation, String miwokTranslation, int image,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResourceId = image;
        mAudioResourceId = audioResourceId;
        //containImage=true;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId   is the raw resource id for the audio
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
        //containImage=false;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the img of the word.
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean containImage() {
        return imageResourceId != HAS_IMAGE;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }


    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
