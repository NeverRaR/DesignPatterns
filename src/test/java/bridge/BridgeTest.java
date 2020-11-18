package bridge;

import java.util.ArrayList;
import java.util.List;

public class BridgeTest {
    public static void main(String[] args) {
        BigStage bigStage = new BigStage(new DancePerformance());
        SmallStage smallStage = new SmallStage(new SingPerformance());
        List<Stage> stageList = new ArrayList<>();
        stageList.add(bigStage);
        stageList.add(smallStage);
        for(Stage stage: stageList){
            stage.doPerform();
        }
    }
}
