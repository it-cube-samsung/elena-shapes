public class Main {
    public static void main(String[] args) {
        Square square = new Square(10, 10, 100);

        Square[] squares = new Square[10];
        Circle[] circles = new Circle[10];


        Shape[] shapes = new Shape[50];
        shapes[0] = square;
        Circle circle = new Circle(50, 50, 100);
        shapes[1] = circle;;



        System.out.println(getMaxArea(shapes));



    }

    static double getMaxArea(Shape[] shapes) {
        double max = 0;
        for (Shape s : shapes) {
            if (s != null) {
                System.out.println(s.getArea());
                if (max < s.getArea()) {
                    max = s.getArea();
                }
            }
        }
        return max;
    }
}
