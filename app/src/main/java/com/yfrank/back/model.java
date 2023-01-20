package com.yfrank.back;


public class model {
    String UNIVERSITY_TYPE_ID,NAME;
    public model(){

    }

    public model(String UNIVERSITY_TYPE_ID, String NAME) {
        this.UNIVERSITY_TYPE_ID = UNIVERSITY_TYPE_ID;
        this.NAME = NAME;
    }

    public String getUNIVERSITY_TYPE_ID() {
        return UNIVERSITY_TYPE_ID;
    }

    public void setUNIVERSITY_TYPE_ID(String UNIVERSITY_TYPE_ID) {
        this.UNIVERSITY_TYPE_ID = UNIVERSITY_TYPE_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}
