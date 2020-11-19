package dependencyInjection;

public class dependencyInjection {
    public static void test() {
        tourist Tourist = new tourist();
        // 厨师通过一个接口完成不同的菜
        Tourist.Tourist(new snowBowling());
        Tourist.Tourist(new snowMobile());
    }
}
