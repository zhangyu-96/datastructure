package pickupthebamboo;
import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        Queue player1 = new Queue();
        Queue player2 = new Queue();
        player1.id = 1;
        player2.id = 2;
        Stack stack = new Stack();
        ArrayList<Queue> list = PartTools.givepark(PartTools.makeparks(), player1, player2);
        player1 = list.get(0);
        player2 = list.get(1);
        System.out.println("下面是初始化后各位的牌:");
        Test.show(player1);
        Test.show(player2);
        System.out.println("下面是初始化后的桌上的牌");
        Test.show(stack);
        Boolean b = false;
        while (player1.head<player1.tail||player2.head<player2.tail){
            if (b == false){
                System.out.println("游戏开始");
                b = true;
            }else {
                System.out.println("现在各位的手牌是");
                Test.show(player1);
                Test.show(player2);
                System.out.println("现在是桌子上的牌：");
                Test.show(stack);
            }
            if (player1.head == player1.tail){  //判断player1是否还有手牌
                System.out.println("player1 lose");
                return;
            }
            if (player2.head == player2.tail){  //判断player2是否还有手牌
                System.out.println("player2 lose");
                return;
            }
            PartTools.equal(player1,stack);
            System.out.println("现在各位的手牌是");
            Test.show(player1);
            Test.show(player2);
            System.out.println("现在是桌子上的牌：");
            Test.show(stack);
            PartTools.equal(player2,stack);

        }
    }

}
