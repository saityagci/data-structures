public class LinkedListApp {
    public static void main(String[] args) {
     MySinglyLinkedList list1=new MySinglyLinkedList();
     int[] numbers ={1,1,2,2,2,3,3,3,4,5,6,7,7,7,8,9};
        for (int i = 0; i < numbers.length-1; i++) {
            list1.add(numbers[i]);
        }
        System.out.println("With Duplicated");
        list1.printNodes();
        System.out.println("Without Duplicated");
        list1.removeDuplicatesFromLinkedList();
        list1.printNodes();
        System.out.println("After reverse in one pass");
        list1.reverse();
        list1.printNodes();

//        for (int i = 0; i <11 ; i++) list1.add(i);
//        list1.printNodes();
//        System.out.println("Kth item from last is:  "+list1.getKthFromLast(4));
//        System.out.println(list1.head.value);
//        list1.deleteNode(0);
//        list1.printNodes();
//
//        System.out.println(list1.size);
//       list1.deleteNode(0);
//        list1.printNodes();
//        System.out.println(list1.indexOf(4));
//        System.out.println("After deleting "+5);
//        list1.printNodes();


    }
}
