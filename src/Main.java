import helper.JDBC;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        JDBC.openConnection();
        JDBC.closeConnection();
    }
}