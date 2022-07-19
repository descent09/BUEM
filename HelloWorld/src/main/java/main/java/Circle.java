package main.java;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getDiametr(){
        return this.getRadius() * 2;
    }

    public double getArea(){
        return 3.14 * this.getRadius() * this.getRadius();
    }

    public double getPerimetr(){
        return 2 * 3.14 * this.getRadius();
    }

}
