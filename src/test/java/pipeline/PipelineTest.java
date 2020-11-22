package pipeline;

import org.junit.Test;

public class PipelineTest {
    @Test
    public  void main() {
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
