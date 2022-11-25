package com.company;

public class Recursion_1 {
    static int count = 0;
    static void number() {
        count++;
        if (count <= 5) {
            System.out.println(count);
            number();
        }
    }
    public static void main(String[] args) {
        number();
    }
}
