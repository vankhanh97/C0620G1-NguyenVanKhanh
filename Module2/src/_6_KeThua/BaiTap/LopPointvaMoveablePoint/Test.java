package _6_KeThua.BaiTap.LopPointvaMoveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
            MoveablePoint moveablePoint_1 = new MoveablePoint();
            MoveablePoint moveablePoint_2 = new MoveablePoint(5, 5);
            MoveablePoint moveablePoint_3 = new MoveablePoint(5, 5,10,10);

            System.out.println("moveablePoint_1 : " + moveablePoint_1);
            System.out.println("moveablePoint_2 : " + moveablePoint_2);
            System.out.println("moveablePoint_3 : " + moveablePoint_3);

            moveablePoint_1.setXY(10, 10);
            System.out.println("moveablePoint_1 : " + moveablePoint_1);

            moveablePoint_3.setSpeed(95, 95);
            System.out.println("moveablePoint_3 : " + moveablePoint_3);

            System.out.println("moveablePoint_3 : " + Arrays.toString(moveablePoint_3.getSpeed()));

            System.out.println("moveablePoint_3 : " + moveablePoint_3.move());
        }

}
