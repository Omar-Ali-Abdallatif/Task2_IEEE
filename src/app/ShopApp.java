package app;

import accounts.Customer;
import accounts.Product;

public class ShopApp {
    void main(){

        Customer customer = new Customer(100, 0);

        Product phone = new Product("Phone", 150, true);
        Product book = new Product("Book", 30, false);

        customer.addProduct(phone,customer);
        customer.addProduct(book,customer);

    }
}
