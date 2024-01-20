package com.stack;

import dsa.genericlasses.GenericEmployee;

public class StackMain {
    public static void main(String[] args) {
        Stack stack = new StackImpl();
        stack.push(1);
g        stack.display();
        stack.push(2);
        stack.display();
        stack.push(3);
        stack.display();
        System.out.print("Pop Element: "+stack.pop().toString());
        stack.display();
        stack.push(4);
        stack.display();
        stack.push(new GenericEmployee(1,"Raj"));
        stack.display();
        stack.push(new GenericEmployee(2,"Navnit"));
        stack.display();
        stack.push(new GenericEmployee(5,"Chetan"));
        stack.display();
        stack.push(new GenericEmployee(4,"Harshith"));
        stack.display();
        System.out.println("Pop Element: "+stack.pop().toString());
        System.out.println("Pop Element: "+stack.pop().toString());
        System.out.println("Pop Element: "+stack.pop().toString());
        stack.display();
    }
}
