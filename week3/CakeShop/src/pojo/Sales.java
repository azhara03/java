package pojo;

public class Sales {
    private int id;
    private int idCustomer;
    private int idEmployee;
    private String productName;
    private double sum;
    private String date;

    public Sales() {
    }

    public Sales(int id, int idCustomer, int idEmployee, String productName, double sum, String date) {
        this.id = id;
        this.idCustomer = idCustomer;
        this.idEmployee = idEmployee;
        this.productName = productName;
        this.sum = sum;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
