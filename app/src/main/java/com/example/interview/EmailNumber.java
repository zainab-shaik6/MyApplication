package com.example.interview;

import android.os.Parcel;
import android.os.Parcelable;

public class EmailNumber implements Parcelable{
    private String email;
    private String number;

    public EmailNumber() {
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(number);
        dest.writeString(email);
    }
    private EmailNumber(Parcel in) {
        this.number = in.readString();
        this.email = in.readString();
    }
    public static final Parcelable.Creator<EmailNumber> CREATOR = new Parcelable.Creator<EmailNumber>() {
        @Override
        public EmailNumber createFromParcel(Parcel source) {
            return new EmailNumber(source);
        }
        @Override
        public EmailNumber[] newArray(int size) {
            return new EmailNumber[size];
        }
    };
    @Override
    public int describeContents() {
        return hashCode();
    }


    @NotNull
    @Override
    public String toString() {
        return "EmailNumber{" +
                "email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}