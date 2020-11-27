package bridge;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Test for bridge
 * @author Nntraveler
 */
public class BridgeTest extends TestCase {
    @Test
    public void test() {
        // Instantiates Stages and Performances
        BigStage bigStage = new BigStage(new DancePerformance());
        SmallStage smallStage = new SmallStage(new SingPerformance());
        List<Stage> stageList = new ArrayList<>();
        // Add it to stageList
        stageList.add(bigStage);
        stageList.add(smallStage);
        // Do perform
        for(Stage stage: stageList){
            stage.doPerform();
        }
    }
}
