package icalculator;

public class MainO {
    int c;

    public void add(int a, int b){
        c = a + b;
        System.out.println("The result is "+c);
    }

    public void subtract(int a, int b){
        c = a - b;
        System.out.println("The result is "+c);
    }

    public void multiply(int a, int b){
        c = a * b;
        System.out.println("The result is "+c);
    }

    public void divide(int a, int b){
        c = a / b;
        System.out.println("The result is "+c);
    }
}
