package pojo;

public class Product {
    private int id;
    private int idCategory;
    private String productName;
    private String weight;
    private String cost;

    public Product() {
    }

    public Product(int id, int idCategory, String productName, String weight, String cost) {
        this.id = id;
        this.idCategory = idCategory;
        this.productName = productName;
        this.weight = weight;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}
