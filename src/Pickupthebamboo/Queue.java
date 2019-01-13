package Pickupthebamboo;

import java.util.ArrayList;
import java.util.Arrays;

public class Queue {
    Parker parkers[] = new Parker[1000]; //玩家牌的队列
    int head = 0;
    int tail = 0;
    int id;
    @Override
    public String toString() {
        ArrayList<Parker> list = new ArrayList<>();
        for (int i = head; i <tail ; i++) {
            list.add(parkers[i]);
        }
        return list.toString();
    }
}
