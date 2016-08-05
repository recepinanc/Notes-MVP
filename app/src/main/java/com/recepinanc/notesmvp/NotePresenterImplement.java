package com.recepinanc.notesmvp;

import java.util.List;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public class NotePresenterImplement implements NotePresenter, GetNotesInteraction.OnGetNotesFromModel {

    private NotesView notesView;
    private GetNotesInteraction getNotesInteraction;

    public NotePresenterImplement(NotesView notesView, GetNotesInteraction getNotesInteraction) {
        this.notesView = notesView;
        this.getNotesInteraction = getNotesInteraction;
    }

    @Override
    public void onLongClick(int position) {
        notesView.removeNote(position);
    }

    @Override
    public void onResume() {
        getNotesInteraction.getNotesFromModel();
    }

    @Override
    public void onGetNotes(List<String> items) {
        notesView.setNotes(items);
    }
}
