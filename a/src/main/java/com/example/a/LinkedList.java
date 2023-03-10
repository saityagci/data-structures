package com.example.a;

public class LinkedList {
// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //
    //////////////////////////////////////////////////////////////


    public Node head;
    public Node tail;
   public  int length;

    public LinkedList() {

        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    boolean isEmpty(){
        return head==null;
    }
    public void add(int value){
        Node newNode= new Node(value);
        if (isEmpty()){
            head=tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }
  void delete(int value){
        if (isEmpty()) System.out.println("empty");
        Node current= head;
        Node pre=head;
        while(current!=null){
            if (current.value==value){
            if (current==tail){
                tail=pre;
                pre.next=null;
            }}
            pre = current;
            current = current.next;
        }
    }
    void deleteNode(int value) {
        if (isEmpty()) System.out.println("No values with the value send!!!");
        Node current = head;
        Node prev = head;
        while (current != null) {
            if (current.value == value) {// if you find a match
                if (current == head) { // if the item tobe deleted is the head
                    head = current.next;
                    current.next = null;// will be available for garbage collection
                } else if (current == tail) {// if the item tobe deleted is the tail
                    tail = prev;
                    prev.next = null;
                } else {// if the item tobe deleted is in the middle
                    prev.next = current.next;
                    current.next = null;
                }
                length--;// decrease the size once you
            }
            prev = current;
            current = current.next;
        }

    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

}
