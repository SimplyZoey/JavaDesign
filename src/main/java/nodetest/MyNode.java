package nodetest;

/**
 * @Author: shtian
 * @Description:
 * @Date: Create in 2018/7/3 20:15
 */
public class MyNode {
     private int item;
     private MyNode next;

     public MyNode(int item,MyNode next){
          this.item = item;
          this.next = next;
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

}
