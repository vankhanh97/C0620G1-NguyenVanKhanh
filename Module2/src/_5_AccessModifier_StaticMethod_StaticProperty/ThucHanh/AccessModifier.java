package _5_AccessModifier_StaticMethod_StaticProperty.ThucHanh;

public class AccessModifier {

//    class A{
//
//        private int data=40;
//
//        private void msg(){System.out.println("Hello java");}
//
//    }
//
//
//
//    public class Simple{
//
//        public static void main(String args[]){
//
//            A obj=new A();
//
//            System.out.println(obj.data);//Compile Time Error
//
//            obj.msg();//Compile Time Error
//
//        }
//
//    }

//    class A {
//
//        void msg() {
//            System.out.println("Hello");
//        }
//
//    }


//save by B.java


    //
//
//    class B{
//
//        public static void main(String args[]){
//
//            A obj = new A();//Compile Time Error
//
//            obj.msg();//Compile Time Error
//
//        }
//
//    }
    protected void msg() {
        System.out.println("Hello");
    }

}


class B extends AccessModifier {

    public static void main(String args[]) {

        B obj = new B();

        obj.msg();

    }

}

