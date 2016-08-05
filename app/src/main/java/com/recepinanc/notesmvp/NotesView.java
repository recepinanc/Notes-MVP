package com.recepinanc.notesmvp;

import java.util.List;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public interface NotesView {

    void setNotes(List<String> notes);

    // Call this when a new note is added or one is removed just notify the adapter
    void updateNotes();
}
