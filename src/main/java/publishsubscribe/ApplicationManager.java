package publishsubscribe;

public class ApplicationManager {
    //游乐园App不同项目游玩信息发布者，即publisher
    String name;

    public ApplicationManager(String Name){
        this.name=Name;
    }
    public String getName(){
        return name;
    }
}
