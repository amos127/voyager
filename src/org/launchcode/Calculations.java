package org.launchcode;

import java.util.ArrayList;
import java.util.List;


public class Calculations {

        //finds the maximum streak of "yes" responses to boolean questions
        public static int maxTrueStreak(List<Boolean> boolList) {

            int longestStreak = 0;
            int currentStreak = 0;
            for (boolean item : boolList) {

                if (item == true) {
                    currentStreak++;

                    if (currentStreak > longestStreak) {
                        longestStreak = currentStreak;
                    }

                } else {
                    currentStreak = 0;
                }
            }

            return longestStreak;
        }

        //finds the maximum streak of "0" responses to integer questions
        public static int maxZeroStreak(List<Integer> intList) {

            int longestStreak = 0;
            int currentStreak = 0;
            for (int item : intList) {

                if (item == 0) {
                    currentStreak++;

                    if (currentStreak > longestStreak) {
                        longestStreak = currentStreak;
                    }

                } else {
                    currentStreak = 0;
                }
            }

            return longestStreak;
        }

        public static void main(String[] args) {
            ArrayList<Boolean> testBoolArray = new ArrayList<>();
            testBoolArray.add(true);
            testBoolArray.add(true);
            testBoolArray.add(true);
            testBoolArray.add(true);
            testBoolArray.add(false);
            testBoolArray.add(true);
            testBoolArray.add(true);
            testBoolArray.add(false);

            System.out.println(maxTrueStreak(testBoolArray));

            ArrayList<Integer> testIntArray = new ArrayList<>();
            testIntArray.add(2);
            testIntArray.add(2);
            testIntArray.add(2);
            testIntArray.add(2);
            testIntArray.add(0);
            testIntArray.add(0);
            testIntArray.add(0);
            testIntArray.add(5);

            System.out.println(maxZeroStreak(testIntArray));

        }


}

