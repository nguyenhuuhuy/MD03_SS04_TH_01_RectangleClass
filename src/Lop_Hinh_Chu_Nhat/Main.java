package Lop_Hinh_Chu_Nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double height = scanner.nextDouble();
        Restangle restangle = new Restangle(width,height);
        System.out.println("Hình chữ nhật có \n" + restangle.display());
        System.out.println("chu vi của hình chữ nhật: " + restangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật: " + restangle.getArea());
    }
}
