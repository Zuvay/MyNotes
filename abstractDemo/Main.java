public class Main{
public static void main(String[] args) {
    CustomerManager customerManager = new CustomerManager();
    customerManager.databaseManager = new OracleDatabaseManager(); //bu kısım ilerde ihtiyacımız olduğunda değiştirebileceğimiz kısım
    customerManager.getCustomer();
}
}