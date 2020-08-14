package _6_KeThua.BaiTap.CircleClassAndCyclinderClass;

public class Cyclinder extends Circle {
    private double height = 1.0;

    Cyclinder() {
    }

    Cyclinder(double radius, String color, double hight) {
        super(radius, color);
        this.height = hight;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * this.getRadius() * Math.PI;
    }

    @Override
    public String toString() {
        return
                "Volume's Cyclinder " + getVolume() + "\n" +
                        super.toString();


    }
}
