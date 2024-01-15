package com.navnitraj.dsa;

import java.util.Comparator;

public interface LinkedList<T> {
    public void insertHead(T data);
    public void insert(T data);
    public void insertAt(int index, T data);
    public void deleteHead();
    public void delete();
    public void deleteAt(int index);
    public void display();
    public int length();
    public CustomLinkedList reverse();
    public void sort(Comparator<Object> comparator);
    public void concat(CustomLinkedList list);
}
