package animals;

public class Animal {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Animal() {}
    public Animal(int age) {
        this.age = age;
    }
    public void interact() {
        System.out.println("Petting animal ");
    }
    public void sound(){
        System.out.println("Default sound");
    }
}
