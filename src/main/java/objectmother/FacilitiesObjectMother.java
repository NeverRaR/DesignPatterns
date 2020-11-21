package objectmother;

public class FacilitiesObjectMother {

    public static ElectronicFacilities createPowerOffUndamagedElectronicFacilities() {
        ElectronicFacilities electronicFacilities= new ElectronicFacilities();
        electronicFacilities.makePowerOff();
        electronicFacilities.makeClosed();
        return electronicFacilities;
    }

    public static ElectronicFacilities createPowerOnUndamagedElectronicFacilities() {
        return new ElectronicFacilities();
    }

    public static ElectronicFacilities createPowerOffDamagedElectronicFacilities() {
        ElectronicFacilities electronicFacilities= new ElectronicFacilities();
        electronicFacilities.makePowerOff();
        electronicFacilities.makeDameged();
        electronicFacilities.makeClosed();
        return electronicFacilities;
    }

    public static ElectronicFacilities createPowerOnDamagedElectronicFacilities() {
        ElectronicFacilities electronicFacilities= new ElectronicFacilities();
        electronicFacilities.makeDameged();
        electronicFacilities.makeClosed();
        return electronicFacilities;
    }

    public static TraditionalFacilities createUndamagedTraditionalFacilities() {
        return new TraditionalFacilities();
    }

    public static TraditionalFacilities createDamagedTraditionalFacilities() {
        TraditionalFacilities traditionalFacilities = new TraditionalFacilities();
        traditionalFacilities.makeDameged();
        traditionalFacilities.makeClosed();
        return traditionalFacilities;
    }
}
