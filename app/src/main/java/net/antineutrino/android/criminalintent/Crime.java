package net.antineutrino.android.criminalintent;

import java.util.UUID;

public class Crime {

    private UUID mID;
    private String mTitle;

    public Crime() {
        // generate a unique identifier
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
