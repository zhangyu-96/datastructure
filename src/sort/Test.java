package sort;

public class Test {
    public static void main(String[] args) {
        int []a = {6,1,2,7,9,3,4,5,10,8};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int a[],int left,int right){
        if(left > right){

            return;
        }
        int temp;
        int start = left;
        int end = right;
        int key = a[start];
        while (end>start){
            while (end>start&&a[end]>=key) {
                end--;
            }
                while ( end>start&&a[start]<=key){
                    start++;
                }
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        temp = a[left];
        a[left] = a[start];
        a[start] = temp;
        sort(a,left,start-1);
        sort(a,start+1,right);
        return;
        }
    }

