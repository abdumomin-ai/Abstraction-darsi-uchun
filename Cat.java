public class Cat extends Animal{


    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public void getName() {
        System.out.println("Mr.NotDog");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName();
        cat.sound();
    }
}
