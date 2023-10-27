public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point A)
    {
        double dx = A.getX()-this.getX();
        double dy = A.getY()-this.getY();
        dx*=dx;
        dy*=dy;
        double p = Math.sqrt(dx+dy);
        return p;
    }
    public double distance(int x1,int y1)
    {
        double dx = this.getX()-x1;
        double dy = this.getY()-y1;
        dx*=dx;
        dy*=dy;
        double p = Math.sqrt(dx+dy);
        return p;
    }

    public double distance()
    {
        return distance(0,0);
    }
}
