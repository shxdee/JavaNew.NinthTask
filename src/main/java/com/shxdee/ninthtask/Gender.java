package com.shxdee.ninthtask;

public enum Gender {
    MALE, FEMALE;

    public int compare(Gender gender) {
        if(this == gender) {return 0;}
        else if(this == MALE && gender == FEMALE) {
            return -1;
        }
        return 1;
    }
}
