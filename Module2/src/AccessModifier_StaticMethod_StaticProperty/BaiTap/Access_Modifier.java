package AccessModifier_StaticMethod_StaticProperty.BaiTap;

public class Access_Modifier {
   public static class Circle {
        private double radius = 1.0;
        private String color = "red";

        public Circle() {
        }

        public Circle(double radius,String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }
         double getArea() {

            return 3.14 * this.radius * this.radius;
        }
    }

}
  class TestCircle {
    public static void main(String[] args) {
        Access_Modifier.Circle circle_1 = new Access_Modifier.Circle(2,"Blue");
        System.out.println(circle_1.getArea());
    }
}


