package linklist;

public class LinkLine {
    //定义单链表
    Node headNode =new Node();
    public LinkLine(int data) {
        headNode.data = data;
        headNode.next = new Node();
    }
    public Node getHead(){
        return headNode;
    }
    //定义节点
    public class Node{
        int data;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize();
            System.out.println("被释放了");
        }
    }

    //LinkLine方法
    //添加末尾节点
    public void addNode(int data){
        Node node = headNode;
        while (node.next!=null){
            node =node.next;
        }
        node.next = new Node(data);
}
    //按照节点值从小到大顺序添加节点
    public void insertNode(int data){
        Node node = headNode;
        while (node.next.data<data&&node.next.next!=null){
            node = node.next;
        }
        Node insertNode = new Node(data);
        insertNode.next = node.next;
        node.next = insertNode;
    }
    //输出所有节点的值
    public void printLinkLine(){
        Node node = headNode.next;
        while (node.next!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }

    public void delectNode(int data){
        Node node = headNode;
        while (node.next.next!=null){
            if(node.next.data==data){
                node.next = node.next.next;
                break;
            }
            node = node.next;
        }
    }


//   //获取最后一个节点
//    public Node getLastNode(){
//        Node node = headNode;
//        while (node.next!=null){
//            node = node.next;
//        }
//        return node;
//    }
}

