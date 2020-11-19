package publishsubscribe;

public class Vistor {
    //游客可以通过App订阅游玩时间信息，即subscriber
    String name;
    public Vistor(String Name){
        this.name=Name;
    }
    public String getName(){
        return name;
    }
}
