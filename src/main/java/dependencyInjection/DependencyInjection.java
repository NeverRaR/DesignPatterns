package dependencyInjection;

public class DependencyInjection {
    public static void test() {
        Tourist tourist = new Tourist();
        // 游客通过一个接口游玩不同项目
        tourist.tourist(new SnowBowling());
        tourist.tourist(new SnowMobile());
    }
}
