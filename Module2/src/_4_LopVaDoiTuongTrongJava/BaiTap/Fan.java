package _4_LopVaDoiTuongTrongJava.BaiTap;

public class Fan {
    private int Speed = 1;
    private boolean On = true;
    private double Radius = 10;
    private String Color = "blue";

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }

    public boolean isOn() {
        return On;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Fan() {
        this(3, true, 10, "red");

    }

    public Fan(int Speed, boolean On, double Radius, String Color) {
        this.Speed = Speed;
        this.On = On;
        this.Radius = Radius;
        this.Color = Color;

    }

    public String toString() {
        if (this.Speed == 1 && this.On) {
            return "Speed: Slow " + "\n" + " Color: " + this.Color
                    + "\n" + " Radius: " + this.Radius + "\n" + " Fan is on ";
        } else if (this.Speed == 2 && this.On) {
            return "Speed: Medium " + "\n" + " Color: " + this.Color
                    + "\n" + " Radius: " + this.Radius + "\n" + " Fan is on ";
        } else if (this.Speed == 3 && this.On) {
            return "Speed: Fast " + "\n" + " Color: " + this.Color
                    + "\n" + " Radius: " + this.Radius + "\n" + " Fan is on ";
        } else if (this.Speed == 1) {
            return "Speed: Medium " + "\n" + " Color: " + this.Color
                    + "\n" + " Radius: " + this.Radius + "\n" + " Fan is off ";
        } else if (this.Speed == 2) {
            return "Speed: Medium " + "\n" + " Color: " + this.Color
                    + "\n" + " Radius: " + this.Radius + "\n" + " Fan is off ";
        } else {
            return "Speed: Medium \n" + " Color: " + this.Color + "\n"
                    + " Radius: " + this.Radius + "\n" + " Fan is off ";
        }
    }

    public static void main(String[] args) {
        Fan fan_1 = new Fan(3, true, 10, "Red");
        Fan fan_2 = new Fan(1, false, 4, "Orange");
        Fan fan_3 = new Fan();
        System.out.println(fan_3);
    }
}


