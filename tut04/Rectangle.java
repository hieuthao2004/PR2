public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    Rectangle() {}

    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(float length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid");
        }
    }
    
    public float getLength() {
        return this.length;
    }


    public void setWidth(float width) {
        this.width = width;
    }
    public float getWidth() {
        return this.width;
    }


    double getArea() {
        double area = (this.length + this.width) *  2;
        return area;
    }

    double getPerimeter() {
        double per = this.length * this.width;
        return per;
    }

    public String toString() {
        String a = "Rectangle[length=" + this.length + ", width=" + this.width + "]";
        return a;
    }
}
