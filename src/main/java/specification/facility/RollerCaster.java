package specification.facility;

/**
 * @author nemo
 */
public class RollerCaster extends AbstractFacility {

    public RollerCaster() {
        super(
            "RollerCaster",
            FacilityType.OUTDOOR,
            FacilitySuitableAge.TEENS,
            FacilityThrillLevel.THRILLRIDES
        );
    }
}
