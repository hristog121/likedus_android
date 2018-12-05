package com.codeitfactory.linkedus_android;
import android.view.View;

public class Listitem extends MainActivity {

    private String Stirnghead;
    private String Stringdescrip;

    public String getStirnghead() {
        return Stirnghead;
    }

    public String getStringdescrip() {
        return Stringdescrip;
    }

    public Listitem(View itemView, String stirnghead, String stringdescrip) {
        //super(itemView);
        Stirnghead = stirnghead;
        Stringdescrip = stringdescrip;


    }
}

