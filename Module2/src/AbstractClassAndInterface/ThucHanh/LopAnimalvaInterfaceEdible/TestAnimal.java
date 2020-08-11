package AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible;


import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Animal.Animal;
import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Animal.Chicken;
import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.Animal.Tiger;
import AbstractClassAndInterface.ThucHanh.LopAnimalvaInterfaceEdible.edible.Edible;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal Animal : animals) {
            System.out.println(Animal.makeSound());

            if (Animal instanceof Chicken) {
                Edible edibler = (Chicken) Animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
