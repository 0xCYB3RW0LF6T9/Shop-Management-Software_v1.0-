/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_managment_v1.pkg0;

/**
 *
 * @author CYB3R_W0LF
 */
public class Product_info {

    String id, name;
    int quantity;
    static int totalSold = 0;

    void set_info_products(String a, String b, int c) {
        name = a;
        id = b;
        quantity = c;
    }

    void sell(int a) {
        if (quantity == 0) {
            System.out.println("Out of stock");
        } else if (a <= quantity) {
            System.out.println("Product software updated");
            quantity -= a;
            totalSold += a;

        }

    }

    void alert() {

        if (quantity <= 3) {
            System.out.print("Low Stocks ! Please restock product ");
        }
    }

    void restoke(int a)
    {
        quantity +=a;
        System.out.print("Restoking successfull");
        
    }
    void show() {
        alert();

        System.out.println("Name = " + name + "\nID = " + id + "\nQuantity = " + quantity);

    }

}
