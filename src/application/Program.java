package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the number of times: ");
        int n = key.nextInt();

        Product[] products = new Product[n];

        double sum = 0.00;

        for (int i = 0; i < n; i++) {
            String name = key.next();
            double price = key.nextDouble();

            products[i] = new Product(name, price);

            sum += price;
        }

        double average = sum / products.length;
        System.out.println();
        System.out.println("AVERAGE PRICE = " + String.format("%.2f" , average));

    }
}
