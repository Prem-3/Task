abstract class Shape {
    String shape;
    double area;
    double perimeter;

    abstract double calculateArea();

    abstract double calculatePerimeter();

    abstract void draw();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void draw() {
        System.out.println("Rectangle Shape");
    }

    public double calculateArea() {
        return (this.length * this.breadth);
    }

    public double calculatePerimeter() {
        return (2 * (this.length + this.breadth));
    }

    @Override
    public String toString() {
        return "Rectangle [breadth=" + this.breadth + ", length=" + this.length + "]";
    }

}

class Square extends Shape {
    double s;

    public Square(double s) {
        this.s = s;
    }

    public void draw() {
        System.out.println("Square Shape");
    }

    public double calculateArea() {
        return (this.s * this.s);
    }

    public double calculatePerimeter() {
        return (4 * (this.s));
    }

    @Override
    public String toString() {
        return "Square [s=" + s + "]";
    }

}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle Shape");
    }

    public double calculateArea() {
        return (3.14 * (this.radius * this.radius));
    }

    public double calculatePerimeter() {
        return (2 * 3.14 * this.radius);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}

class AbstractDemo {
    public static void main(String args[]) throws NoSuchMethodError {
        try {
            Rectangle rect = new Rectangle(4.0, 4.0);

            rect.draw();
            System.out.println("Area of Rectangle is: " + rect.calculateArea());
            System.out.println("Perimeter of Rectangle is: " + rect.calculatePerimeter());
            System.out.println("------");
            Square sq = new Square(4.0);
            sq.draw();
            System.out.println("Area of Square is: " + sq.calculateArea());
            System.out.println("Perimeter of Square is: " + sq.calculatePerimeter());
            System.out.println("------");
            Circle ci = new Circle(1.5);
            ci.draw();
            System.out.println("Area of circle is: " + ci.calculateArea());
            System.out.println("Perimeter of circle is: " + ci.calculatePerimeter());
            System.out.println("------");
        } catch (NoSuchMethodError c) {
        }
    }
}
