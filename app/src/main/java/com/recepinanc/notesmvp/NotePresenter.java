package com.recepinanc.notesmvp;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public interface NotePresenter {

    // This will just show the position of the note
    void onClick(int position);

    // This will be called when the activity is on onResume
    // Meaning that the activity is created and ready to be filled with data
    void onResume();

}
