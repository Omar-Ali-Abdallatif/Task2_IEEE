package accounts;

public class Customer {
    private int balance;
    private int items;

    public Customer(int balance, int items) {
        this.balance = balance;
        this.items = items;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public void addProduct (Product product,Customer customer){
        if (product.isInStock()) {
            if (customer.getBalance() >= product.getPrice()) {
                customer.setItems(customer.getItems() + 1);
                customer.setBalance(customer.getBalance() - product.getPrice());
                System.out.println(product.getProductName() + " added to cart");
            }else {
                System.out.println("Not enough balance for " + product.getProductName());
            }
        }else {
            System.out.println(product.getProductName() + " not in stock");
        }
    }
}
