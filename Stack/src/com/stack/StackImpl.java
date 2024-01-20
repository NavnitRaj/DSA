package com.stack;

import java.util.Arrays;

public class StackImpl<T> implements Stack {

    static final int size = 2;
    final int incrementalSize = 1;
    static int count = 0;
    static int lastPointer = 0;
    static Object[] array = new Object[size];

    @Override
    public void push(Object data) {
        if(count == array.length){
            array = Arrays.copyOf(array,array.length+incrementalSize);
        }
        array[lastPointer] = data;
        lastPointer++;
        count++;
    }

    @Override
    public Object pop() {
        Object obj = array[lastPointer-1];
        array[lastPointer-1] = null;
        lastPointer--;
        int counter = 0;
        while(counter<array.length && array[counter]!=null){
            counter++;
        }
        count = counter;
        array = Arrays.copyOf(array,count);
        return obj;
    }

    @Override
    public void display() {

        System.out.print(Arrays.toString(array));
        System.out.println();
    }
}
