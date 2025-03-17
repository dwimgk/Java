import animals.Animal;
import animals.Chicken;
import animals.Dog;
import animals.Horse;
import computers.Computer;
import computers.Desktop;
import computers.Laptop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.interact();

        Dog dog = new Dog();
        dog.interact();
        dog.sound();

        Horse horse = new Horse(2);
        horse.interact();
        horse.sound();

        Animal chicken = new Chicken();
        chicken.interact();
        Chicken sameChicken = (Chicken) chicken;
        sameChicken.sound();

        dog.setAge(2);
        System.out.println(dog.getAge());
        System.out.println(horse.getAge());

        Computer transformer = new Laptop();
        transformer.clickMouse();
        transformer = new Desktop();
        transformer.clickMouse();
    }
}
