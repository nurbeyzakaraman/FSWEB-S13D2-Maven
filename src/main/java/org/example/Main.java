package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //Palindrom Sayılar
    public static boolean isPalindrome(int number) {
        int original = Math.abs(number);
        int temp = original;
        int reversed = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversed = (reversed * 10) + lastDigit;
            temp = temp / 10;
        }

        return original == reversed;
    }

    //Mükemmel Sayıları Bulma
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    //Sayıları Kelimelere Dök
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String numStr = String.valueOf(number);
        String result = "";

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);

            switch (digit) {
                case '0':
                    result += "Zero ";
                    break;
                case '1':
                    result += "One ";
                    break;
                case '2':
                    result += "Two ";
                    break;
                case '3':
                    result += "Three ";
                    break;
                case '4':
                    result += "Four ";
                    break;
                case '5':
                    result += "Five ";
                    break;
                case '6':
                    result += "Six ";
                    break;
                case '7':
                    result += "Seven ";
                    break;
                case '8':
                    result += "Eight ";
                    break;
                case '9':
                    result += "Nine ";
                    break;
            }
        }
        return result.trim();
    }
}
