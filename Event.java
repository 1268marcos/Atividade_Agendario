package com.example.agendiario;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "events")


public class Event {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo( name = "eventId")
    private int mId;
    @NonNull
    @ColumnInfo(name = "eventCreationDate")
    private String mCreationDate;
    @Nullable
    @ColumnInfo(name = "eventDescription")
    private String mDescription;

    public Event(String mCreationDate, String mDescription, String mPlace, int mScore) {
        this.mCreationDate = mCreationDate;
        this.mDescription = mDescription;
        this.mPlace = mPlace;
        this.mScore = mScore;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmCreationDate() {
        return mCreationDate;
    }

    public void setmCreationDate(String mCreationDate) {
        this.mCreationDate = mCreationDate;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmPlace() {
        return mPlace;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public int getmScore() {
        return mScore;
    }

    public void setmScore(int mScore) {
        this.mScore = mScore;
    }

    @ColumnInfo(name = "eventPlace")
    private String mPlace;
    @ColumnInfo(name = "eventScore")
    private int mScore;

}
                
