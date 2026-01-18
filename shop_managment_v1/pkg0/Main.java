package shop_managment_v1.pkg0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Employ_info[] e = new Employ_info[100];
        Manager_info[] m = new Manager_info[100];
        Product_info[] p = new Product_info[100];
        int maxProduct = 0, maxEmployee = 0;
        int maxManager = 0;

        int employCount = 0;

        while (true) {
            System.out.println("\n1. Input Employee information");
            System.out.println("2. Input Manager information");
            System.out.println("3. Input Product information");
            System.out.println("4. View all Employee information");
            System.out.println("5. View all Manager information");
            System.out.println("6. View all Product information");
            System.out.println("7. Update Product DataBase");
            System.out.println("8. Restoke Product information");

            System.out.println("0. Exit");

            System.out.print("Enter your input = ");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                System.out.println("Program terminated.");
                break;
            }

            if (choice == 1) {
                System.out.print("Enter total Employee = ");
                int max_employ = input.nextInt();
                input.nextLine();
                maxEmployee = max_employ;

                for (int j = 0; j < max_employ; j++) {
                    System.out.print("Enter Employee name = ");
                    String name = input.nextLine();

                    System.out.print("Enter Employee id = ");
                    int id = input.nextInt();
                    input.nextLine();

                    e[employCount] = new Employ_info();
                    e[employCount].set_info(name, id);
                    employCount++;
                }
            }
            if (choice == 2) {
                System.out.print("Enter total Manager number = ");
                int max_Manager = input.nextInt();
                input.nextLine();
                maxManager = max_Manager;
                for (int i = 0; i < max_Manager; i++) {
                    System.out.print("Enter Manager Name = ");
                    String name = input.nextLine();
                    System.out.print("Enter Manager ID = ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Manager Branch = ");
                    String branch = input.nextLine();
                    m[i] = new Manager_info();
                    m[i].set_info(name, id);
                    m[i].set_info_m(branch);

                }

            }
            if (choice == 3) {
                System.out.println("Enter max product = ");
                int max_Product = input.nextInt();
                input.nextLine();
                maxProduct = max_Product;
                for (int i = 0; i < max_Product; i++) {
                    System.out.print("Enter name for product = ");
                    String name = input.nextLine();
                    System.out.print("Enter ID = ");
                    String id = input.nextLine();
                    System.out.print("Enter quantity = ");
                    int quantity = input.nextInt();
                    input.nextLine();
                    p[i] = new Product_info();
                    p[i].set_info_products(name, id, quantity);

                }
            }
            if (choice == 4) {
                // view all Employee information)
                for (int i = 0; i < maxEmployee; i++) {
                    e[i].show_e();
                }

            }
            if (choice == 5) {
                //5. View all Manager information"
                System.out.println("Printing Manager Information ");
                for (int i = 0; i < maxManager; i++) {
                    m[i].show_m();
                }

            }
            if (choice == 6) {

                //view all Product information
                for (int i = 0; i < maxProduct; i++) {
                    System.out.print("Item id = "+i+"\n");
                    p[i].show();
                }
            }
            if (choice == 7) {
                int amount;
                System.out.print("Enter the selling amount of product = ");
                amount = input.nextInt();
                input.nextLine();
                System.out.print("Enetr ID of the product = ");
                int id = input.nextInt();
                input.nextLine();
                p[id].sell(amount);

            }
            if (choice == 8) {
                System.out.print("Enter the Restoking amount of product = ");
                int amount = input.nextInt();
                input.nextLine();
                System.out.print("Ente the product id = ");
                int id = input.nextInt();
                input.nextLine();
                p[id].restoke(amount);

            }
        }

    }
}
