package Model;

public class Product {
    private int id;
    private String nameProduct;
    private String cost;
    private String productDescription;
    private String manufacturer;

    public Product() {
    }

    public Product(int id, String nameProduct, String cost, String productDescription, String manufacturer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.cost = cost;
        this.productDescription = productDescription;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
