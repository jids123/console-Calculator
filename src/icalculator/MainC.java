package icalculator;

import java.util.Scanner;

public class MainC extends MainO{
    public static void main(String args[]){
    boolean swetch = true;
        while(swetch) {
            MainO calculate = new MainO();
            Scanner input1 = new Scanner(System.in);
            System.out.println("Input your first number:");
            int number1 = input1.nextInt();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Input your second number:");
            int number2 = input2.nextInt();

            Scanner input3 = new Scanner(System.in);
            System.out.println("Operation? 1. Add  2. Subtract  3. Multiply  4. Divide  5. Remainder");
            int number3 = input3.nextInt();

            switch (number3) {
                case 1 -> {
                    calculate.add(number1, number2);
                    break;
                }
                case 2 -> {
                    calculate.subtract(number1, number2);
                    break;
                }
                case 3 -> {
                    calculate.multiply(number1, number2);
                    break;
                }
                case 4 -> {
                    calculate.divide(number1, number2);
                    break;
                }
                case 5 -> {
                    calculate.remainder(number1, number2);
                    break;
                }
                default -> {
                    System.out.println("calculation failed... I wonder why...");
                    break;
                }
            }

            Scanner input4 = new Scanner(System.in);
            System.out.println("Continue? 1. Yes 2. No");
            int number4 = input4.nextInt();
            if (number4 == 1) {
                System.out.println("Oki Doki");
                swetch = true;
            }
            else if (number4 == 2) {
                System.out.println("Thank You for using Jamal Int Console Calculator");
                swetch = false;
            }
            else {
                System.out.println("INPUT ERROR: SHUTTING DOWN.");
                swetch = false;
            }
        }
    }
}
