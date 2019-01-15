package sort;
//选择排序
//1.从数组第一个开始，与后面所有的数字进行对比
//2.如果出现比当前的数小的数，就进行变换（例如：a[0]开始，依次与a[1],1[2]...a[n]进行对比)
//3.如果出现后面的小，就进行数值交换，直到全部对比结束
public class choicesort {
    public static void main(String[] args) {
        int a[] = {1,3,2,8,9,6,4,4};
        int tempnum;
        int temp;
        for (int i = 0; i < a.length; i++) {
            tempnum = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[tempnum]>=a[j]){
                        tempnum = j;
                }
            }
            temp = a[i];
            a[i] = a[tempnum];
            a[tempnum] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
