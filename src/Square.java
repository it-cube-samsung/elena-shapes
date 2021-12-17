public class Square extends Shape {
    int x;
    int y;

    Point corner;

    int sideA;

    public Square(int x, int y, int sideA) {
        super("black");
        this.x = x;
        this.y = y;
        this.sideA = sideA;
    }

    double getArea() {
        return sideA * sideA;
    }
}
