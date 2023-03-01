public class DoublyLinkedList {
    public Node head;
    public Node tail;

    class Node {
        public int value;
        public Node prev;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){
        Node nodeToInsert=new Node(value);
        if (head==null) {
            head=nodeToInsert;
            nodeToInsert.prev=null;
            nodeToInsert.next=null;
            tail=nodeToInsert;
        }else {
            tail.next=nodeToInsert;
            nodeToInsert.next=null;
            nodeToInsert.prev=tail;
            tail=nodeToInsert;
        }
    }
    public void setHead(Node node) {
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
    }
    public void setTail (Node node){
        if (tail == null) {
            setHead(node);
            return;
        }
        insertAfter(tail, node);
    }


}
