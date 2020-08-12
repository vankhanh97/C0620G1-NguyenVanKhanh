package AbstractClassAndInterface.ThucHanh.InterfaceComparable;

public class Circle {
    private double radius = 1.0;
    private String color = "Black";
    private boolean filled = false;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return   "Radius's Circle "+getRadius()+
                "\n"+
                "Color 's Circle "+getColor()+"\n"+ isFilled();
    }
}
