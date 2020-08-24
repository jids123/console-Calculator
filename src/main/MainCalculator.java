package main;


import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to jamal's calculator");
        boolean loop = true;
        while (loop == true) {

        Scanner one = new Scanner(System.in);
        System.out.println("input a number");
        int numberOne = one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.println("input a second number");
        int numberTwo = two.nextInt();

        Scanner three = new Scanner(System.in);
        System.out.println("What would you like to do with them?(type number)\n" +
                            "1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int numberThree = three.nextInt();
        switch (numberThree) {
            case 1:
                System.out.println("Your Result is");
                add(numberOne, numberTwo);
                break;
            case 2:
                System.out.println("Your Result is");
                subtract(numberOne, numberTwo);
                break;
            case 3:
                System.out.println("Your Result is");
                multiply(numberOne, numberTwo);
                break;
            case 4:
                System.out.println("Your Result is");
                divide(numberOne, numberTwo);
                break;
        }

        Scanner yesNo = new Scanner(System.in);
        System.out.println("Would you still like to continue? (1=yes, 2=no)");
            int noYes = yesNo.nextInt();
        if(noYes == 1){
            System.out.println("Okay then");
        }
        else if(noYes == 2) {
            System.out.println("thanks for using jamalculator");
            loop = false;
        }
        else{
            System.out.println("you madman.");
            loop = false;
        }
        }

    }


    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void subtract(int a, int b){
        System.out.println(a-b);
    }
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }
    public static void divide(int a, int b){
        System.out.println(a/b);
    }
}
