package accounts;

public class Product {
    private String productName;
    private int price;
    private boolean inStock;

    public Product(String productName, int price, boolean inStock) {
        this.productName = productName;
        this.price = price;
        this.inStock = inStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
