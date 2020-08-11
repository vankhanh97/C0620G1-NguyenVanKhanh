package AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible;

import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Fruit.Apple;
import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Fruit.Fruit;
import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Fruit.Orange;

class TestFruit {
    public static void main(String[] args) {


        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}