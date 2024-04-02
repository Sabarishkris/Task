package AbstractClass.product;

public class Product {
    private String productName;
    private String description;
    private long price;

    public Product(String name, String description, long price) {
        this.productName=name;
        this.description=description;
        this.price=price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    public void display(){
        System.out.println("Product Name :" +getProductName());
        System.out.println("Product details : "+getDescription());
        System.out.println("Product price : "+getPrice());
    }
}
