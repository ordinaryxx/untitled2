package com.company;

import java.util.ArrayList;

public class Stack {

    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int n) {
        stack.add(n);
        System.out.println("ok");
    }

    public void pop() {
        if(stack.size() != 0) {
            int size = stack.size();
            System.out.println(stack.get(size - 1));
            stack.remove(size - 1);
        }
    }

    public void back() {
        int size = stack.size();
        System.out.println(stack.get(size - 1));
    }

    public void size() {
        System.out.println(stack.size());
    }

    public void clear() {
        int size = stack.size();
        for (int i = 0; i <= size - i; i++) {
            stack.remove(i);
        }
        System.out.println("ok");
    }

    public void exit() {

        System.out.println("bye");
    }
}
