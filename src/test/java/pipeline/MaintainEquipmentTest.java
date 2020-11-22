package pipeline;

import junit.framework.TestCase;

public class MaintainEquipmentTest extends TestCase {

    public void testProcess() {
        System.out.println("PipelineTest:");

        System.out.println("\tCreate a new equipment:");
        Equipment e = new Equipment();
        System.out.println("\t" + e.toString());

        System.out.println("\tCreate a pipeline and execute it with default equipment");
        EquipmentMaintenancePipeline<Equipment, Equipment>
                maintenance = new EquipmentMaintenancePipeline<>
                (new ProhibitEquipment()).addHandler
                (new ExaminEquipment()).addHandler
                (new MaintainEquipment()).addHandler
                (new TestEquipment()).addHandler
                (new CommitEquipment());
        maintenance.execute(e);
        System.out.println("Exit Pipeline Test");
    }
}