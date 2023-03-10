public class MyHeap {
    int [] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int [capacity];
        this.size=0;
    }
    public int remove(){
        if (size==0) throw new IllegalStateException();
        else{
            int result=items[0];
            items[0]=items[--size];
            bubbleDown();
            return result;
        }
    }

    public void bubbleDown() {
        int largerChildIndex;
        int index=0;
        while(index<=size&& !isValidParent(index)){
            largerChildIndex=largeChildIndex(index);
            swap(index,largerChildIndex);
            index=largerChildIndex;
        }

    }

    private int largeChildIndex(int index) {
        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)){
            return leftChildIndex(index);
        }
        return items[leftChildIndex(index)]>items[rightChildIndex(index)] ?leftChildIndex(index)
                :rightChildIndex(index);
    }

    public boolean isValidParent(int index) {
        if(!hasLeftChild(index)) return true;
        else{
            boolean isValid=items[index]>=items[leftChildIndex(index)];
            if (hasRightChild(index)){
                isValid &=items[index]>=items[rightChildIndex(index)];
        }
            return isValid;
        }

    }


    public boolean hasLeftChild(int index) {
        return leftChildIndex(index)<=size;
    }
    public boolean hasRightChild(int index) {
        return rightChildIndex(index)<=size;
    }

    private int leftChildIndex(int index) {
        return index*2+2;
    }
    private int rightChildIndex(int index) {
        return index*2-1;
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
