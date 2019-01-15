package sort;
import java.util.ArrayList;
import java.util.Scanner;
//桶排序(假设一场考试，最高分为10分，将班级同学的成绩按照从小到大排序)
//实现思路：1.创建1个数组，最高分为10分，则有（0.1.2.3....10）十一种分数，就创建一个长度为11的数组
//         2.依次读取学生成绩，出现几分就在几的数组位置加1(例如，5分，就在a[5]上+1，计作有一个5分，依次类推)
//         3.再循环读取数组a,如果a[i]的值>0，就输出i的值，然后a[i]--,这样就完成简单的桶排序
public class bucketsort {
    public static void main(String[] args) {
        int []a = new int[11];
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            int mark = Integer.parseInt(strings[i]);
            a[mark]++;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; a[i]>0; j++) {
                System.out.print(i+" ");
                a[i]--;
            }
        }
    }
}
