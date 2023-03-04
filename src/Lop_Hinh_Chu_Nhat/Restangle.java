package Lop_Hinh_Chu_Nhat;

public class Restangle {
    double width,height;

    public Restangle() {
    }

    public Restangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "chiều dài = " + width + ", chiều rộng = " + height ;
    }
}
