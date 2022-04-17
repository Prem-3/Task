interface Shape {
    void draw();
}

interface Polygon extends Shape {
    double area = 0;
    double perimeter = 0;
    int noOfSides = 0;

    double getArea();

    double getPerimeter();

    boolean ispolygon();
}

class Triangle implements Polygon, Shape {
    String shape;
    double b, h, x, y, z;

    public Triangle(String shape, double b, double h, double x, double y, double z) {
        this.shape = shape;
        this.b = b;
        this.h = h;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void draw() {
        System.out.println("I am Of " + this.shape + " " + " Shape");
    }

    public boolean isPolygon() {
        System.out.println(this.shape + " is a polygon ");
        return true;
    }

    public double getArea() {
        return ((this.b * this.h) / 2);

    }

    public double getPerimeter() {
        return this.x + this.y + this.z;
    }
}

class Rectangle implements Polygon, Shape {
    String shape;
    double l, b;

    public Rectangle(String shape, double l, double b) {
        this.shape = shape;
        this.l = l;
        this.b = b;
    }

    public void draw() {
        System.out.println("I am Of " + this.shape + " " + "Shape");
    }

    public boolean isPolygon() {
        System.out.println(this.shape + " is a polygon ");
        return true;
    }

    public double getArea() {
        return (this.l * this.b);
    }

    public double getPerimeter() {
        return 2 * (this.l + this.b);
    }
}

class Line implements Shape {
    String shape = "line";

    public void draw() {
        System.out.println("I am of " + this.shape + " " + " shape");
    }
}

public class Inter {
    public static void main(String args[]) {
        Triangle tri = new Triangle("Triangle", 8, 6, 1, 2, 3);
        Rectangle rect = new Rectangle("Rectangle", 8, 6);
        Line l = new Line();
        tri.draw();
        tri.isPolygon();
        System.out.println("Area is: " + tri.getArea());
        System.out.println("perimeter is:" + tri.getPerimeter());
        System.out.println("----------------------");
        rect.draw();
        rect.isPolygon();
        System.out.println("Area is: " + rect.getArea());
        System.out.println("perimeter is:" + rect.getPerimeter());
        System.out.println("----------------------");
        l.draw();
    }
}