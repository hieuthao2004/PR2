package tutorial_3;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private double discount;
    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.discount = 0;
    }
    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public void input() {
        this.name = getName();
        this.price = getPrice();
        this.discount = getDiscount();
    }

    private String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        while (name.isEmpty()) {
            System.out.println("Invalid input !");
            System.out.println("Enter name: ");
            name = sc.nextLine();
        }
        return name;
    }

    private double getPrice() {
        Scanner sc = new Scanner(System.in);
        double price;
        do {
            System.out.println("Enter price: ");
            while (!sc.hasNextDouble()) { //can enter 0, better than sc.hasNextLine()
                System.out.println("Invalid input !");
                System.out.println("Enter price: ");
                sc.nextLine();
            }
            price = sc.nextDouble();
            if (price < 0) {
                System.out.println("Price must be greater than or equal to 0");
            }
        } while (price < 0);
        return price;
    }

    private double getDiscount() {
        Scanner sc = new Scanner(System.in);
        double discount;
        do {
            System.out.println("Enter discount: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid input !");
                System.out.println("Enter discount: ");
                sc.nextLine();
            }
            discount = sc.nextDouble();
            if (discount < 0) {
                System.out.println("Discount must be greater than or equal to 0");
            }
        } while (discount < 0);
        return discount;
    }
    private double getImportTax() {
        return this.price*10/100;
    }

    public void display() {
        System.out.println("Product name: " + this.name);
        System.out.println("Unit price: " + (this.price - (this.discount/100*this.price) + getImportTax()));
        System.out.println("Discount: " + (this.discount/100*this.price));
        System.out.println("Import tax: " + getImportTax());
    }
}
