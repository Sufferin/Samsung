
public class Point {
    public void setX(double x) {
        if( x >= 0 && x <= 1000) {
            this.x = x;
        }
    }
    public double getX(Point a){
        this.x = x;
        return this.x;
    }
    public double getY(Point a){
        this.y = y;
        return this.y;
    }

    public void setY(double y) {
        if( x>= 0 && x <= 1000) {
            this.y = y;
        }
    }

    double x;
    double y;
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getDistance(Point p){
        return Math.sqrt((this.x - p.x) * (this.x - p.x) +(this.y - p.y) * (this.y - p.y));
    }
}
