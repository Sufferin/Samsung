public class Rectangle {
    private Point a, b;

    public Rectangle(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public double getS(Point a, Point b){
        Point p = new Point(a.x, b.y);
        return a.getDistance(p) * b.getDistance(p);
    }
    public double getP(Point a, Point b){
        Point p = new Point(a.x, b.y);
        return (a.getDistance(p) * 2) + (2 * b.getDistance(p));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a = " + a +
                ", b = " + b + ", Perimetr = " + getP(a, b) + ", Area = " + getS(a,b) +
                '}';
    }
}
