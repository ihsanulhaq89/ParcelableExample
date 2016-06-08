package com.mac.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class A extends B implements Parcelable {
    private List<B> list;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(list);

    }

    public List<B> getList() {
        return list;
    }

    public void setList(List<B> list) {
        this.list = list;
    }

    // Creator
    public static final Parcelable.Creator CREATOR
            = new Parcelable.Creator() {
        public A createFromParcel(Parcel in) {
            return new A(in);
        }

        public A[] newArray(int size) {
            return new A[size];
        }
    };

    // "De-parcel object
    public A(Parcel in) {
        setName(in.readString());
        setList(in.readArrayList(A.class.getClassLoader()));
    }

    public  A(String name) {
        setName(name);
    }

}
