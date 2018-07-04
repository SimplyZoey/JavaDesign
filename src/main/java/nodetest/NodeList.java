package nodetest;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/7/3 20:14
 */
public class NodeList {
    private MyNode first = new MyNode(Integer.MAX_VALUE, null, null);
    private int length;

    public void addNode(MyNode node) {
        length++;
        MyNode current = first;
        MyNode next = current.getNext();

        if (next == null) {
            current.setNext(node);
            node.setPre(first);
            return;
        }

        while (next != null) {
            current = next;
            next = next.getNext();
            if (next == null) {
                current.setNext(node);
                node.setPre(current);
            }
        }
    }

    public void reversal() {
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

    private void swapNode(MyNode pre, MyNode current, MyNode next) {
        MyNode temp = next.getNext();
        current.setNext(temp);
        current.setPre(next);
        pre.setNext(next);
        next.setNext(current);
        next.setPre(pre);
    }

    public static void main(String[] args) {
        NodeList list = new NodeList();
        MyNode node;
        for (int i = 1; i <= 4; i++) {
            node = new MyNode(i, null, null);
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
