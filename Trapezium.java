public class Trapezium extends GeometricFigure{

    @Override
    public void perimeter() {
        System.out.println("Trapesium's perimeter");
    }

    @Override
    public void area() {
        System.out.println("Trapesiu,'s area");
    }

    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium();
        trapezium.perimeter();
        trapezium.area();
    }
}
