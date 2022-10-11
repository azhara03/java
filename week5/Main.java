import java.sql.*;

public class Main {
    static Connection connection = null;
    static PreparedStatement statement = null;

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/cake_shop2", "root", "user2003");
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
        getDataFromProducts();
        getDataFromEmployee();

        addDataToProducts(5, 1, "Pumpkin Chocolate Cake", "0.9 kg", "900 som");
        addDataToProducts(7, 1, "Raspberry Champagne Cake", "1.2 kg", "1300 som");
        System.out.println("After adding records:");
        System.out.println("Products:");
        getDataFromProducts();

        updateDataFromProducts(3,"0.670 kg", "620 som", "Apple Crumble Pie");
        System.out.println("After updating records:");
        System.out.println("Products:");
        getDataFromProducts();

        deleteDataFromEmployee(1);
        System.out.println("Deleted 1 row in table employee:");
        getDataFromEmployee();
    }
    private static void getDataFromProducts() {
        try {
            // MySQL Select Query Tutorial
            String getQueryStatement = "SELECT * FROM product";
            statement = connection.prepareStatement(getQueryStatement);
            // Execute the Query, and get a java ResultSet
            ResultSet rs = statement.executeQuery();
            // Let's iterate through the java ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                int id_category = rs.getInt("id_category");
                String product_name = rs.getString("product_name");
                String weight = rs.getString("weight");
                String cost = rs.getString("cost");
                // Simply Print the results
                System.out.format("%s, %s, %s, %s, %s\n", id, id_category, product_name, weight, cost);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
    private static void getDataFromEmployee() {
        try {
            // MySQL Select Query Tutorial
            String getQueryStatement = "SELECT * FROM employee";
            statement = connection.prepareStatement(getQueryStatement);
            // Execute the Query, and get a java ResultSet
            ResultSet rs = statement.executeQuery();
            // Let's iterate through the java ResultSet
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                // Simply Print the results
                System.out.format("%s, %s\n", id, name);
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
    private static void addDataToProducts(int id, int id_category, String product_name, String weight, String cost) {

        try {
            String insertQueryStatement = "INSERT  INTO  product  VALUES  (?,?,?,?,?)";
            statement = connection.prepareStatement(insertQueryStatement);
            statement.setInt(1, id);
            statement.setInt(2, id_category);
            statement.setString(3, product_name);
            statement.setString(4, weight);
            statement.setString(5, cost);
            // execute insert SQL statement
            statement.executeUpdate();

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
    private static void updateDataFromProducts(int id_category, String weight, String cost, String product_name) {

        try {
            String updateQueryStatement = "UPDATE  product SET id_category  = ?, weight = ?, cost = ? WHERE product_name = ?";
            statement = connection.prepareStatement(updateQueryStatement);
            statement.setInt   (1, id_category);
            statement.setString(2, weight);
            statement.setString(3, cost);
            statement.setString(4, product_name);
            // execute update SQL statement
            statement.executeUpdate();

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteDataFromEmployee(int id) {

        try {
            String deleteQueryStatement = "DELETE FROM employee WHERE id = ?";
            statement = connection.prepareStatement(deleteQueryStatement);
            statement.setInt   (1, id);
            // execute delete SQL statement
            statement.executeUpdate();

        } catch (
                SQLException e) {
            e.printStackTrace();
        }
    }
}
