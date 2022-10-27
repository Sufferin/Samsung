public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPerimetr(){
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
    }
    public double getS(){
        double pol = getPerimetr() / 2;
        return Math.sqrt(pol * (pol - a.getDistance(b)) * (pol - b.getDistance(c)) * (pol - c.getDistance(a)));
    }
}
