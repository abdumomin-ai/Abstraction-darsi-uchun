public class Duck extends Animal{


    @Override
    public void sound() {
        System.out.println("quck quack");
    }

    @Override
    public void getName() {
        System.out.println("Mr.NotBeast");
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.getName();
        duck.sound();
    }
}
