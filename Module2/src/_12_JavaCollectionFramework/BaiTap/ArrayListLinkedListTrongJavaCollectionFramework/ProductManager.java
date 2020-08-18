package _12_JavaCollectionFramework.BaiTap.ArrayListLinkedListTrongJavaCollectionFramework;


import java.util.*;

public class ProductManager {
    public static ArrayList<Product> arrProduct = new ArrayList<>();
    public static LinkedList<Product> linkedProduct = new LinkedList<>();

    public static void edit(int id, String name) {
        for (Product item : arrProduct) {
            if (item.getId() == id) {
                item.setProductName(name);

                break;
            }
        }
    }

    public static String searchByName(String name) {
        for (Product item : arrProduct) {
            if (item.getProductName(name).equals(name)) return "Tìm thấy " + item.getProductName(name);
        }
        return "No product";
    }

    public static String searchById(int id) {
        for (Product item : arrProduct) {
            if (item.getId() == id) return item.toString();
        }
        return "No product";
    
    }
}

