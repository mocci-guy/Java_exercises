package net.hamburger;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                                                            /* // LOGICAL OPERATORS START

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

                                                           //  LOGICAL OPERATORS END   */



                                                             /* // IF STATEMENTS I START

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

                                                            //  IF STATEMENTS I END */



                                                             /*  // IF STATEMENTS II START

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



                                                             /*  //  EXERCISE START

        int rightAnswersCount = 0;
        //---------------------//
        System.out.println("Q1: В каком году началась Первая Мировая Война?: ");
        Scanner scanner1 = new Scanner(System.in);
        String firstQuestionAnswer = scanner1.next();
        switch(firstQuestionAnswer) {
            case "1914":
                rightAnswersCount++;
                break;
            default: System.out.println("Неправильно! Правильный ответ - 1914");
        }
        //---------------------//
        System.out.println("Q2: Столицей какой страны является Киев?: ");
        Scanner scanner2 = new Scanner(System.in);
        String secondQuestionAnswer = scanner2.next();
        secondQuestionAnswer = secondQuestionAnswer.toUpperCase();
        switch(secondQuestionAnswer) {
            case "УКРАИНА":
                rightAnswersCount++;
                break;

            default: System.out.println("Неправильно! Правильный ответ - Украина");
        }
        //---------------------//
        System.out.println("Q3: Самая высокая гора в мире?: ");
        Scanner scanner3 = new Scanner(System.in);
        String thirdQuestionAnswer = scanner3.next();
        thirdQuestionAnswer = thirdQuestionAnswer.toUpperCase();
        switch(thirdQuestionAnswer) {
            case "ЭВЕРЕСТ":
                rightAnswersCount++;
                break;
            default: System.out.println("Неправильно! Правильный ответ - Эверест");
        }
        //---------------------//
        if (rightAnswersCount == 3){
            System.out.println("Викторина закончилась! Поздравляем, все ответы верны, 3/3");
        } else {
            System.out.println("Викторина закончилась! Правильных ответов: " + rightAnswersCount + " / 3");
        }
                                                                // EXERCISE END */



        // https://www.w3schools.com/java/java_ref_string.asp ----------- String methods
        // http://proglang.su/java/strings  ------------------ String methods RU



        /* float drob = 1.000001f;
        int num = (int)Math.ceil(drob);
        System.out.println(num); */



                                                            /*   //   EXERCISE II START

        String[] questions = new String[3];
        questions[0] = "Q1: В каком году началась Первая Мировая Война?: ";
        questions[1] = "Q2: Столицей какой страны является Киев?: ";
        questions[2] = "Q3: Самая высокая гора в мире?: ";

        String[] answers = new String[3];
        answers[0] = "1914";
        answers[1] = "киев";
        answers[2] = "эверест";

        System.out.println(questions[0]);
        Scanner scanner1 = new Scanner(System.in);
        String firstQuestionAnswer = scanner1.next();
        String message = (firstQuestionAnswer.equals(answers[0])) ? "Ответ верный!" : "Ответ неверный!";
        System.out.println(message);

        System.out.println(questions[1]);
        Scanner scanner2 = new Scanner(System.in);
        String secondQuestionAnswer = scanner2.next();
        message = (secondQuestionAnswer.equals(answers[1])) ? "Ответ верный!" : "Ответ неверный!";
        System.out.println(message);

        System.out.println(questions[2]);
        Scanner scanner3 = new Scanner(System.in);
        String thirdQuestionAnswer = scanner3.next();
        message = (thirdQuestionAnswer.equals(answers[2])) ? "Ответ верный!" : "Ответ неверный!";
        System.out.println(message);

                                                           //    EXERCISE II END      */



                                                            /*   // EXERCISE III LOOP START
        String[] questions = new String[3];
        questions[0] = "Q1: В каком году началась Первая Мировая Война?: ";
        questions[1] = "Q2: Столицей какой страны является Киев?: ";
        questions[2] = "Q3: Самая высокая гора в мире?: ";

        String[] answers = new String[3];
        answers[0] = "1914";
        answers[1] = "украина";
        answers[2] = "эверест";

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            Scanner scanner = new Scanner(System.in);
            String questionAnswer = scanner.next();
            questionAnswer = questionAnswer.toLowerCase();
            String message = (questionAnswer.equals(answers[i])) ? "Ответ верный!" : "Ответ неверный!";
            System.out.println(message);
        }
                                                             // EXERCISE III LOOP END */



                                                            /*  //  LOOPS START
        String[] modules = new String[4];
        modules[0] = "motor";
        modules[1] = "tracks";
        modules[2] = "canon";
        modules[3] = "fuelTank";

        for (String module : modules){
            System.out.println(module);
        }
                                                            // LOOPS END */



                                                            // EXERCISE IV  METHODS START
        String[] questions = new String[3];
        questions[0] = "Q1: В каком году началась Первая Мировая Война?: ";
        questions[1] = "Q2: Столицей какой страны является Киев?: ";
        questions[2] = "Q3: Самая высокая гора в мире?: ";

        String[] answers = new String[3];
        answers[0] = "1914";
        answers[1] = "украина";
        answers[2] = "эверест";

        answerCheckFunction(questions, answers);
                                                            // EXERCISE IV  METHODS END
        }

    public static void answerCheckFunction(String[] questions, String[] answers){
        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            Scanner scanner = new Scanner(System.in);
            String questionAnswer = scanner.next();
            questionAnswer = questionAnswer.toLowerCase();
            String message = (questionAnswer.equals(answers[i])) ? "Ответ верный!" : "Ответ неверный!";
            System.out.println(message);
        }
    }

    }

