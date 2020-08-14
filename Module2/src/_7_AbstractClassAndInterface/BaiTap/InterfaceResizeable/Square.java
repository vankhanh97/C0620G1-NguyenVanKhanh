package _7_AbstractClassAndInterface.BaiTap.InterfaceResizeable;

import _6_KeThua.ThucHanh.HeCacDoiTuongHinhHoc.Rectangle;

public class Square extends Rectangle implements Resizeable{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getArea(){
        return getSide()*getSide();
    }


    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()+"Area is "+getArea()+"\n"+"After resize area is: "+resize();

    }

    @Override
    public double resize() {
        return (getArea()*Math.random())+ getArea();
    }
}
