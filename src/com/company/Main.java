package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Stack stack = new Stack();
        String command = scan.next();

        while (!command.equals("exit")) {
            switch (command) {
                case ("push"): {
                    stack.push(scan.nextInt());
                    break;
                }
                case ("pop") : {
                    stack.pop();
                    break;
                }
                case ("back") : {
                    stack.back();
                    break;
                }
                case ("size") : {
                    stack.size();
                    break;
                }
                case ("clear") : {
                    stack.clear();
                    break;
                }
            }


            command = scan.next();

        }
    }

}


