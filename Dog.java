public class Dog extends Animal{


    @Override
    public void sound() {
        System.out.println("bow bow");
    }

    @Override
    public void getName() {
        System.out.println("Mr.NotCat");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();
        dog.sound();
    }
}
