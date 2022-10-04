package com.example.myapplication;

import android.graphics.Color;

/**
 * @authors Alex, Chase Ohmstede, Mohammad, Sebastian
 * @version 10/4/22
 * Class for Checker Tokens
 */

public class Token {

    private String id;
    private int color;

    public Token() {
        this.id = "black_1";
        this.color = Color.BLACK;
    }

    public Token(Token orig) {
        this.id = orig.id;
        this.color = orig.color;
    }

    @Override
    public String toString() {
        return id;
    }

}
