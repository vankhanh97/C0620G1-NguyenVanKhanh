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

    public static void searchByName(String name) {

        for (Product item : arrProduct) {
            if (item.getProductName(name).equals(name)) {
                System.out.println("Tìm thấy " + item.getProductName(name));
            }
        }
    }

    public static void deleteById(int id) {
        arrProduct.remove(id);
        System.out.println("Mảng còn lại: "+"\n"+ arrProduct.toString());
    }
}



