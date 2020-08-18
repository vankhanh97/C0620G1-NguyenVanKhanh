package _11_StackAndQueue.BaiTap.QueueSuDungLienKetVong;

public class Test {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.disPlayQueue());
    }
}