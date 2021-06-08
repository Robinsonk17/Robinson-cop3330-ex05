package oop.exercises;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */

public class Main
{
    public static void main(String[] args)
    {
        int firstNumber, secondNumber, pSum, pDiff, pMult, pDiv;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        firstNumber = input.nextInt();
        System.out.print("What is the second number? ");
        secondNumber = input.nextInt();

        pSum = firstNumber + secondNumber;
        pDiff = firstNumber - secondNumber;
        pMult = firstNumber * secondNumber;
        pDiv = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + pSum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + pDiff);
        System.out.println(firstNumber + " * " + secondNumber + " = " + pMult);
        System.out.println(firstNumber + " / " + secondNumber + " = " + pDiv);

    }
}
