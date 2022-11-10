package com.example.myapplication;

import java.util.ArrayList;

public class CheckerState {

    // 0 = NULL, 1 = P1, 2 = P2
    private int currTurn;
    private int board_length;

    private ArrayList<Token> board = new ArrayList<Token>();
    private ArrayList<Token> light_captured = new ArrayList<Token>();
    private ArrayList<Token> dark_captured = new ArrayList<Token>();

    public CheckerState() {
        currTurn = 0;
        board_length = 8;
    }

    public CheckerState(CheckerState copy) {
        this.currTurn = copy.currTurn;
        this.board_length = copy.board_length;
    }

    public void new_game() {
        // C: remake game board to its original state
        Token black = new Token();
        black.setDark(true);

        Token red = new Token();
        red.setDark(false);

        for (int i = 0; i < board_length; i++) {

            for (int j = 0; j < board_length; j++) {

                // C: place black tokens
                if ((j == 0 || j == 2) && (i % 2 == 0)) {
                    board.add(black);
                }

                else if ((j == 1) && (i % 2 != 0)) {
                    board.add(black);
                }

                // C: place red tokens
                else if ((j == (board_length - 3) || j == (board_length - 1)) && (i % 2 != 0)) {
                    board.add(red);
                }

                else if ((j == (board_length - 2)) && (i % 2 == 0)) {
                    board.add(red);
                }

                // C: place NULL (empty spaces)
                
            }
        }
    }

    @Override
    public String toString() {
        String str = "GameState {\n" +
           "    currTurn = " + this.currTurn + "\n" +
           "    board_length = " + this.board_length + "\n" +
           "    board = {";
                for(int i = 0; i < this.board.size(); i++) {
                    str += this.board.get(i).toString() +
                   "\n}";
                }
                str += "    light_captured = { ";
                for(int j = 0; j < light_captured.size(); j++) {
                    str += light_captured.get(j).toString() + "\n}";
                }
                str += "    dark_captured = { ";
                for(int k = 0; k < dark_captured.size(); k++) {
                    str += dark_captured.get(k).toString() + "\n}";
                }
        str += " } ";
        return str;

    }

    public void switchTurn() {
        if (currTurn == 0) return;
        else if (currTurn == 1) currTurn = 2;
        else if (currTurn == 2) currTurn = 1;

        return;
    }
}
