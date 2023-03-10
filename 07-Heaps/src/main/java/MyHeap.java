public class MyHeap {
    int [] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int [capacity];
        this.size=0;
    }
    public void insert(int value){
        if(size==items.length) throw new IllegalStateException();
        else{
            items[size++]=value;
            bubbleUp();
        }
    }

    private void bubbleUp() {
        int index=size-1;
        while(index>0&& items[index]>items[parentIndex(index)]){
            swap(index,parentIndex(index));//current=current.next
            index=parentIndex(index);
        }
    }

    public void swap(int first, int second) {
        int temp=items[first];
        items[first]=items[second];
        items[second]=temp;

    }
    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(items[i]+", ");

        }
    }

    private int parentIndex(int index) {
        return (index-1)/2;
    }
}
