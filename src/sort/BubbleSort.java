package sort;
/*
冒泡排序：核心：相邻比较
1.从第一个开始，a[0]与a[1]进行比较，将较大的放在后面（a[0]如果比a[1]大，则进行交换），每次都是相邻交换
2.接着从第二个开始进行相邻比较，直到全部排序完成
 */
  /*
   1,2,6
   1,2,5,6
   1,2,5,4,6
   1,2,5,4,6
   1,2,5,4,6,8,9
   1,2,5,4,6,8,3,9,7
   1,2,5,4,6,8,3,7,9
  */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {10,3,6,2};

        int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
