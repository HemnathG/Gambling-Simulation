package com.bridgelabz;

public class Gambler {

    int bet = 1;
    int amount = 100;

    public static void main(String[] args) {
        int bet = (int) (Math.floor(Math.random() * 10) % 2);
        if (bet == 1) {
            System.out.println("WON the Game");
        } else {
            System.out.println("LOOSE the Game");
        }
    }
}
