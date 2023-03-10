package com.example.a;

public class main {

    public static void main(String[] args) {


        LinkedList a=new LinkedList();
        a.add(2);
        a.add(4);
        a.add(42);
        a.add(44);
        System.out.println("\nLinked List:");
        a.printList();
        a.getHead();
        a.getLength();
        a.getTail();
        a.delete(42);
        a.printList();
        System.out.println("\nLinked List:");
        a.printList();




        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }
}





