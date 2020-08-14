package _10_DSADanhSach.BaiTap.ArrayListMethod;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(1);
        list.add(2);
        list.add(1, 10);
        for (Integer number : list) {
            System.out.println(number);
        }
        list.remove(1);
        for (Integer number : list) {
            System.out.println(number);
        }

    }
}
