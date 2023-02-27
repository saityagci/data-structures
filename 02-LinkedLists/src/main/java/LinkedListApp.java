public class LinkedListApp {
    public static void main(String[] args) {
     MySinglyLinkedList list1=new MySinglyLinkedList();
        for (int i = 0; i <5 ; i++) list1.add(i);
        list1.printNodes();
        System.out.println(list1.indexOf(4));
        System.out.println(list1.size);
        list1.deleteNode(4);
        System.out.println("After deleting "+5);
        list1.printNodes();


    }
}
