# datastructure
一个使用自定义队列和栈（没有使用Java封装的Queue和Stack）实现的双人接竹竿游戏，总共有36张牌，数字为1-9,4种花色
队列结构：
```
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
```
栈结构：
```
public class Stack {
    Parker[] tableparks = new Parker[35]; //Parker为扑克牌类
    int top = -1;
}
