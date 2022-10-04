package com.example.myapplication;

import android.graphics.Color;

/**
 * @authors Alex, Chase, Mohammad, Sebastian
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

    // toString should display isKing and isDark

    @Override
    public String toString() {
        return isKing + "\n" + isDark;
    }

}
