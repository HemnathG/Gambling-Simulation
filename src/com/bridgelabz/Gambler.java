package com.bridgelabz;

public class Gambler {

    int bet = 1;
    int amount = 100;

    public static void main(String[] args) {
        int stake =100;
        while(stake>50 && stake <150) {
            int bet = (int) (Math.floor(Math.random() * 10) % 2);
            if (bet == 1) {
                System.out.println("WON the Game");
                stake++;
            } else {
                System.out.println("LOOSE the Game");
                stake--;
            }
        }
        System.out.println("Amount After the game :" +stake);
    }
}
