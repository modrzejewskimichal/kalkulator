package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, c, d;
        String b;
        System.out.println("To jest kalkulator, policzy co chcesz");
        System.out.println("Podaj pierwszą liczbe");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        System.out.println("Podaj operator, do wyboru: +,-,*,/");
        Scanner B = new Scanner(System.in);
        b = B.nextLine();
        System.out.println("Podaj drugą liczbe");
        Scanner C = new Scanner(System.in);
        c = C.nextInt();
        A.close();
        B.close();
        C.close();
        switch (b) {
            case "+": {
                d = a + c;
                System.out.println("Twoj wynik to:" + d);
                break;
            }
            case "-": {
                d = a - c;
                System.out.println("Twoj wynik to:" + d);
                break;
            }
            case "*": {
                d = a * c;
                System.out.println("Twoj wynik to:" + d);
                break;
            }
            case "/": {
                if (c == 0) {
                    System.out.println("Nie dziel przez zero!");
                    break;
                } else
                    d = a / c;
                System.out.println("Twoj wynik to:" + d);

            }
            break;
            default: {
                System.out.println("Niepoprawny operator");
            }
        }
    }
    // write your code here
}