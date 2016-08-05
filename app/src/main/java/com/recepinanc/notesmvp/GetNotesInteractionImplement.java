package com.recepinanc.notesmvp;

import java.util.Arrays;
import java.util.List;

/**
 * Created by recepinanc on 05/08/16.with <3
 */
public class GetNotesInteractionImplement implements GetNotesInteraction {

    @Override
    public List<String> getNotesFromModel() {
        return notes();
    }

    // This is the model part
    private List<String> notes() {
        return Arrays.asList(
                "Note 1",
                "Note 2",
                "Note 3",
                "Note 4",
                "Note 5",
                "Note 6",
                "Note 7",
                "Note 8",
                "Note 9",
                "Note 10",
                "Note 11",
                "Note 12"
        );
    }
}
