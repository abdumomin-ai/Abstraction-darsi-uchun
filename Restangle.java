public class Restangle extends GeometricFigure{


    @Override
    public void perimeter() {
         System.out.println("Restangel's perimeter");
    }

    @Override
   public void area() {
        System.out.println("restangel's area");
    }

    public static void main(String[] args) {
        Restangle restangle = new Restangle();
        restangle.perimeter();
        restangle.area();
    }
}
