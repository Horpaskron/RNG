package rng;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Dice {


    public int sides;
    public int amount;
    public int modifier;

    static int getRandomNumber(int size) {
        return (int) (Math.random() * size);
    }

    static int rolldie(int numberOfDice, int numberofsides) {
        int result = 0;
        for (int x = 0; x < numberOfDice; x++) {
            int wurf = getRandomNumber(numberofsides)+1;
            result = result + wurf;
            System.out.println("Wurf : " + wurf);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("How many sides: ");
        int sides = scanner.nextInt();
        System.out.print("How many dies: ");
        int die = scanner.nextInt();
        System.out.print("Which modifier? ");
        int modifier = scanner.nextInt();
        int result = rolldie(die, sides) + modifier;
        System.out.println("Resultat: " + result);
    }
}

