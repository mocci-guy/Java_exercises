package net.hamburger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     /*
        LOGICAL OPERATORS START

        int x = 3;
        int y = 23;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("Max number is: " + Math.max(x, y));
        // is x is equal to max number?//

        boolean isXEqualToMax = Math.max(x, y) == x;
        boolean isYEqualToMax = Math.max(x, y) == y;
        System.out.println("is x is equal to max number? " + isXEqualToMax);
        System.out.println("is y is equal to max number? " + isYEqualToMax);

        boolean havingCheese = false;
        boolean havingBread = false;

        System.out.println();
        System.out.println();
        System.out.println();

        boolean sandwich = havingCheese && havingBread;
        System.out.println("Sandwich is " + sandwich);

         LOGICAL OPERATORS END
         */

        /*
        IF STATEMENTS I START

        int precentOfFuel = 3;    // in %
        int fuelTankCapcacity = 240;    // in liters
        int fuelFlowRate = 25;     // liters per kilometer
        int distanceToBase = 7;     // distance to base in kilometers

        int amountOfFuel = (fuelTankCapcacity/100)*precentOfFuel;
        int distanceRate = amountOfFuel/fuelFlowRate;

        if (precentOfFuel <= 5) {
            System.out.println("В баке меньше " + 5 + "% топлива, этого недостаточно для запуска двигателя");
        } else if (distanceRate < distanceToBase){
            System.out.println("Внимание,вам не хватит топлива чтобы добраться до базы");
            System.out.println("До базы: " + distanceToBase + " km");
            System.out.println("Вы сможете проехать только: " + distanceRate + " km");
        } else {
            System.out.println("До базы: " + distanceToBase + " km");
            System.out.println("*Brrrrt*");
        }

        IF STATEMENTS I END
        */


        /* IF STATEMENTS II START

        int fuelTankCapcacity = 430;    // in liters
        int fuelFlowRate = 17;     // liters per kilometer
        int distanceToBase = 7;     // distance to base in kilometers

        System.out.println("Введите количество топлива:");
        Scanner scanner = new Scanner(System.in);

        int amountOfFuel = scanner.nextInt();
        System.out.println("В баке на данный момент: " + amountOfFuel + " / " + fuelTankCapcacity + "л.");

        int distanceRate = amountOfFuel/fuelFlowRate;

        if (amountOfFuel <= 1) {
            System.out.println("В баке меньше " + 1 + "л. топлива, этого недостаточно для запуска двигателя");
        } else if (distanceRate < distanceToBase){
            System.out.println("Внимание,вам не хватит топлива чтобы добраться до базы");
            System.out.println("До базы: " + distanceToBase + " km");
            System.out.println("Вы сможете проехать только: " + distanceRate + " km");
        } else {
            System.out.println("До базы: " + distanceToBase + " km");
            System.out.println("Вы можете проехать: " + distanceRate + " km");
            System.out.println("*Brrrrt*");
        }

        // IF STATEMENTS II END */



        }
    }

