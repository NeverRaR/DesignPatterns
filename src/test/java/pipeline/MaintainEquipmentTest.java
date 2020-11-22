package pipeline;

import org.junit.Test;
/**
 * @author 1851594王思桐
 */
public class MaintainEquipmentTest  {
    @Test
    public void main() {
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