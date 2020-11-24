package objectmother;

/**
 * @Title: FacilitiesObjectMother.java
 * 
 * @Package objectmother
 * 
 * @Description: the object mother of facilities, which is able to generate different facilities
 * 
 * @author Jiajie
 * 
 * @date 2020/11/24
 */
public class FacilitiesObjectMother {

    /**
     *
     * @return: a Power Off Undamaged Electronic Facility
     */
    public static ElectronicFacilities createPowerOffUndamagedElectronicFacilities() {
        ElectronicFacilities electronicFacilities= new ElectronicFacilities();
        electronicFacilities.makePowerOff();
        electronicFacilities.makeClosed();
        return electronicFacilities;
    }

    /**
     *
     * @return: a Power On Undamaged Electronic Facility
     */
    public static ElectronicFacilities createPowerOnUndamagedElectronicFacilities() {
        return new ElectronicFacilities();
    }

    /**
     *
     * @return: a Power Off Damaged Electronic Facility
     */
    public static ElectronicFacilities createPowerOffDamagedElectronicFacilities() {
        ElectronicFacilities electronicFacilities= new ElectronicFacilities();
        electronicFacilities.makePowerOff();
        electronicFacilities.makeDameged();
        electronicFacilities.makeClosed();
        return electronicFacilities;
    }

    /**
     *
     * @return: a Power On Damaged Electronic Facility
     */
    public static ElectronicFacilities createPowerOnDamagedElectronicFacilities() {
        ElectronicFacilities electronicFacilities= new ElectronicFacilities();
        electronicFacilities.makeDameged();
        electronicFacilities.makeClosed();
        return electronicFacilities;
    }

    /**
     *
     * @return: a Undamaged Traditional Facility
     */
    public static TraditionalFacilities createUndamagedTraditionalFacilities() {
        return new TraditionalFacilities();
    }

    /**
     *
     * @return: a Damaged Traditional Facility
     */
    public static TraditionalFacilities createDamagedTraditionalFacilities() {
        TraditionalFacilities traditionalFacilities = new TraditionalFacilities();
        traditionalFacilities.makeDameged();
        traditionalFacilities.makeClosed();
        return traditionalFacilities;
    }
}
