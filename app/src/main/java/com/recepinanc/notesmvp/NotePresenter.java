package com.recepinanc.notesmvp;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public interface NotePresenter {

    // No need to use an extra interface bec. there's no interaction with Model
    void onLongClick(int position);

    // This will be called when the activity is on onResume
    // Meaning that the activity is created and ready to be filled with data
    void onResume();

    void removeNote(int position);

}
