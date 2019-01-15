package pickupthebamboo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PartTools {
    public static ArrayList<pickupthebamboo.Parker> makeparks(){ //实现生成牌（初始化）功能
        ArrayList<pickupthebamboo.Parker> parkers = new ArrayList<>();
        String[] numbers = {"1","2","3","4","5","6","7","8","9"};
        String[] colors = {"♥","♠","♦","♣"};
        for (String number : numbers) {
            for (String color : colors) {
                parkers.add(new pickupthebamboo.Parker(number,color));
            }
        }
        Collections.shuffle(parkers);
        return parkers;
    }
    public static ArrayList<Queue> givepark(ArrayList<Parker> parkers, Queue player1, Queue player2){ //实现给两位玩家发牌功能
        Iterator<Parker> iterator = parkers.iterator();
        while (iterator.hasNext()){
            player1.parkers[player1.tail++] = iterator.next();
            player2.parkers[player2.tail++] = iterator.next();
        }
        ArrayList<Queue> lists = new ArrayList<>();
        lists.add(player1);
        lists.add(player2);
        return lists;
    }
    public static void equal(Queue player,Stack stack){
        Parker playerparker = player.parkers[player.head]; // 玩家要出的牌
//        if (stack.top == -1){
//            stack.tableparks[++stack.top] = player.parkers[player.head++];
//            return;
//        }
        for (int i = stack.top; i >-1 ; i--) {
         if(playerparker.getNumber() == stack.tableparks[i].getNumber()){ //有玩家赢了牌，进行操作
             System.out.println("*****恭喜玩家"+player.id+"赢"+(stack.top-i+2)+"张牌*****");
//             System.out.println(" ");
             stack.tableparks[++stack.top] = player.parkers[player.head++];
             ArrayList<Parker> winparks = new ArrayList<>();
             while (stack.top>=i){      ///!!!!
                 winparks.add(stack.tableparks[stack.top--]);
//                 stack.top--;
             }
//             System.out.println("数组的长度是"+winparks.size());
//             System.out.println("数组里的数是");
//             for (Parker winpark : winparks) {
//                 System.out.print("");
//             }


             Collections.shuffle(winparks);
             System.out.print("玩家"+player.id+"添加了：");
             for (Parker winpark : winparks) {
                 player.parkers[player.tail++] = winpark;
                 System.out.print(winpark+" ");
             }
             System.out.println(" ");
             return;
         }
        }
        stack.tableparks[++stack.top] = player.parkers[player.head++];
    }
}
