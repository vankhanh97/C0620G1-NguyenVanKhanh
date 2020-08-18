package _12_JavaCollectionFramework.BaiTap.ArrayListLinkedListTrongJavaCollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

import static _12_JavaCollectionFramework.BaiTap.ArrayListLinkedListTrongJavaCollectionFramework.ProductManager.*;

public class Test {
    public static void main(String[] args) {
        while (true){
        System.out.println("1. Add product");
        System.out.println("2. Edit product");
        System.out.println("3. Show all product");
        System.out.println("4. Search product");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
            int productId = 0;
            switch (number) {
            case 1:
                productId++;
                System.out.println("Product" + productId + " :");
                Scanner sc1 = new Scanner(System.in);
                String nameProduct = sc1.nextLine();
                arrProduct.add(new Product(productId, nameProduct));
                break;
            case 2:
                System.out.println("Edit product :");
                Scanner sc2 = new Scanner(System.in);
                int a = sc2.nextInt();
                Scanner sc3 = new Scanner(System.in);
                String editedName = sc3.nextLine();
                edit(a, editedName);
                break;
            case 3:
                System.out.println(arrProduct);
                break;
            case 4:
                System.out.println("Search your car: ");
                Scanner scanner = new Scanner(System.in);
                String name = scanner.nextLine();
                searchByName(name);
                break;
        }

    }
}}
