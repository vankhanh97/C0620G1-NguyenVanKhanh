package _11_StackAndQueue.BaiTap.DaoNguocPhanTuTrongMangSuDungStack;


import java.util.ArrayList;

public class MyArray<E> {
    private ArrayList<E> stack;

    public MyArray() {
        stack = new ArrayList<>();
    }

    public void push(E i) {
        stack.add(i);
    }


}
