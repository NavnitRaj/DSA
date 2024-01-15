

import dsa.CustomLinkedList;
import dsa.genericlasses.GenericEmployee;

import java.util.Comparator;

public class LinkedListExample {
    public static void main(String[] args) {
        System.out.println("LinkedList");
        CustomLinkedList list = new CustomLinkedList();
        list.insertHead(3);
        list.insert(5);
        list.insert(6);
        list.insertHead(3);
        list.display();
        list.delete();
        list.display();
        list.deleteAt(0);
        list.display();
        list.deleteAt(2);
        list.display();
        list.deleteHead();
        list.display();
        CustomLinkedList list1 = new CustomLinkedList();
        list1.insertHead(new GenericEmployee(1,"Raj"));
        list1.insert(new GenericEmployee(2,"Navnit"));
        list1.insert(new GenericEmployee(5,"Chetan"));
        System.out.println(list1.length());
        list1.insertHead(new GenericEmployee(4,"Harshith"));
        list1.display();
        list1.concat(list);
        list1.sort(Comparator.comparing(GenericEmployee::getName));
        list1.display();
        list1.reverse().display();
        list1.display();
        list1.delete();
        list1.display();
        list1.deleteAt(0);
        list1.display();
        list1.deleteAt(2);
        list1.display();
        list1.deleteHead();
        list1.display();
        list1.concat(list);
        list1.display();
    }
}