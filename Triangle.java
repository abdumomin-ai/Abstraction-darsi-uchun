public class Triangle extends GeometricFigure {

    @Override
    public void perimeter() {
        System.out.println("Triangel's perimeter");

    }

    @Override
    public void area() {
        System.out.println("Triangel's area");
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.perimeter();
        triangle.area();
    }


}
