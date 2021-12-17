public class Triangle extends Shape {
    int x;
    int y;
    int sideA;
    int height;

    public Triangle (int x, int y, int sideA, int heightToSideA) {
        super("red");

        this.x = x;
        this.y = y;
        this.sideA = sideA;
        this.height = heightToSideA;
    }

    @Override
    double getArea() {
        return 0;
    }
}
