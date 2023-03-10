public class BinarySearch {
    public static void main(String[] args) {
        int [] array=new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        System.out.println(binarySearchIterative(array,3));
    }
    public static  int binarySearchIterative(int [] array, int data){
        int left =0;
        int right= array.length-1;
        while(left<-right){
            int middle=(left+right)/2;
            if(array[middle]==data) return middle;
            if (data<array[middle]) right=middle-1;
            else left=middle+1;
        }
        return -1;
    }

}
