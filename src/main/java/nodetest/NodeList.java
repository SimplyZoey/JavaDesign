package nodetest;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/7/3 20:14
 */
public class NodeList {
    private MyNode first = new MyNode(Integer.MAX_VALUE, null);
    private int length;

    public void addNode(MyNode node) {
        length++;
        MyNode current = first;
        MyNode next = current.getNext();

        //为空，表示当前节点为链表中的第一个节点
        if (next == null) {
            current.setNext(node);
        } else {
            while (next != null) {
                current = next;
                next = next.getNext();
                if (next == null) {
                    current.setNext(node);
                }
            }
        }
    }

    public void reversal() {
        if (length > 1) {
            int swapTimes = length / 2;
            MyNode pre = first;
            MyNode current = first.getNext();
            MyNode next = current.getNext();
            for (int i = 0; i < swapTimes; i++) {
                swapNode(pre, current, next);
                if (i < swapTimes - 1) {
                    pre = current;
                    current = current.getNext();
                    next = current.getNext();
                }
            }
        }
    }

    private void swapNode(MyNode pre, MyNode current, MyNode next) {
        MyNode temp = next.getNext();
        current.setNext(temp);
        pre.setNext(next);
        next.setNext(current);
    }

    public static void main(String[] args) {
        NodeList list = new NodeList();
        MyNode node;
        for (int i = 1; i <= 4; i++) {
            node = new MyNode(i, null);
            list.addNode(node);
        }

        list.reversal();

        MyNode next = list.first.getNext();
        while (next != null) {
            System.out.println(next.getItem());
            next = next.getNext();
        }
    }

}
