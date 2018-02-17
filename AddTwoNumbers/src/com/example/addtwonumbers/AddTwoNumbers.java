package com.example.addtwonumbers;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int result = computeNumbers(x, y);
        System.out.println("Adding x and y: " + result);
    }

    private static int computeNumbers(int x, int y) {
        return (x + y)*210 + x + y;
    }
}
