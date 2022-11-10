package com.example.myapplication;

import android.graphics.Color;

/**
 * @authors Alex, Chase, Mohammad
 * @version 10/4/22
 * Class for Checker Tokens
 */

public class Token {

    private boolean isKing;
    private boolean isDark;

    public Token() {
        this.isKing = false;
        this.isDark = false;
    }

    public Token(Token orig) {
        this.isKing = orig.isKing;
        this.isDark = orig.isDark;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isDark() {
        return isDark;
    }

    public void setDark(boolean dark) {
        isDark = dark;
    }

    // toString should display isKing and isDark

    @Override
    public String toString(){
        String t = "";

        if (isDark) {
            t = t + "B";
        } else t = t + "R";

        if (isKing) t = t + "K";

        return t;
    }

}
