package _12_JavaCollectionFramework.BaiTap.ArrayListLinkedListTrongJavaCollectionFramework;

public class Product {
    private int id = 0;
    private String productName;

    public Product(){}

    public Product(int id,String productName){
        this.id = id;
        this.productName=productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName(String name) {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
