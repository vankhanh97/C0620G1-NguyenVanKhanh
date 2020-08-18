package _10_DSADanhSach.BaiTap.LinkedListMethod;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst(3);
        myLinkedList.addLast(5);
        myLinkedList.add(1,9);
        System.out.println(myLinkedList);
    }
}
