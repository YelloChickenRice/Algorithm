package LinkedList;

import static org.junit.Assert.*;

/**
 * created by IDEA
 *
 * @author: jinze
 * @Date: 18-5-18
 * @Time: 下午9:44
 */
public class MyLinkedListTest {


    public static void main(String args[]){
        MyLinkedList list=new MyLinkedList();
        list.addAtHead(0);list.printAll();
        list.get(1);
        list.addAtTail(2);list.printAll();
        list.addAtIndex(1,4);list.printAll();
        list.addAtHead(4);list.printAll();
        list.addAtIndex(1,4);list.printAll();
        list.addAtTail(5);list.printAll();
        list.addAtTail(2);list.printAll();
        list.addAtIndex(2,0);list.printAll();
        list.get(2);
        list.addAtTail(1);list.printAll();
        list.deleteAtIndex(0);list.printAll();
        list.deleteAtIndex(1);list.printAll();
        list.deleteAtIndex(5);list.printAll();
    }

}