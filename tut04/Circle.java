class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }


    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        double area = getRadius() * getRadius() * Math.PI;
        return area;
    }

    public void display() {
        String output = getRadius() + " " + getColor();
        System.out.println(output);
    }
    
}