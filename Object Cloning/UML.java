import java.io.*;
import java.util.*;

class Point {
    private int x;
    private int y;

    Point() {
        System.out.println("default");
    }

    Point(int x, int y) {
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

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public double distance(Point point) {
        return Math.sqrt((this.x - point.x) * (this.x - point.x) - (this.y - point.y) * (this.y - point.y));
    }

}

class Line {
    private Point start;
    private Point end;

    Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double length() {
        Point pt = new Point();
        return pt.distance(this.start, this.end);
    }
}

public class UML {
    public static void main(String[] args) {

    }
}