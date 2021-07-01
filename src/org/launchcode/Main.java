package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> logDates = new ArrayList<>();
        ArrayList<Integer> moodScore = new ArrayList<>();
        ArrayList<Integer> energyLevel = new ArrayList<>();
        ArrayList<Boolean> hadBreakfast = new ArrayList<>();
        ArrayList<Boolean> hadLunch = new ArrayList<>();
        ArrayList<Boolean> hadDinner = new ArrayList<>();
        ArrayList<Boolean> tookMeds = new ArrayList<>();
        ArrayList<Boolean> didExercise = new ArrayList<>();
        ArrayList<Integer> servingsAlcohol = new ArrayList<>();
        ArrayList<Integer> servingsCaffeine = new ArrayList<>();
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter daily summary? (y/n)");
        String response = input.next();

        while(response.equals("y")) {
            System.out.println("Enter the day of the week: ");
            logDates.add(input.next());
            System.out.println("Enter mood score: ");
            moodScore.add(input.nextInt());
            System.out.println("Enter energy level: ");
            energyLevel.add(input.nextInt());
            System.out.println("Did you eat breakfast? ");
            hadBreakfast.add(input.nextBoolean());
            System.out.println("Did you eat lunch? ");
            hadLunch.add(input.nextBoolean());
            System.out.println("Did you eat dinner? ");
            hadDinner.add(input.nextBoolean());
            System.out.println("Did you take your medicines? ");
            tookMeds.add(input.nextBoolean());
            System.out.println("Did you exercise? ");
            didExercise.add(input.nextBoolean());
            System.out.println("How many drinks did you have today? ");
            servingsAlcohol.add(input.nextInt());
            System.out.println("How many caffeinated drinks did you have today? ");
            servingsCaffeine.add(input.nextInt());
            System.out.println("Enter daily summary? (y/n)");
            response = input.next();

            if(response.equals("n")) {
                input.close();
                double moodAverage = 0;
                double energyAverage = 0;
                int daysLogged = 0;
                double breakfastTrueMood = 0;
                int breakfastTrueDays = 0;
                double breakfastFalseMood = 0;
                int breakfastFalseDays = 0;
                for (String day : logDates) {
                    int i = logDates.indexOf(day);
                    moodAverage += moodScore.get(i);
                    energyAverage += energyLevel.get(i);
                    daysLogged += 1;

                    if(hadBreakfast.get(i) == true) {
                        breakfastTrueMood += moodScore.get(i);
                        breakfastTrueDays += 1;
                    } else {
                        breakfastFalseMood += moodScore.get(i);
                        breakfastFalseDays += 1;
                    }

                    System.out.println("Summary for " + day
                            + "\nMood Score: " + moodScore.get(i)
                            + "\nEnergy level: " + energyLevel.get(i)
                            + "\nHad breakfast: " + hadBreakfast.get(i)
                            + "\nHad lunch: " + hadLunch.get(i)
                            + "\nHad dinner: " + hadDinner.get(i)
                            + "\nTook medicine: " + tookMeds.get(i)
                            + "\nExercised: " + didExercise.get(i)
                            + "\nNumber of alcoholic drinks: " + servingsAlcohol.get(i)
                            + "\nNumber of caffeinated drinks: " + servingsCaffeine.get(i)
                            + "\n**********");
                }

                System.out.println("Average mood score: " + moodAverage/daysLogged
                    + "\nAverage energy score: " + energyAverage/daysLogged
                    + "\nAverage mood score w breakfast: " + breakfastTrueMood/breakfastTrueDays
                    + "\nAverage mood score w/o breakfast: " + breakfastFalseMood/breakfastFalseDays);
            }
        }
    }
}
