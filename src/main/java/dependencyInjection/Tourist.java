package dependencyInjection;

public class Tourist {
    // 依赖注入
    public void tourist(Amusement amusement) {
        System.out.println("(" + this.toString() + "):" +"游玩 " + amusement.getName());
    }
}
