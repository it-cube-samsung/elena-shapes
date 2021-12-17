public class Circle extends Shape {
    String color;
    int x;
    int y;
    Point center;
    int radius;
    public Circle (int x, int y, int radius) {
        super("blue");
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }

//    double getAre() {
//        return radius * radius * Math.PI;
//    }

}
