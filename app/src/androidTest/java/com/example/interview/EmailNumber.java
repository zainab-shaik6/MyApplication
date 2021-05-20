package com.example.interview;

import org.jetbrains.annotations.NotNull;

public class EmailNumber {

    @SerializedName("email")
    private String email;

    @SerializedName("number")
    private String number;

    public EmailNumber(String email, String number) {
        this.email = email;
        this.number = number;
    }

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

    @NotNull
    @Override
    public String toString() {
        return "EmailNumber{" +
                "email='" + email + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
