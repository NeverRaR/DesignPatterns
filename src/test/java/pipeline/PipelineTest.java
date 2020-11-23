package pipeline;

import junit.framework.TestCase;
import org.junit.Test;

public class PipelineTest extends TestCase {
    @Test
    public  void test() {
        Equipment e = new Equipment();
        System.out.println(e.toString());
        EquipmentMaintenancePipeline <Equipment,Equipment>
                maintenance = new EquipmentMaintenancePipeline<>
                (new ProhibitEquipment()).addHandler
                (new ExaminEquipment()).addHandler
                (new MaintainEquipment()).addHandler
                (new TestEquipment()).addHandler
                (new CommitEquipment());
        maintenance.execute(e);
    }
}
