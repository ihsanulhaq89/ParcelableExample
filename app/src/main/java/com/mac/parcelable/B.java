package com.mac.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class B implements Parcelable {
    private String name;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
