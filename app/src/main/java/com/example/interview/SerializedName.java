package com.example.interview;

public @interface SerializedName {

    String value();
    /**
     * @return the alternative names of the field when it is deserialized
     */
    String[] alternate() default {};
}
