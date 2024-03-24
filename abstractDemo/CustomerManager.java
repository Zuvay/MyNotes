public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public void getCustomer(){
        //getCustomer çağıracağımız zaman Main'de istediğimiz sınıfı kullanabilmek için burada
        //bu tanımlamayı yapmamız gerekir. BaseDatabaseManager'i burada belirterek bunu sağlıyoruz.
        databaseManager.getData();
    }
    
}
