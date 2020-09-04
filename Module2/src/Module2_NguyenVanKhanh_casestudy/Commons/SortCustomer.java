package Module2_NguyenVanKhanh_casestudy.Commons;

import Module2_NguyenVanKhanh_casestudy.Models.Customer;

import java.util.Comparator;

public class SortCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer customer, Customer customer1) {
        if (customer.getHoVaTen().compareTo(customer1.getHoVaTen()) > 0) return 1;
        if (customer.getHoVaTen().compareTo(customer1.getHoVaTen()) == 0) {
            return customer.getNgaySinh().compareTo(customer1.getNgaySinh());
        } else return -1;
    }
}
