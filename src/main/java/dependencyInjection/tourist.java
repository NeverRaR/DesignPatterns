package dependencyInjection;

public class tourist {
    // 依赖注入
    public void Tourist(amusement Amusement) {
        System.out.println("(" + this.toString() + "):" +"游玩 " + Amusement.getName());
    }
}
