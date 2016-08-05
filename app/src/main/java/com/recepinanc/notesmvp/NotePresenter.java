package com.recepinanc.notesmvp;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public interface NotePresenter {

    // No need to use an extra interface bec. there's no interaction with Model
    void onLongClick(int position);

    void getNotes();
}
