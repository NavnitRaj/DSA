package com.navnitraj.dsa;

import com.navnitraj.dsa.skeltons.Node;

import java.util.Comparator;

public class CustomLinkedList<T> implements LinkedList<T> {
    Node<T> head=null;
    public void insertHead(T data){
        Node<T> newNode = new Node<>(data);
        if (head != null) {
            newNode.setNext(head);
        }
        head = newNode;
    }
    public void insert(T data){
        Node<T> newNode = new Node<>(data);
        Node curr = head;
        if(curr == null){
            insertHead(data);
        }else {
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
    }
    public void insertAt(int index, T data){
        if(index == 0){
            insertHead(data);
        }else{
            Node<T> newNode = new Node<>(data);
            Node curr = head;
            for(int i=1;i<index;i++){
                curr = curr.getNext();
            }
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
    }
    public void deleteHead(){
        if(head == null){
            System.out.println("Nothing to delete");
        }else{
            head = head.getNext();
        }
    }
    public void delete(){
        if(head == null){
            System.out.println("Nothing to delete");
        }else{
            Node curr = head;
            while (curr.getNext().getNext()!=null){
                curr = curr.getNext();
            }
            curr.setNext(null);
        }
    }
    public void deleteAt(int index){
        if(head == null){
            System.out.println("Nothing to delete");
        } else if (index == 0) {
            deleteHead();
        } else{
            Node curr = head;
            for(int i=1;i<index;i++){
                curr = curr.getNext();
            }
            if(curr.getNext() != null) {
                curr.setNext(curr.getNext().getNext());
            }
        }
    }
    public void display(){
        Node curr = head;
        while (curr.getNext()!=null){
            System.out.print(curr.getData()+" -> ");
            curr = curr.getNext();
        }
        System.out.println(curr.getData());
    }
    public int length(){
        int length = 0;
        Node curr = head;
        while (curr.getNext()!=null){
            length++;
            curr = curr.getNext();
        }
        return length+1;
    }
    public CustomLinkedList reverse(){
        CustomLinkedList list = new CustomLinkedList();
        Node curr = head;
        while(curr.getNext()!=null){
            list.insertHead(curr.getData());
            curr = curr.getNext();
        }
        list.insertHead(curr.getData());
        return list;
    }
    public void sort(Comparator<Object> comparator){
        int i,j;
        Node curr,next;
        int size = length();
        for(i=0;i<size-1;i++){
            curr = head;
            next = head.getNext();
            for(j=0;j<size-1-i;j++){
                if(comparator.compare(curr.getData(),next.getData())>0){
                    Object tempData = curr.getData();
                    curr.setData(next.getData());
                    next.setData(tempData);
                }
                curr = next;
                next = next.getNext();
            }
        }
    }
    public void concat(CustomLinkedList list){
        if(this.head.getData().getClass().equals(list.head.getData().getClass()) ) {
            Node curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(list.head);
        }else{
            System.out.println("Unable to concat");
        }
    }
}
