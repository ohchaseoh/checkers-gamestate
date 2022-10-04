package com.example.myapplication;

import java.util.ArrayList;

public class CheckerState {

    // 0 = NULL, 1 = P1, 2 = P2
    private int currTurn;

    private ArrayList<Token> board = new ArrayList<Token>();
    private ArrayList<Token> light_captured = new ArrayList<Token>();
    private ArrayList<Token> dark_captured = new ArrayList<Token>();

    public CheckerState() {

    }

    public CheckerState(CheckerState copy) {

    }
    /*
    @Override
    public String toString() {
        return NULL;
    }
    */

    public void switchTurn() {
        if (currTurn == 0) return;
        else if (currTurn == 1) currTurn = 2;
        else if (currTurn == 2) currTurn = 1;

        return;
    }

}
