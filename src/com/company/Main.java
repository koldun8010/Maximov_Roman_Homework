package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String check;
        int start = 0;
        int finish = 2147483647;
        while (start <= finish) {
            int middle = finish / 2 + start / 2;
            System.out.print("Estimated number is: ");
            System.out.print(middle);
            System.out.print('\n');
            System.out.print("Input sign of comparsion with the hidden\n");
            check = in.nextLine();
            if (check.equals(">")) {
                start = middle + 1;
                System.out.print(start);
                System.out.print('\n');
            } else if (check.equals("<")) {
                finish = middle - 1;
                System.out.print(finish);
                System.out.print('\n');
            } else if (check.equals("=")) {
                System.out.print("Your number is: ");
                System.out.print(middle);
                break;
            }
        }
    }
}
