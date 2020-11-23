package specification.facility;

/**
 * @author nemo
 */
public interface Facility {
    String getName();
    FacilityType getFacilityType();
    FacilitySuitableAge getFacilitySuitableAge();
    FacilityThrillLevel getFacilityThrillLevel();
}
