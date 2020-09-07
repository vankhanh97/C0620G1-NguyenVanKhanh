package Module2_NguyenVanKhanh_casestudy.Controller;

import Module2_NguyenVanKhanh_casestudy.Models.Customer;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import static Module2_NguyenVanKhanh_casestudy.Controller.MainController.arrayListInfomationCustomer;

public class Cinema {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList;

    static {
        try {
            customerList = arrayListInfomationCustomer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int ticked = 3;
    public static Queue<Customer> customerQueue = new LinkedList<>();

    public static void customerBuyStick() {
        System.out.println("List customer:");
        for (Customer customer : customerList) {
            customer.showInfomationCustomer();
        }
        Customer customer = null;
        if (ticked > 0) {
            System.out.println("Enter the customer buy ticked: ");
            int customerBuyTick = scanner.nextInt();
            for (int i = 1; i <= customerList.size(); i++) {
                if (i == customerBuyTick) {
                    customer = customerList.get(i - 1);
                    customer.showInfomationCustomer();
                }
            }
        }
        customerQueue.add(customer);
        ticked--;
        if (ticked == 0) {
            System.out.println("Sold out");
            System.out.println("List customer buy ticked: ");
            int i = 1;
            for (Customer customers : customerQueue) {
                customers.showInfomationCustomer();
                i++;
            }
        }
    }

    public static void main(String[] args) {
        while (ticked != 0) {
            customerBuyStick();
            System.out.println();
        }
    }
}
