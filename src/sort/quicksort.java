package sort;

public class quicksort {
    public static void main(String[] args) {
        int a[] = {6,1,2,7,9,3,4,5,10,8};
        sort(a,0,a.length-1);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int a[],int left,int right){
        int temp;
        if (left>right){
            return;
        }
        int start = left;
        int end = right;
        int key = a[start];
        while (start<end){
            while (start<end&&a[end]>=key){
                end--;
            }
            while (start<end&&a[start]<=key){
                start++;
            }
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        }
        temp= a[left];
        a[left]= a[start];
        a[start] = temp;
        sort(a,left,start-1);
        sort(a,start+1,right);
        return;
    }

}
