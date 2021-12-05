package com.company;

import java.util.SplittableRandom;

public class Main {
/*
    private static void exerciseName()
    {

    }

* */

    public static void main(String[] args) {

        conditionalBranching();

        morningAtBobs();

        codeMagnets();

        beTheCompiler();

        mixedMessage();

        poolPuzzle();
    }

    private static void poolPuzzle() {
        //Pool Puzzle
        int q = 0;
        while (q < 4) {
            System.out.print("a");
            if (q < 1) {
                System.out.print(" ");
            }
            System.out.print("n");

            if (q > 1) {
                System.out.print(" oyster");
                q = q + 2;
            }
            if (q == 1) {
                System.out.println("noys");
            }
            if (q < 1) {
                System.out.println("oise");
            }
            System.out.print("");
            q = q + 1;

        }
    }

    private static void mixedMessage() {
        //Mixed Message (c1, p23)
//1
        int d = 0;
        int e = 0;
        while (d < 5) {
            e = e + 2;
            if (e > 4) {
                e = e - 1;
            }
            System.out.print(d + "" + e + " "); // 02 14 25 36 47
            d = d + 1;
        }
        System.out.println();
//2
        int f = 0;
        int h = 0;
        while (f < 5) {
            h = f - h;
            System.out.print(f + "" + h + " "); // 00 11 21 32 42
            f = f + 1;
        }
        System.out.println();

//3
        int i = 0;
        int j = 0;
        while (i < 5) {
            j = j + i;
            System.out.print(i + "" + j + " "); // 00 11 23 36 410
            i = i + 1;
        }
        System.out.println();

//4
        int k = 0;
        int l = 0;
        while (k < 5) {
            k = k + 1;
            l = l + k;
            System.out.print(k + "" + l + " "); // 11 34 59
            k = k + 1;
        }
        System.out.println();

//5
        int m = 0;
        int n = 0;
        while (m < 5) {
            if (n < 5) {
                m = m + 1;
                if (n < 3) {
                    m = m - 1;
                }
            }
            n = n + 2;
            System.out.print(m + "" + n + " "); // 02 14 36 48
            m = m + 1;
        }
        System.out.println();
    }

    private static void beTheCompiler() {
        //Be the compiler (c1, p21)
//A
        int a = 1;
        while (a < 10) {
            a = a + 1;
            if (a > 3) {
                System.out.println("big a");
            }
        }

        //B
        int b = 5;
        while (b > 1) {
            b = b - 1;
            if (b < 3) {
                System.out.println("small b");
            }
        }

        //C
        int c = 5;
        while (c > 1) {
            c = c - 4;
            if (c < 3) {
                System.out.println("small c");
            }
        }
    }

    private static void conditionalBranching() {
        //Conditional Branching. DooBeeDooBeeDo (c1, p13)
        int g = 1;
        while (g < 2) {
            System.out.print("Doo");
            System.out.print("Bee");
            g = g + 1;
        }
        if (g == 2) {
            System.out.println("Do");
        }
    }

    private static void morningAtBobs() {
// Monday morning at Bob`s (c1, p16)
        String[] wordList1 = {"24/7", "multy", "30000", "single"};
        String[] wordList2 = {"Yerevan", "Armenia", "USA"};
        String[] wordLine3 = {"Anjela", "Christina", "Zara"};

        //How many words in each list
        int oneLength = wordList1.length;
        int twoLength = wordList2.length;
        int threeLength = wordLine3.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        System.out.println(rand1);
        int rand2 = (int) (Math.random() * twoLength);
        System.out.println(rand2);
        int rand3 = (int) (Math.random() * threeLength);
        System.out.println(rand3);

        //build phrase
        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " " + wordLine3[rand3];
        System.out.println(phrase);
    }

    private static void codeMagnets() {
        //Code Magnets (c1, p20)
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 2) {
                System.out.print("b c");
            }
            if (x == 1) {
                System.out.println("d");
                x = x - 1;
            }
        }
    }
}