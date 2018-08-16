package com.activityandintent;

import android.os.Parcel;
import android.os.Parcelable;

public class NextDto implements Parcelable {

    //Data Transfer Object

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<NextDto> CREATOR = new Parcelable.Creator<NextDto>() {
        @Override
        public NextDto createFromParcel(Parcel in) {
            return new NextDto(in);
        }

        @Override
        public NextDto[] newArray(int size) {
            return new NextDto[size];
        }
    };
    private String name;
    private int age;

    public NextDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected NextDto(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}