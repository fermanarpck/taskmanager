package com.example.stringmanipulation;

import java.util.Scanner;

public class StringManipulationApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String input = scanner.nextLine();

        System.out.println("String'in uzunluğu: " + getLength(input));
        System.out.println("Ters çevrilmiş string: " + reverseString(input));
        System.out.println("Bir karakter giriniz: ");
        char ch = scanner.next().charAt(0);
        System.out.println("'" + ch + "' karakterinin sayısı: " + countCharacter(input, ch));
        System.out.println("Büyük harfli string: " + toUpperCase(input));
        System.out.println("Küçük harfli string: " + toLowerCase(input));
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int countCharacter(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }
}
