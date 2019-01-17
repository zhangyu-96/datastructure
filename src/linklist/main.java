package linklist;

import java.util.Scanner;

public class  main {
    public static void main(String[] args) {
        start();
//        System.out.println();
//        LinkLine linkLine = new LinkLine(10);
//        linkLine.insertNode(20);
//        linkLine.insertNode(15);
//        linkLine.delectNode(15);
//        linkLine.printLinkLine();
    }
    public static void start(){
        System.out.println("--------------使用链表进行排序----------------");
        System.out.println("请输入你要进行排序的数，空格作为分隔，Enter结束");
        String[] split = new Scanner(System.in).nextLine().split(" ");
        LinkLine linkLine = new LinkLine(0);
        for (int i = 0; i < split.length; i++) {
            linkLine.insertNode(Integer.parseInt(split[i]));
        }
        System.out.println("..................排序中......................");
        linkLine.printLinkLine();
    }
}
