package nodetest;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/7/3 20:15
 */
public class MyNode {
     private int item;
     private MyNode next;
     private MyNode pre;
     public MyNode(int item,MyNode next,MyNode pre){
          this.item = item;
          this.next = next;
          this.pre = pre;
     }

     public int getItem() {
          return item;
     }

     public void setItem(int item) {
          this.item = item;
     }

     public MyNode getNext() {
          return next;
     }

     public void setNext(MyNode next) {
          this.next = next;
     }

     public MyNode getPre() {
          return pre;
     }

     public void setPre(MyNode pre) {
          this.pre = pre;
     }
}
