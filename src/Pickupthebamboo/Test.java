package Pickupthebamboo;

public class Test {
    public static void show(Queue player){
        System.out.print(player.id+": ");
        int head = player.head;
        while (head<player.tail){
            System.out.print(player.parkers[head++]);
        }
        System.out.println();
    }
    public static void show(Stack stack){
        if (stack.top == -1){
            System.out.print("桌上没有牌");
        }
        int i = 0;
        int top = stack.top;
        while (i<=top){
            System.out.print(stack.tableparks[i++]);
        }
        System.out.println();
    }
}
