public class Main {
    public static void main(String[] args) {
        CustomeManager customeManager = new CustomeManager(new DatabaseLogger());
        customeManager.add();
    }
}
