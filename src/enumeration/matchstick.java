package enumeration;

import java.util.HashMap;
import java.util.Scanner;

/*
假设手中有n(n<=24)个火柴棍，希望拼出A+B=C的等式，等式中的A.B.C均是使用火柴棍拼出来的整数（若该数非0，且最高位不能为0），数字0-9所需要的火柴棍数量如下：
0 - 6   1 - 2   2 - 5   3 - 5   4 - 4   5 - 5   6 - 6   7 - 3   8 - 7   9 - 6
注意：
1.加号和等号各自需要两个火柴棍
2.如果A!=B,则A+B=C和B+A=C视为不同的等式（A,B,C都大于0）。
3.所有火柴棍都要用上
 */
public class matchstick {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        n = n-4;  //去除等号和加号的4个火柴棍
        HashMap<Integer, Integer> hashMap = getmap();
        enumeration(n,hashMap);

    }

    //初始化map,将每个数字和对应的火柴棍数存入map中
    public static HashMap<Integer,Integer> getmap(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0,6);
        hashMap.put(1,2);
        hashMap.put(2,5);
        hashMap.put(3,5);
        hashMap.put(4,4);
        hashMap.put(5,5);
        hashMap.put(6,6);
        hashMap.put(7,3);
        hashMap.put(8,7);
        hashMap.put(9,6);
        return hashMap;
    }
    public static void enumeration(int n,HashMap<Integer,Integer> hashMap){
        if(n<6){
            System.out.println("无法拼出等式");
            return;
        }else {
            for (int i = 0; i <= 1111; i++) { //最多24个火柴棍，减去等号和加号用去的4个火柴棍，数字1需要的火柴棍最少，需要2个，那么20个最多可以拼成10个1，那么每个数最多有4个1
                for (int j = 0; j <=1111; j++) {
                    int k = i + j;
                            if (getnumber(i,hashMap)+getnumber(j,hashMap)+getnumber(k,hashMap) == n){
                                System.out.println(i+"+"+j+"="+k);
                            }
                }
            }
        }

    }
    //得到需要多少火柴棍
    public static int getnumber(int n,HashMap<Integer,Integer> hashMap){
        int sum = 0;
        while (n/10!=0){ // 如不是个位数，就把它分开（如123，分隔成1 2 3 在分别计算火柴棍数然后相加）
            sum += hashMap.get(n%10);
            n = n/10;
        }
        sum += hashMap.get(n);
        return sum;
    }

}
