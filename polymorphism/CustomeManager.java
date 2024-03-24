public class CustomeManager {
    private BaseLogger logger;

    public CustomeManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Added");
        this.logger.log("Log mesajı");
    }
}
