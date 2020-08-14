package DSADanhSach.BaiTap.LinkedListMethod;

import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(3);
        myLinkedList.addLast(5);
        System.out.println(myLinkedList);
    }
}
