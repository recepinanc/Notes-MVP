package com.recepinanc.notesmvp;

import java.util.List;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public interface GetNotesInteraction {

    void getNotesFromModel(OnGetNotesFromModel onGetNotesFromModel);

    interface OnGetNotesFromModel {
        void onGetNotes(List<String> items);
    }

}
